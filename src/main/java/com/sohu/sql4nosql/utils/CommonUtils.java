/**
 * 
 */
package com.sohu.sql4nosql.utils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import com.sohu.sql4nosql.QuerySqlStruct;
import com.sohu.sql4nosql.Sql4nosqlConstants;
import com.sohu.sql4nosql.SqlConstants;



/**
 * this is a utils like commons-lang but more function
 * @author user
 *
 */
public class CommonUtils {

	public static void setProperty(Object obj,String name,Object value){
		try {
			BeanUtils.setProperty(obj, name, value);
		} catch (Exception e) {
			throw new RuntimeException("can not set property value which propertyName:"+name+",value:"+value,e);
		} 
	}
	public static String getPropertyString(Object obj,String name){
		try {
			return BeanUtils.getProperty(obj, name);
		} catch (Exception e) {
			throw new RuntimeException("can not get property string value which propertyName:"+name,e);
		} 
	}
	public static Object getProperty(Object obj,String name){
		try {
			return PropertyUtils.getProperty(obj, name);
		} catch (Exception e) {
			throw new RuntimeException("can not get property value which propertyName:"+name,e);
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
		sqlStruct.setTableName(sqlMap.get(Sql4nosqlConstants.TABLENAME));
		return sqlStruct;
	}
}
