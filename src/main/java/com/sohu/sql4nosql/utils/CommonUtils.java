/**
 * 
 */
package com.sohu.sql4nosql.utils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import com.sohu.sql4nosql.QuerySqlStruct;
import com.sohu.sql4nosql.Sql4nosqlConstants;
import com.sohu.sql4nosql.SqlConstants;



/**
 * @author user
 *
 */
public class CommonUtils {

	public static List<Class<?>> constType=new ArrayList<Class<?>>();
	static{
		constType.add(Long.class);
		constType.add(Integer.class);
		constType.add(Double.class);
		constType.add(Float.class);
		constType.add(java.util.Date.class);
		constType.add(java.sql.Date.class);
		constType.add(String.class);
		constType.add(Boolean.class);
		constType.add(Timestamp.class);
		constType.add(BigDecimal.class);
		constType.add(long.class);
		constType.add(int.class);
		constType.add(double.class);
		constType.add(boolean.class);
		constType.add(float.class);
	}
	public static void setProperty(Object obj,String name,Object value){
		try {
			BeanUtils.setProperty(obj, name, value);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public static String getPropertyString(Object obj,String name){
		try {
			return BeanUtils.getProperty(obj, name);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	public static Object getProperty(Object obj,String name){
		try {
			return PropertyUtils.getProperty(obj, name);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	

	/**
	 * 判断字符串的有效性
	 * @param str 要判断的字符串
	 * @return 是否有效,true:有效
	 */
	public static boolean isValidString(String str){
		return str!=null&&str.trim().length()>0;
	}
	/**
	 * 得到多个小数点格式的字符串的最后一个
	 * @param name 字符串
	 * @return 截取后的字符串
	 */
	public static String getSimpleName(String name){
		if(name.lastIndexOf(".")!=-1){
			String temp=name.substring(name.lastIndexOf(".")+1);
			return temp;
		}else{
			return name;
		}
	}
	/**
	 * 得到多个小数点格式的字符串的最开始一个
	 * @param name 字符串
	 * @return 截取后的字符串
	 */
	public static String getFirstName(String name){
		if(name.indexOf(".")!=-1){
			String temp=name.substring(0,name.indexOf("."));
			return temp;
		}else{
			return name;
		}
	}
	/**
	 * 将查询条件封装的对象转换为map
	 * @param obj
	 * @return map的key为属性名,value为属性值
	 */
	public static Map<String,Object> Object2Map(Object obj){
		return getFieldValueEx(obj,new LinkedHashMap<String,Object>());
	}
	/**
	 * 递归的获得属性对应的值(不同的是层次信息丢失,而且对象不会作为map的主键)
	 * @param obj 要获得值的对象
	 * @param valuesMap 为了递归的实现,建议使用new HashMap();
	 * @return map中key为属性名,value为值
	 */
	private static Map<String,Object> getFieldValueEx(Object obj,Map<String,Object> valuesMap){
		Class<?> clazz=obj.getClass();
		try {
			Field[] fields=clazz.getDeclaredFields();
			for(int i=0;i<fields.length;i++){
				if(constType.contains(fields[i].getType())){
					Object temp=CommonUtils.getPropertyString(obj, fields[i].getName());
					if(temp!=null){
						valuesMap.put(fields[i].getName(), temp);
					}
				}else{
					Object oo=CommonUtils.getPropertyString(obj, fields[i].getName());
					if(oo!=null){
						getFieldValueEx(oo, valuesMap);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valuesMap;
	}
	/**
	 * 根据字段名来获得字段,支持两级
	 * @param clazz 指定要获得字段的类
	 * @param name 字段名,多级用点号隔开
	 * @return 找到的字段,如果没有就为空
	 */
	public static Field getFieldByString(Class<?> clazz,String name){
		try {
			if(name.indexOf(".")==-1){
				return clazz.getDeclaredField(name);
			}
			Field field=clazz.getDeclaredField(name.substring(0,name.indexOf(".")));
			Class<?> cla=field.getType();
			return cla.getDeclaredField(name.substring(name.indexOf(".")+1));
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * 让首字母大写
	 * @param str 要大写的单词
	 * @return 首字母大写后的单词
	 */
	public static String getFirstUpper(String str){
		return str.substring(0, 1).toUpperCase()+str.substring(1);
	}
	public static QuerySqlStruct buildSqlStruct(Map<String,String> sqlMap){
		QuerySqlStruct sqlStruct = new QuerySqlStruct();
		String selectFieldNames = sqlMap.get(Sql4nosqlConstants.SELECTFIELDNAME);
		if(SqlConstants.SIGN_OF_SELECT_ALL.equals(selectFieldNames.trim())){
			sqlStruct.setSelectAll(true);
		}else{
			sqlStruct.setSelectFields(Arrays.asList(selectFieldNames.split(",")));
		}
		sqlStruct.setWhereFieldName(sqlMap.get(Sql4nosqlConstants.WHEREFIELDNAME));
		sqlStruct.setOption(sqlMap.get(Sql4nosqlConstants.OPTION));
		sqlStruct.setFieldValue(sqlMap.get(Sql4nosqlConstants.FIELDVALUE));
		return sqlStruct;
	}
}
