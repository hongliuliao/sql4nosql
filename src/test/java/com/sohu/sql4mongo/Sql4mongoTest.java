/**
 * $Id$
 */
package com.sohu.sql4mongo;

import org.junit.Test;

/**
 * 
 * @author hongliuliao
 *
 * CreateDate:2012-7-19 обнГ01:36:41
 */
public class Sql4mongoTest {
	Sql4mongo sql4mongo = new Sql4mongo("localhost", 27017, "test");
	/**
	 * Test method for {@link com.sohu.sql4mongo.Sql4mongo#queryForList(java.lang.String, java.lang.Object[])}.
	 */
	@Test
	public void testQueryForList() {
		sql4mongo.queryForList("select * from tb_users where name='tom'");
	}

}
