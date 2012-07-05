/**
 * 
 */
package com.sohu.sql4pojo;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sohu.sql4text.Sql4TextFileConverter;

/**
 * @author liaohongliu
 *
 * 2012-2-23 ����10:27:31
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
	public void testQueryForTextFile() throws UnsupportedEncodingException{
		List<String> result = this.converter.queryForTextFile("select id,userName from Users where id=2");
		System.out.println(result);
	}
}
