package com.sohu.sql4pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class Sql4PojoListConverterTest {
	public List<MockUser> users = new ArrayList<MockUser>();
	private Sql4PojoListConverter converter;
	@Before
	public void init() {
		users = Arrays.asList(new MockUser(1,"tom",new Date()),new MockUser(2,"jerry",new Date()));
		converter = new Sql4PojoListConverter(users);
	}
	@Test
	public void testQueryFromPojoList_selectAll() throws Exception {
		List<Map<String, ?>> result = converter.queryForList("select * from users");
		System.out.println("testQueryFromPojoList_selectAll:"+result);
	} 
	@Test
	public void testQueryFromPojoList_selectOne() throws Exception {
		List<Map<String, ?>> result = converter.queryForList("select name from users");
		System.out.println("testQueryFromPojoList_selectOne:"+result);
	} 
	@Test
	public void testQueryFromPojoList_selectSome() throws Exception {
		List<Map<String, ?>> result = converter.queryForList("select id,name from users where name='tom'");
		System.out.println("testQueryFromPojoList_selectSome:" + result);
	} 
}
