/**
 * 
 */
package com.sohu.sql4nosql.converters;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanMap;

import com.sohu.sql4nosql.QuerySqlStruct;
import com.sohu.sql4nosql.SqlConstants;
import com.sohu.sql4nosql.utils.AntlrUtils;
import com.sohu.sql4nosql.utils.CommonUtils;
import com.sohu.sql4nosql.utils.ReflectObject;

/**
 * @author Administrator
 *
 */
public class Sql4PojoListConverter implements ISql4NosqlConverter{
	
	private List<?> pojoList;
	
	public Sql4PojoListConverter(List<?> pojoList) {
		super();
		this.pojoList = pojoList;
	}
	@SuppressWarnings("unchecked")
	public List<Map<String,?>> queryForList(String sql,Object...params){
		List<Map<String,?>> result = new ArrayList<Map<String,?>>();
		if(pojoList == null || pojoList.size() == 0){
			return result;
		}
		try {
			QuerySqlStruct sqlStruct = AntlrUtils.buildSqlStruct(sql);
			//排序
			if(sqlStruct.orderFieldName != null) {
				sort(pojoList, sqlStruct.orderFieldName, sqlStruct.orderType);
			}
			//先过滤
			pojoList = this.filterPojo(pojoList, sqlStruct);
			if(sqlStruct.isSelectAll()){
				for (Object pojo : pojoList) {
					BeanMap beanMap = new BeanMap(pojo);
					result.add(beanMap);
				}
			}else{
				List<String> fieldNames = sqlStruct.getSelectFields();
				for (Object pojo : pojoList) {
					Map<String, Object> values = new LinkedHashMap<String, Object>();
					for(String fieldName : fieldNames){
						Object value = CommonUtils.getProperty(pojo, fieldName);
						values.put(fieldName, value);
					}
					result.add(values);
				}
			}
			
			int offset = 0;
			if(sqlStruct.offset != null) {
				offset = sqlStruct.offset;
			}
			if(sqlStruct.rowLimit != null) {
				result = result.subList(offset, sqlStruct.rowLimit >= result.size() ? result.size() - 1 : sqlStruct.rowLimit);
			}
		} catch (Exception e) {
			throw new RuntimeException("Get sql map error which sql:"+sql,e);
		}
		return result;
	}
	
	private <T> void sort(List<T> pojoList, final String orderFieldName, final int orderType) {
		Field field = CommonUtils.getFieldByString(pojoList.get(0).getClass(), orderFieldName);
		if(field.getType() != int.class && field.getType() != long.class && !Number.class.isAssignableFrom(field.getType())) {
			throw new IllegalArgumentException("Only number type is support order!");
		}
		Collections.sort(pojoList, new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				Long v1 = new ReflectObject(o1).getLong(orderFieldName);
				Long v2 = new ReflectObject(o2).getLong(orderFieldName);
				if(v1 == null || v2 == null) {
					return 0;
				}
				return new Long(v1 - v2).intValue();
			}
		});
		if(orderType == 1) {
			Collections.reverse(pojoList);
		}
	}
	
	private <T> List<T> filterPojo(List<T> pojoList,QuerySqlStruct querySqlStruct){
		//如果没有where语句就直接把原来的返回
		if(!CommonUtils.isValidString(querySqlStruct.getWhereFieldName())){
			return pojoList;
		}
		List<T> filteredPojos = new ArrayList<T>();
		String queryWhereFieldValue = querySqlStruct.getFieldValue();
		if(queryWhereFieldValue.indexOf("'") != -1){//如果查询的是字符串类型的要去掉两个引号
			queryWhereFieldValue = queryWhereFieldValue.replaceAll("'", "");
		}
		for (T pojo : pojoList) {
			Object pojoWhereFieldValue = CommonUtils.getProperty(pojo, querySqlStruct.getWhereFieldName());
			if(pojoWhereFieldValue == null){
				continue;
			}
			if(SqlConstants.SIGN_OF_EQUAL.equals(querySqlStruct.getOption())){
				if(queryWhereFieldValue.equals(pojoWhereFieldValue)){
					filteredPojos.add(pojo);
				}
			}
		}
		return filteredPojos;
	}
	
}
