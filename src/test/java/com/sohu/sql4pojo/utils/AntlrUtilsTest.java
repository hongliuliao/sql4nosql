package com.sohu.sql4pojo.utils;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import com.sohu.sql4nosql.QuerySqlStruct;
import com.sohu.sql4nosql.build.QuerySqlLexer;
import com.sohu.sql4nosql.build.QuerySqlParser;

public class AntlrUtilsTest {

	@Test
	public void testBuildSqlStruct() throws RecognitionException {
		QuerySqlLexer lexer = new QuerySqlLexer(new ANTLRStringStream("select name from users order by id desc limit 0 2"));
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		System.out.println(tokens);
		QuerySqlParser parser = new QuerySqlParser(tokens);
		QuerySqlStruct sqlStruct = parser.querySql();
		System.out.println(sqlStruct);
	}

}
