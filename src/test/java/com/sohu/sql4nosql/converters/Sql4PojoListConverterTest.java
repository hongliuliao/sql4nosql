package com.sohu.sql4nosql.converters;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.sohu.sql4nosql.converters.Sql4PojoListConverter;

public class Sql4PojoListConverterTest {
	public List<MockUser> users = new ArrayList<MockUser>();
	private Sql4PojoListConverter converter;
	@Before
	public void init() {
		users.add(new MockUser(1,"tom",new Date()));
		users.add(new MockUser(2,"jerry",new Date()));
		users.add(new MockUser(3,"jim",new Date()));
		converter = new Sql4PojoListConverter(users);
	}
	@Test
	public void testQueryForList_selectOne() throws Exception {
		List<Map<String, ?>> result = converter.queryForList("select name from users limit 0 2");
		System.out.println("testQueryForList_selectOne:"+result);
	} 
	@Test
	public void testQueryForList_selectSome() throws Exception {
		List<Map<String, ?>> result = converter.queryForList("select id,name from users where name='tom'");
		System.out.println("testQueryForList_selectSome:" + result);
	} 
}
