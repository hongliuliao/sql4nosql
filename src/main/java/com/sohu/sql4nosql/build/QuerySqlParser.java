// $ANTLR 3.4 /E:/workspace/sql4nosql/target/classes/QuerySql.g 2013-04-26 18:22:13

package com.sohu.sql4nosql.build;

import java.util.Arrays;
import com.sohu.sql4nosql.QuerySqlStruct;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QuerySqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FIELDVALUE", "FROMSTATEMENT", "NAME", "OPTION", "SELECT", "SELECTFIELD", "WHERESATEMENT", "WS"
    };

    public static final int EOF=-1;
    public static final int FIELDVALUE=4;
    public static final int FROMSTATEMENT=5;
    public static final int NAME=6;
    public static final int OPTION=7;
    public static final int SELECT=8;
    public static final int SELECTFIELD=9;
    public static final int WHERESATEMENT=10;
    public static final int WS=11;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public QuerySqlParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public QuerySqlParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return QuerySqlParser.tokenNames; }
    public String getGrammarFileName() { return "/E:/workspace/sql4nosql/target/classes/QuerySql.g"; }



    // $ANTLR start "querySql"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:13:1: querySql returns [QuerySqlStruct result = new QuerySqlStruct()] : selectFromStatement[result] ( whereStatement[result] )? ;
    public final QuerySqlStruct querySql() throws RecognitionException {
        QuerySqlStruct result =  new QuerySqlStruct();


        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:2: ( selectFromStatement[result] ( whereStatement[result] )? )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:4: selectFromStatement[result] ( whereStatement[result] )?
            {
            pushFollow(FOLLOW_selectFromStatement_in_querySql27);
            selectFromStatement(result);

            state._fsp--;


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:32: ( whereStatement[result] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==WHERESATEMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:33: whereStatement[result]
                    {
                    pushFollow(FOLLOW_whereStatement_in_querySql31);
                    whereStatement(result);

                    state._fsp--;


                    }
                    break;

            }



            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "querySql"



    // $ANTLR start "selectFromStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:17:1: selectFromStatement[QuerySqlStruct result] : selectStatement[result] fromStatement[result] ;
    public final void selectFromStatement(QuerySqlStruct result) throws RecognitionException {
        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:18:2: ( selectStatement[result] fromStatement[result] )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:18:4: selectStatement[result] fromStatement[result]
            {
            pushFollow(FOLLOW_selectStatement_in_selectFromStatement46);
            selectStatement(result);

            state._fsp--;


            pushFollow(FOLLOW_fromStatement_in_selectFromStatement49);
            fromStatement(result);

            state._fsp--;



            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "selectFromStatement"



    // $ANTLR start "selectStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:20:1: selectStatement[QuerySqlStruct result] : SELECT SELECTFIELD ;
    public final void selectStatement(QuerySqlStruct result) throws RecognitionException {
        Token SELECTFIELD1=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:21:2: ( SELECT SELECTFIELD )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:21:4: SELECT SELECTFIELD
            {
            match(input,SELECT,FOLLOW_SELECT_in_selectStatement61); 

            SELECTFIELD1=(Token)match(input,SELECTFIELD,FOLLOW_SELECTFIELD_in_selectStatement63); 


            		String selectFieldNames = (SELECTFIELD1!=null?SELECTFIELD1.getText():null);
            		result.selectFields = Arrays.asList(selectFieldNames.split(","));
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "selectStatement"



    // $ANTLR start "fromStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:25:1: fromStatement[QuerySqlStruct result] : FROMSTATEMENT ;
    public final void fromStatement(QuerySqlStruct result) throws RecognitionException {
        Token FROMSTATEMENT2=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:26:2: ( FROMSTATEMENT )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:26:4: FROMSTATEMENT
            {
            FROMSTATEMENT2=(Token)match(input,FROMSTATEMENT,FOLLOW_FROMSTATEMENT_in_fromStatement75); 


            		String[] fromStatements = (FROMSTATEMENT2!=null?FROMSTATEMENT2.getText():null).split(" ");
            		result.tableName = fromStatements[fromStatements.length-1];
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "fromStatement"



    // $ANTLR start "whereStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:30:1: whereStatement[QuerySqlStruct result] : WHERESATEMENT OPTION FIELDVALUE ;
    public final void whereStatement(QuerySqlStruct result) throws RecognitionException {
        Token WHERESATEMENT3=null;
        Token OPTION4=null;
        Token FIELDVALUE5=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:31:3: ( WHERESATEMENT OPTION FIELDVALUE )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:31:5: WHERESATEMENT OPTION FIELDVALUE
            {
            WHERESATEMENT3=(Token)match(input,WHERESATEMENT,FOLLOW_WHERESATEMENT_in_whereStatement87); 

            OPTION4=(Token)match(input,OPTION,FOLLOW_OPTION_in_whereStatement89); 

            FIELDVALUE5=(Token)match(input,FIELDVALUE,FOLLOW_FIELDVALUE_in_whereStatement91); 


             		String[] whereStatements = (WHERESATEMENT3!=null?WHERESATEMENT3.getText():null).split(" ");
             		result.whereFieldName = whereStatements[whereStatements.length-1];
             		result.option = (OPTION4!=null?OPTION4.getText():null);
             		result.fieldValue = (FIELDVALUE5!=null?FIELDVALUE5.getText():null);
             	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whereStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_selectFromStatement_in_querySql27 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_whereStatement_in_querySql31 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_selectFromStatement46 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_fromStatement_in_selectFromStatement49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectStatement61 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SELECTFIELD_in_selectStatement63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROMSTATEMENT_in_fromStatement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERESATEMENT_in_whereStatement87 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_OPTION_in_whereStatement89 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_FIELDVALUE_in_whereStatement91 = new BitSet(new long[]{0x0000000000000002L});

}