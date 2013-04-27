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
	:	selectFromStatement[result] whereStatement[result]? 
		orderStatement[result]? limitStatement[result]?;

selectFromStatement [QuerySqlStruct result]
	:	selectStatement[result] FROM NAME WS?{
		$result.tableName = $NAME.text;
	};
selectStatement [QuerySqlStruct result]
	:	SELECT ('*'|selectFieldName[result] (',' selectFieldName[result])*) WS+ ;
selectFieldName [QuerySqlStruct result]
	:	NAME {
		$result.selectFields.add($NAME.text);
	};
whereStatement [QuerySqlStruct result]
 	:	WHERE NAME OPTION fieldValue[result] {
 		$result.whereFieldName = $NAME.text;
 		$result.option = $OPTION.text;
 	};
fieldValue [QuerySqlStruct result]
	:	(('\''NAME'\'')|INT) {
		if($NAME.text != null) {
			$result.fieldValue = $NAME.text;
		} else {
			$result.fieldValue = $INT.text;
		}
	};

orderStatement [QuerySqlStruct result]
	:	ORDERBY NAME (WS+ (DESC|ASC?))? {
		result.orderFieldName = $NAME.text;
		if($DESC.text != null) {
			result.orderType = 1;
		}
	};
limitStatement [QuerySqlStruct result]
	:	 LIMIT OFFSET? INT {
		if($OFFSET.text != null) {
			result.offset = Integer.parseInt($OFFSET.text.trim());
		}
		result.rowLimit = Integer.parseInt($INT.text);
	};

// more small range more prior
SELECT:('select'|'SELECT')WS+ ;
LIMIT :  WS+ ('limit'|'LIMIT') WS+;
FROM : ('from'|'FROM') WS+;
WHERE : WS+ ('where'|'WHERE') WS+;
ORDERBY : WS+ ('order by'|'ORDER BY') WS+;
DESC : ('desc'|'DESC');
ASC	: ('asc'|'ASC');

INT : ('0'..'9')+;
NAME:('a'..'z'|'A'..'Z'|'_')+ ;
OPTION	:	WS? ('>'|'<'|'=') WS?;
WS : (' ' |'\t' |'\n' |'\r' );
OFFSET : INT WS+;
