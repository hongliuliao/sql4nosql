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
	:	selectFromStatement[result] (whereStatement[result])? limitStatement[result]?{
	};

selectFromStatement [QuerySqlStruct result]
	:	selectStatement[result] fromStatement[result]{
	};
selectStatement [QuerySqlStruct result]
	:	SELECT ('*'|selectFieldName[result] (',' selectFieldName[result])*) WS+ ;
selectFieldName [QuerySqlStruct result]
	:	NAME {
		$result.selectFields.add($NAME.text);
	};
fromStatement [QuerySqlStruct result]
	:	FROM NAME WS?{
		$result.tableName = $NAME.text;
	};
whereStatement [QuerySqlStruct result]
 	:	WHERESATEMENT OPTION FIELDVALUE{
 		String[] whereStatements = $WHERESATEMENT.text.split(" ");
 		$result.whereFieldName = whereStatements[whereStatements.length-1];
 		$result.option = $OPTION.text;
 		$result.fieldValue = $FIELDVALUE.text;
 	};
	
limitStatement [QuerySqlStruct result]
	:	 LIMIT OFFSET? INT {
		result.offset = Integer.parseInt($OFFSET.text.trim());
		result.rowLimit = Integer.parseInt($INT.text);
	};

SELECT:('select'|'SELECT')WS+ ;
LIMIT :  WS+ ('limit'|'LIMIT') WS+;
FROM : ('from'|'FROM') WS+;
WHERE : WS+ ('where'|'WHERE') WS+;

INT : ('0'..'9')+;
FIELDVALUE :	('\''NAME'\'')|INT;
NAME:('a'..'z'|'A'..'Z'|'_')+ ;
WHERESATEMENT	: WHERE NAME ;
OPTION	:	WS? ('>'|'<'|'=') WS?;
WS : (' ' |'\t' |'\n' |'\r' );
OFFSET : INT WS+;
