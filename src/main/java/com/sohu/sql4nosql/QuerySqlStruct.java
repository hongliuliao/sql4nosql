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
	
	public List<String> groupByFields = new ArrayList<String>();
	
	public String orderFieldName;
	
	/**
	 * 0 表示升序,1表示降序
	 */
	public int orderType;
	
	public Integer offset;
	
	public Integer rowLimit;
	
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
		return selectFields;
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
