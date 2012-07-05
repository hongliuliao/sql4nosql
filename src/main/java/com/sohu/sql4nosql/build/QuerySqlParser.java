// $ANTLR 3.4 /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g 2012-07-05 18:29:41

package com.sohu.sql4nosql.build;
import java.util.HashMap;


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
    public String getGrammarFileName() { return "/C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g"; }



    // $ANTLR start "querySql"
    // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:11:1: querySql returns [HashMap result] : selectFromStatement ( whereStatement )? ;
    public final HashMap querySql() throws RecognitionException {
        HashMap result = null;


        HashMap selectFromStatement1 =null;

        HashMap whereStatement2 =null;


        try {
            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:12:2: ( selectFromStatement ( whereStatement )? )
            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:12:4: selectFromStatement ( whereStatement )?
            {
            pushFollow(FOLLOW_selectFromStatement_in_querySql27);
            selectFromStatement1=selectFromStatement();

            state._fsp--;


            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:12:24: ( whereStatement )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==WHERESATEMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:12:25: whereStatement
                    {
                    pushFollow(FOLLOW_whereStatement_in_querySql30);
                    whereStatement2=whereStatement();

                    state._fsp--;


                    }
                    break;

            }



            		result = selectFromStatement1;
            		if(whereStatement2 != null){
            			result.putAll(whereStatement2);
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
    // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:19:1: selectFromStatement returns [HashMap result] : selectStatement fromStatement ;
    public final HashMap selectFromStatement() throws RecognitionException {
        HashMap result = null;


        HashMap selectStatement3 =null;

        HashMap fromStatement4 =null;


        try {
            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:20:2: ( selectStatement fromStatement )
            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:20:4: selectStatement fromStatement
            {
            pushFollow(FOLLOW_selectStatement_in_selectFromStatement46);
            selectStatement3=selectStatement();

            state._fsp--;


            pushFollow(FOLLOW_fromStatement_in_selectFromStatement48);
            fromStatement4=fromStatement();

            state._fsp--;



            		result = selectStatement3;
            		result.putAll(fromStatement4);
            	

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
    // $ANTLR end "selectFromStatement"



    // $ANTLR start "selectStatement"
    // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:24:1: selectStatement returns [HashMap result] : SELECT SELECTFIELD ;
    public final HashMap selectStatement() throws RecognitionException {
        HashMap result = null;


        Token SELECTFIELD5=null;

        try {
            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:25:2: ( SELECT SELECTFIELD )
            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:25:4: SELECT SELECTFIELD
            {
            match(input,SELECT,FOLLOW_SELECT_in_selectStatement61); 

            SELECTFIELD5=(Token)match(input,SELECTFIELD,FOLLOW_SELECTFIELD_in_selectStatement63); 


            		result = new HashMap();
            		result.put("selectFieldName",(SELECTFIELD5!=null?SELECTFIELD5.getText():null));
            	

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
    // $ANTLR end "selectStatement"



    // $ANTLR start "fromStatement"
    // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:29:1: fromStatement returns [HashMap result] : FROMSTATEMENT ;
    public final HashMap fromStatement() throws RecognitionException {
        HashMap result = null;


        Token FROMSTATEMENT6=null;

        try {
            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:30:2: ( FROMSTATEMENT )
            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:30:4: FROMSTATEMENT
            {
            FROMSTATEMENT6=(Token)match(input,FROMSTATEMENT,FOLLOW_FROMSTATEMENT_in_fromStatement77); 


            		result = new HashMap();  
            		String[] fromStatements = (FROMSTATEMENT6!=null?FROMSTATEMENT6.getText():null).split(" ");
            		result.put("tableName",fromStatements[fromStatements.length-1]);
            	

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
    // $ANTLR end "fromStatement"



    // $ANTLR start "whereStatement"
    // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:35:1: whereStatement returns [HashMap result] : WHERESATEMENT OPTION FIELDVALUE ;
    public final HashMap whereStatement() throws RecognitionException {
        HashMap result = null;


        Token WHERESATEMENT7=null;
        Token OPTION8=null;
        Token FIELDVALUE9=null;

        try {
            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:36:3: ( WHERESATEMENT OPTION FIELDVALUE )
            // /C:/Users/Default/git/sql4nosql/target/classes/QuerySql.g:36:5: WHERESATEMENT OPTION FIELDVALUE
            {
            WHERESATEMENT7=(Token)match(input,WHERESATEMENT,FOLLOW_WHERESATEMENT_in_whereStatement91); 

            OPTION8=(Token)match(input,OPTION,FOLLOW_OPTION_in_whereStatement93); 

            FIELDVALUE9=(Token)match(input,FIELDVALUE,FOLLOW_FIELDVALUE_in_whereStatement95); 


             		result = new HashMap();
             		String[] whereStatements = (WHERESATEMENT7!=null?WHERESATEMENT7.getText():null).split(" ");
             		result.put("whereFieldName",whereStatements[whereStatements.length-1]);
             		result.put("option",(OPTION8!=null?OPTION8.getText():null));
             		result.put("fieldValue",(FIELDVALUE9!=null?FIELDVALUE9.getText():null));
             	

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
    // $ANTLR end "whereStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_selectFromStatement_in_querySql27 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_whereStatement_in_querySql30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_selectFromStatement46 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_fromStatement_in_selectFromStatement48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectStatement61 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SELECTFIELD_in_selectStatement63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROMSTATEMENT_in_fromStatement77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERESATEMENT_in_whereStatement91 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_OPTION_in_whereStatement93 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_FIELDVALUE_in_whereStatement95 = new BitSet(new long[]{0x0000000000000002L});

}