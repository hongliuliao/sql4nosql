/**
 * $Id$
 */
package com.sohu.sql4nosql.converters;

import org.junit.Test;

import com.sohu.sql4nosql.converters.Sql4mongoConverter;

/**
 * 
 * @author hongliuliao
 *
 * CreateDate:2012-7-19 обнГ01:36:41
 */
public class Sql4mongoConverterTest {
	Sql4mongoConverter sql4mongo = new Sql4mongoConverter("localhost", 27017, "test");
	/**
	 * Test method for {@link com.sohu.sql4nosql.converters.Sql4mongoConverter#queryForList(java.lang.String, java.lang.Object[])}.
	 */
	@Test
	public void testQueryForList() {
		sql4mongo.queryForList("select * from tb_users where name='tom'");
	}

}
