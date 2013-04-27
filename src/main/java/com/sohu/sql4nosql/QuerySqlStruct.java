/**
 * 
 */
package com.sohu.sql4nosql;

import java.util.ArrayList;
import java.util.List;

/**
 * the struct of the query sql
 * @author Administrator
 *
 */
public class QuerySqlStruct {
	/**
	 * 是否是查询所有
	 */
	public boolean selectAll;
	/**
	 * 查询的字段
	 */
	public List<String> selectFields = new ArrayList<String>();
	/**
	 * filt field name
	 */
	public String whereFieldName;
	/**
	 * the option char on field ,for example > < = etc.
	 */
	public String option;
	/**
	 * the filt value
	 */
	public String fieldValue;
	/**
	 * Select table's name
	 */
	public String tableName;
	
	public int offset;
	
	public int rowLimit;
	
	public String getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getWhereFieldName() {
		return whereFieldName;
	}
	public void setWhereFieldName(String whereFieldName) {
		this.whereFieldName = whereFieldName;
	}
	public boolean isSelectAll() {
		return selectAll;
	}
	public void setSelectAll(boolean selectAll) {
		this.selectAll = selectAll;
	}
	public List<String> getSelectFields() {
		if(this.selectFields == null){
			return null;
		}
		List<String> fields = new ArrayList<String>();//保存去除空格之后的字段名
		for(String fieldName : selectFields){
			fields.add(fieldName.trim());
		}
		return fields;
	}
	public void setSelectFields(List<String> selectFields) {
		this.selectFields = selectFields;
	}
	public boolean hasWhere(){
		return this.getWhereFieldName()!=null && !this.getWhereFieldName().trim().equals("");
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
}
