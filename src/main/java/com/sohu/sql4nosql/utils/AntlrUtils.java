/**
 * 
 */
package com.sohu.sql4nosql.utils;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

import com.sohu.sql4nosql.QuerySqlStruct;
import com.sohu.sql4nosql.build.QuerySqlLexer;
import com.sohu.sql4nosql.build.QuerySqlParser;

/**
 * @author liaohongliu
 *
 * 2012-2-23 下午09:35:10
 */
public class AntlrUtils {
	
	public static QuerySqlStruct buildSqlStruct(String sql){
		try {
			QuerySqlLexer lexer = new QuerySqlLexer(new ANTLRStringStream(sql));
			CommonTokenStream tokens = new CommonTokenStream(lexer); 
			QuerySqlParser parser = new QuerySqlParser(tokens);
			QuerySqlStruct sqlStruct = parser.querySql();
			return sqlStruct;
		} catch (Exception e) {
			throw new RuntimeException("build sql struct error which sql:"+sql,e);
		}
		
	}
	
	public static void main(String[] args) {
		QuerySqlLexer lexer = new QuerySqlLexer(new ANTLRStringStream("select name from users limit 0 1"));
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		System.out.println(tokens);
	}
}
