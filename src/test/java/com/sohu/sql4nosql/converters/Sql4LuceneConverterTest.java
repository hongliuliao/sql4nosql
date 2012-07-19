/**
 * $Id$
 */
package com.sohu.sql4nosql.converters;

import org.junit.Test;

/**
 * 
 * @author hongliuliao
 *
 * CreateDate:2012-7-19 обнГ06:00:52
 */
public class Sql4LuceneConverterTest {

	Sql4LuceneConverter sql4LuceneConverter = new Sql4LuceneConverter("d:/lucenetest/index");
	/**
	 * Test method for {@link com.sohu.sql4nosql.converters.Sql4LuceneConverter#queryForList(java.lang.String, java.lang.Object[])}.
	 */
	@Test
	public void testQueryForList() {
		sql4LuceneConverter.queryForList("select * from lucenes_index where id=2");
	}

}
