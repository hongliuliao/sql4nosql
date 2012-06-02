grammar QuerySql;

@header{
package com.sohu.sql4nosql;
import java.util.HashMap;
}
@lexer::header{
package com.sohu.sql4nosql;
}

querySql returns [HashMap result]
	:	selectFromStatement (whereStatement)?{
		result = $selectFromStatement.result;
		if($whereStatement.result != null){
			result.putAll($whereStatement.result);
		}
		System.out.println(result);
	};

selectFromStatement returns [HashMap result]
	:	selectStatement fromStatement{
		result = $selectStatement.result;
		result.putAll($fromStatement.result);
	};
selectStatement returns [HashMap result]
	:	SELECT SELECTFIELD {
		$result = new HashMap();
		$result.put("selectFieldName",$SELECTFIELD.text);
	};
fromStatement returns [HashMap result]
	:	FROMSTATEMENT{
		$result = new HashMap();  
		String[] fromStatements = $FROMSTATEMENT.text.split(" ");
		$result.put("tableName",fromStatements[fromStatements.length-1]);
	};
whereStatement returns [HashMap result]
 	:	WHERESATEMENT OPTION FIELDVALUE{
 		$result = new HashMap();
 		String[] whereStatements = $WHERESATEMENT.text.split(" ");
 		$result.put("whereFieldName",whereStatements[whereStatements.length-1]);
 		$result.put("option",$OPTION.text);
 		$result.put("fieldValue",$FIELDVALUE.text);
 	};
	

SELECT:('select'|'SELECT')WS+ ;
SELECTFIELD:('*'|NAME (',' NAME)*) WS+;
fragment NAME:('a'..'z'|'A'..'Z')+;
FROMSTATEMENT	:('from'|'FROM') WS+ NAME;
WHERESATEMENT	:	WS+ ('where'|'WHERE') WS+ NAME ;
OPTION	:	WS? ('>'|'<'|'=') WS?;
FIELDVALUE
	:	('\''NAME'\'')|'0'..'9';
WS : (' ' |'\t' |'\n' |'\r' );