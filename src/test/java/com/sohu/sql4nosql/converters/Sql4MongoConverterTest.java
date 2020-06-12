/**
 * $Id$
 */
package com.sohu.sql4nosql.converters;

//import org.junit.Test;

import com.sohu.sql4nosql.converters.Sql4MongoConverter;

/**
 * 
 * @author hongliuliao
 *
 * CreateDate:2012-7-19 下午01:36:41
 */
public class Sql4MongoConverterTest {
	Sql4MongoConverter sql4mongo = new Sql4MongoConverter("localhost", 27017, "tb_users");
	/**
	 * Test method for {@link com.sohu.sql4nosql.converters.Sql4MongoConverter#queryForList(java.lang.String, java.lang.Object[])}.
	 */
	//@Test
	public void testQueryForList() {
		sql4mongo.queryForList("select * from tb_users where name='tom'");
	}

}
