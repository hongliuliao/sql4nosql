/**
 * 
 */
package com.sohu.sql4pojo.build;

import java.io.UnsupportedEncodingException;

/**
 * @author liaohongliu
 *
 * 2012-6-2 ионГ1:29:46
 */
public class Builder {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String filePath = ClassLoader.getSystemResource("QuerySql.g").getFile();
		filePath = java.net.URLDecoder.decode(filePath, "gbk");
		org.antlr.Tool.main(new String[] {"-o","src/main/java/com/sohu/sql4nosql",filePath});
	}
}
