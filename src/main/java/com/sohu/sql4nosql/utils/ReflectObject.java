/**
 * 
 */
package com.sohu.sql4nosql.utils;

import org.apache.commons.beanutils.ConvertUtils;

/**
 * 
 * @author liaohongliu
 *
 * 创建日期:2013-4-27 下午6:55:36
 */
public class ReflectObject {

	private Object obj;
	
	public ReflectObject(Object obj) {
		this.obj = obj;
	}
	
	public Long getLong(String name) {
		return (Long) ConvertUtils.convert(CommonUtils.getProperty(obj, name), Long.class);
	}
}
