/**
 * 
 */
package com.sohu.sql4nosql.converters;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sohu.sql4nosql.converters.Sql4TextFileConverter;

/**
 * @author liaohongliu
 *
 * 2012-2-23 下午10:27:31
 */
public class Sql4TextFileConverterTest {
	Sql4TextFileConverter converter ;
	@Before
	public void init() throws UnsupportedEncodingException {
		String testFilePath = ClassLoader.getSystemResource("Users.txt").getFile();
		testFilePath = java.net.URLDecoder.decode(testFilePath, "gbk");
		converter = new Sql4TextFileConverter(new String[]{"id","userName","birthday"},testFilePath);
	}
	@Test
	public void d() throws UnsupportedEncodingException{
		List<String> result = this.converter.queryForList("select id,userName from Users where id=2");
		assertTrue(result.size() == 1);
		System.out.println(result);
	}
}
