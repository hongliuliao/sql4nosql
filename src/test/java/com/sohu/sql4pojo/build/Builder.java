/**
 * 
 */
package com.sohu.sql4pojo.build;

/**
 * @author liaohongliu
 *
 * 2012-6-2 ионГ1:29:46
 */
public class Builder {
	public static void main(String[] args) {
		String path = ClassLoader.getSystemResource("QuerySql.g").getFile();
		org.antlr.Tool.main(new String[] {"-o","src/main/java/com/sohu/sql4nosql",path});
	}
}
