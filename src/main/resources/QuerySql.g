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
		groupbyStatement[result]?
		orderStatement[result]? limitStatement[result]?;

selectFromStatement [QuerySqlStruct result]
	:	selectStatement[result] FROM NAME {
		$result.tableName = $NAME.text;
	};
selectStatement [QuerySqlStruct result]
	:	SELECT (SELECT_ALL|selectFieldName[result] (COMMA selectFieldName[result])*) ;
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
	:	((SINGLE_QUOTES NAME SINGLE_QUOTES)|INT) {
		if($NAME.text != null) {
			$result.fieldValue = $NAME.text;
		} else {
			$result.fieldValue = $INT.text;
		}
	};
groupbyStatement [QuerySqlStruct result]
	:	GROUP_BY groupName = NAME{
		result.groupByFields.add($groupName.text);
	}(COMMA groupName = NAME{
		result.groupByFields.add($groupName.text);
	})*;
orderStatement [QuerySqlStruct result]
	:	ORDERBY NAME order[result]? {
		result.orderFieldName = $NAME.text;
	};
order [QuerySqlStruct result]
	:	DESC{
		result.orderType = 1;
	}|ASC ;
limitStatement [QuerySqlStruct result]
	:	 LIMIT offset=INT? rowLimit=INT {
		if($offset.text != null) {
			result.offset = Integer.parseInt($offset.text.trim());
		}
		result.rowLimit = Integer.parseInt($rowLimit.text);
	};

// more small range more prior
SELECT:('select'|'SELECT');
LIMIT :  ('limit'|'LIMIT') ;
FROM : ('from'|'FROM') ;
WHERE : ('where'|'WHERE') ;
GROUP_BY : 'group by'|'GROUP BY';
ORDERBY :  ('order by'|'ORDER BY') ;
DESC : ('desc'|'DESC');
ASC	: ('asc'|'ASC');

SINGLE_QUOTES : '\'';
SELECT_ALL : '*';
COMMA : ',';
INT : ('0'..'9')+;
NAME:('a'..'z'|'A'..'Z'|'_')+ ;
OPTION	:	('>'|'<'|'=');
WS : (' ' |'\t' |'\n' |'\r' ){skip();};
