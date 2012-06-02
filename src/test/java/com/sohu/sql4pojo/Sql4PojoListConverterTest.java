package com.sohu.sql4pojo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Sql4PojoListConverterTest {
	Sql4PojoListConverter converter = new Sql4PojoListConverter();
	@Test
	public void testQueryFromPojoList_selectAll() throws Exception {
		List<MockUser> users = Arrays.asList(new MockUser(1,"tom",new Date()),new MockUser(2,"jerry",new Date()));
		List<Map<String, ?>> result = converter.queryFromPojoList("select * from users", users);
		System.out.println("testQueryFromPojoList_selectAll:"+result);
	} 
	@Test
	public void testQueryFromPojoList_selectOne() throws Exception {
		List<MockUser> users = Arrays.asList(new MockUser(1,"tom",new Date()),new MockUser(2,"jerry",new Date()));
		List<Map<String, ?>> result = converter.queryFromPojoList("select name from users", users);
		System.out.println("testQueryFromPojoList_selectOne:"+result);
	} 
	@Test
	public void testQueryFromPojoList_selectSome() throws Exception {
		List<MockUser> users = Arrays.asList(new MockUser(1,"tom",new Date()),new MockUser(2,"jerry",new Date()));
		List<Map<String, ?>> result = converter.queryFromPojoList("select id,name from users where name='tom'", users);
		System.out.println("testQueryFromPojoList_selectSome:" + result);
	} 
}
