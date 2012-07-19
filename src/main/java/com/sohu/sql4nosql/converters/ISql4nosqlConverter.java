/**
 * $Id$
 */
package com.sohu.sql4nosql.converters;

import java.util.List;

/**
 * Query the records by sql
 * @author hongliuliao
 *
 * CreateDate:2012-7-5 обнГ06:17:15
 */
public interface ISql4nosqlConverter {
	/**
	 * Query the records which match with sql
	 * @param sql the sql for query records
	 * @param params the params for sql
	 * @return the list which query by sql
	 */
	public List<?> queryForList(String sql,Object...params);
}
