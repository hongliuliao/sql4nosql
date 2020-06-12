package com.sohu.sql4nosql.converters;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.sohu.sql4nosql.converters.Sql4PojoListConverter;

import junit.framework.Assert;

public class Sql4PojoListConverterTest {
	public List<MockUser> users = new ArrayList<MockUser>();
	private Sql4PojoListConverter converter;
	@Before
	public void init() {
		users.add(new MockUser(1,"tom",new Date()));
		users.add(new MockUser(2,"jerry",new Date()));
		users.add(new MockUser(3,"yam",new Date()));
		converter = new Sql4PojoListConverter(users);
	}
	@Test
	public void testQueryForList() throws Exception {
		List<Map<String, ?>> result = converter.queryForList("select name from users order by id desc limit 0 2");
		System.out.println("testQueryForList_selectOne:"+result);
		Assert.assertTrue(result.size() > 1);
		
		List<Map<String, ?>> result2 = converter.queryForList("select id,name from users where name='tom'");
		System.out.println("testQueryForList_selectSome:" + result2);
		Assert.assertEquals(1, result2.size());
		
		List<Map<String, ?>> result3 = converter.queryForList("select id,name from users where name='nobody'");
		System.out.println("testQueryForList_select_no:" + result3);
		Assert.assertEquals(0, result3.size());
	} 
	
}
