grammar QuerySql;

@header{
package com.sohu.sql4nosql.build;

import java.util.Arrays;
import com.sohu.sql4nosql.QuerySqlStruct;
}
@lexer::header{
package com.sohu.sql4nosql.build;
}

querySql returns [QuerySqlStruct result = new QuerySqlStruct()]
	:	selectFromStatement[result] (whereStatement[result])?{
	};

selectFromStatement [QuerySqlStruct result]
	:	selectStatement[result] fromStatement[result]{
	};
selectStatement [QuerySqlStruct result]
	:	SELECT SELECTFIELD {
		String selectFieldNames = $SELECTFIELD.text;
		$result.selectFields = Arrays.asList(selectFieldNames.split(","));
	};
fromStatement [QuerySqlStruct result]
	:	FROMSTATEMENT{
		String[] fromStatements = $FROMSTATEMENT.text.split(" ");
		$result.tableName = fromStatements[fromStatements.length-1];
	};
whereStatement [QuerySqlStruct result]
 	:	WHERESATEMENT OPTION FIELDVALUE{
 		String[] whereStatements = $WHERESATEMENT.text.split(" ");
 		$result.whereFieldName = whereStatements[whereStatements.length-1];
 		$result.option = $OPTION.text;
 		$result.fieldValue = $FIELDVALUE.text;
 	};
	

SELECT:('select'|'SELECT')WS+ ;
SELECTFIELD:('*'|NAME (',' NAME)*) WS+;
fragment NAME:('a'..'z'|'A'..'Z'|'_')+;
FROMSTATEMENT	:('from'|'FROM') WS+ NAME;
WHERESATEMENT	:	WS+ ('where'|'WHERE') WS+ NAME ;
OPTION	:	WS? ('>'|'<'|'=') WS?;
FIELDVALUE
	:	('\''NAME'\'')|'0'..'9';
WS : (' ' |'\t' |'\n' |'\r' );