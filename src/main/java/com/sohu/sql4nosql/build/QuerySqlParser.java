// $ANTLR 3.4 /E:/workspace/sql4nosql/target/classes/QuerySql.g 2013-05-02 22:23:46

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASC", "COMMA", "DESC", "FROM", "INT", "LIMIT", "NAME", "OPTION", "ORDERBY", "SELECT", "SELECT_ALL", "SINGLE_QUOTES", "WHERE", "WS"
    };

    public static final int EOF=-1;
    public static final int ASC=4;
    public static final int COMMA=5;
    public static final int DESC=6;
    public static final int FROM=7;
    public static final int INT=8;
    public static final int LIMIT=9;
    public static final int NAME=10;
    public static final int OPTION=11;
    public static final int ORDERBY=12;
    public static final int SELECT=13;
    public static final int SELECT_ALL=14;
    public static final int SINGLE_QUOTES=15;
    public static final int WHERE=16;
    public static final int WS=17;

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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:13:1: querySql returns [QuerySqlStruct result = new QuerySqlStruct()] : selectFromStatement[result] ( whereStatement[result] )? ( orderStatement[result] )? ( limitStatement[result] )? ;
    public final QuerySqlStruct querySql() throws RecognitionException {
        QuerySqlStruct result =  new QuerySqlStruct();


        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:2: ( selectFromStatement[result] ( whereStatement[result] )? ( orderStatement[result] )? ( limitStatement[result] )? )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:4: selectFromStatement[result] ( whereStatement[result] )? ( orderStatement[result] )? ( limitStatement[result] )?
            {
            pushFollow(FOLLOW_selectFromStatement_in_querySql27);
            selectFromStatement(result);

            state._fsp--;


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:32: ( whereStatement[result] )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==WHERE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:32: whereStatement[result]
                    {
                    pushFollow(FOLLOW_whereStatement_in_querySql30);
                    whereStatement(result);

                    state._fsp--;


                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:15:3: ( orderStatement[result] )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ORDERBY) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:15:3: orderStatement[result]
                    {
                    pushFollow(FOLLOW_orderStatement_in_querySql37);
                    orderStatement(result);

                    state._fsp--;


                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:15:27: ( limitStatement[result] )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LIMIT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:15:27: limitStatement[result]
                    {
                    pushFollow(FOLLOW_limitStatement_in_querySql41);
                    limitStatement(result);

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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:17:1: selectFromStatement[QuerySqlStruct result] : selectStatement[result] FROM NAME ;
    public final void selectFromStatement(QuerySqlStruct result) throws RecognitionException {
        Token NAME1=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:18:2: ( selectStatement[result] FROM NAME )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:18:4: selectStatement[result] FROM NAME
            {
            pushFollow(FOLLOW_selectStatement_in_selectFromStatement54);
            selectStatement(result);

            state._fsp--;


            match(input,FROM,FOLLOW_FROM_in_selectFromStatement57); 

            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_selectFromStatement59); 


            		result.tableName = (NAME1!=null?NAME1.getText():null);
            	

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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:21:1: selectStatement[QuerySqlStruct result] : SELECT ( SELECT_ALL | selectFieldName[result] ( COMMA selectFieldName[result] )* ) ;
    public final void selectStatement(QuerySqlStruct result) throws RecognitionException {
        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:2: ( SELECT ( SELECT_ALL | selectFieldName[result] ( COMMA selectFieldName[result] )* ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:4: SELECT ( SELECT_ALL | selectFieldName[result] ( COMMA selectFieldName[result] )* )
            {
            match(input,SELECT,FOLLOW_SELECT_in_selectStatement71); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:11: ( SELECT_ALL | selectFieldName[result] ( COMMA selectFieldName[result] )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SELECT_ALL) ) {
                alt5=1;
            }
            else if ( (LA5_0==NAME) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:12: SELECT_ALL
                    {
                    match(input,SELECT_ALL,FOLLOW_SELECT_ALL_in_selectStatement74); 

                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:23: selectFieldName[result] ( COMMA selectFieldName[result] )*
                    {
                    pushFollow(FOLLOW_selectFieldName_in_selectStatement76);
                    selectFieldName(result);

                    state._fsp--;


                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:47: ( COMMA selectFieldName[result] )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:48: COMMA selectFieldName[result]
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_selectStatement80); 

                    	    pushFollow(FOLLOW_selectFieldName_in_selectStatement82);
                    	    selectFieldName(result);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
        return ;
    }
    // $ANTLR end "selectStatement"



    // $ANTLR start "selectFieldName"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:23:1: selectFieldName[QuerySqlStruct result] : NAME ;
    public final void selectFieldName(QuerySqlStruct result) throws RecognitionException {
        Token NAME2=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:24:2: ( NAME )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:24:4: NAME
            {
            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_selectFieldName97); 


            		result.selectFields.add((NAME2!=null?NAME2.getText():null));
            	

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
    // $ANTLR end "selectFieldName"



    // $ANTLR start "whereStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:27:1: whereStatement[QuerySqlStruct result] : WHERE NAME OPTION fieldValue[result] ;
    public final void whereStatement(QuerySqlStruct result) throws RecognitionException {
        Token NAME3=null;
        Token OPTION4=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:28:3: ( WHERE NAME OPTION fieldValue[result] )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:28:5: WHERE NAME OPTION fieldValue[result]
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereStatement110); 

            NAME3=(Token)match(input,NAME,FOLLOW_NAME_in_whereStatement112); 

            OPTION4=(Token)match(input,OPTION,FOLLOW_OPTION_in_whereStatement114); 

            pushFollow(FOLLOW_fieldValue_in_whereStatement116);
            fieldValue(result);

            state._fsp--;



             		result.whereFieldName = (NAME3!=null?NAME3.getText():null);
             		result.option = (OPTION4!=null?OPTION4.getText():null);
             	

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



    // $ANTLR start "fieldValue"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:32:1: fieldValue[QuerySqlStruct result] : ( ( SINGLE_QUOTES NAME SINGLE_QUOTES ) | INT ) ;
    public final void fieldValue(QuerySqlStruct result) throws RecognitionException {
        Token NAME5=null;
        Token INT6=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:2: ( ( ( SINGLE_QUOTES NAME SINGLE_QUOTES ) | INT ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:4: ( ( SINGLE_QUOTES NAME SINGLE_QUOTES ) | INT )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:4: ( ( SINGLE_QUOTES NAME SINGLE_QUOTES ) | INT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==SINGLE_QUOTES) ) {
                alt6=1;
            }
            else if ( (LA6_0==INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:5: ( SINGLE_QUOTES NAME SINGLE_QUOTES )
                    {
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:5: ( SINGLE_QUOTES NAME SINGLE_QUOTES )
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:6: SINGLE_QUOTES NAME SINGLE_QUOTES
                    {
                    match(input,SINGLE_QUOTES,FOLLOW_SINGLE_QUOTES_in_fieldValue131); 

                    NAME5=(Token)match(input,NAME,FOLLOW_NAME_in_fieldValue133); 

                    match(input,SINGLE_QUOTES,FOLLOW_SINGLE_QUOTES_in_fieldValue135); 

                    }


                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:40: INT
                    {
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_fieldValue138); 

                    }
                    break;

            }



            		if((NAME5!=null?NAME5.getText():null) != null) {
            			result.fieldValue = (NAME5!=null?NAME5.getText():null);
            		} else {
            			result.fieldValue = (INT6!=null?INT6.getText():null);
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
        return ;
    }
    // $ANTLR end "fieldValue"



    // $ANTLR start "orderStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:41:1: orderStatement[QuerySqlStruct result] : ORDERBY NAME ( order[result] )? ;
    public final void orderStatement(QuerySqlStruct result) throws RecognitionException {
        Token NAME7=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:2: ( ORDERBY NAME ( order[result] )? )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:4: ORDERBY NAME ( order[result] )?
            {
            match(input,ORDERBY,FOLLOW_ORDERBY_in_orderStatement152); 

            NAME7=(Token)match(input,NAME,FOLLOW_NAME_in_orderStatement154); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:17: ( order[result] )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ASC||LA7_0==DESC) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:17: order[result]
                    {
                    pushFollow(FOLLOW_order_in_orderStatement156);
                    order(result);

                    state._fsp--;


                    }
                    break;

            }



            		result.orderFieldName = (NAME7!=null?NAME7.getText():null);
            		
            	

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
    // $ANTLR end "orderStatement"



    // $ANTLR start "order"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:46:1: order[QuerySqlStruct result] : ( DESC | ASC );
    public final void order(QuerySqlStruct result) throws RecognitionException {
        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:47:2: ( DESC | ASC )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DESC) ) {
                alt8=1;
            }
            else if ( (LA8_0==ASC) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:47:4: DESC
                    {
                    match(input,DESC,FOLLOW_DESC_in_order170); 


                    		result.orderType = 1;
                    	

                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:49:4: ASC
                    {
                    match(input,ASC,FOLLOW_ASC_in_order173); 

                    }
                    break;

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
    // $ANTLR end "order"



    // $ANTLR start "limitStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:50:1: limitStatement[QuerySqlStruct result] : LIMIT (offset= INT )? rowLimit= INT ;
    public final void limitStatement(QuerySqlStruct result) throws RecognitionException {
        Token offset=null;
        Token rowLimit=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:51:2: ( LIMIT (offset= INT )? rowLimit= INT )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:51:5: LIMIT (offset= INT )? rowLimit= INT
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limitStatement185); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:51:17: (offset= INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==INT) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:51:17: offset= INT
                    {
                    offset=(Token)match(input,INT,FOLLOW_INT_in_limitStatement189); 

                    }
                    break;

            }


            rowLimit=(Token)match(input,INT,FOLLOW_INT_in_limitStatement194); 


            		if((offset!=null?offset.getText():null) != null) {
            			result.offset = Integer.parseInt((offset!=null?offset.getText():null).trim());
            		}
            		result.rowLimit = Integer.parseInt((rowLimit!=null?rowLimit.getText():null));
            	

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
    // $ANTLR end "limitStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_selectFromStatement_in_querySql27 = new BitSet(new long[]{0x0000000000011202L});
    public static final BitSet FOLLOW_whereStatement_in_querySql30 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_orderStatement_in_querySql37 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_limitStatement_in_querySql41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_selectFromStatement54 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FROM_in_selectFromStatement57 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_selectFromStatement59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectStatement71 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_SELECT_ALL_in_selectStatement74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectFieldName_in_selectStatement76 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_selectStatement80 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_selectFieldName_in_selectStatement82 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_NAME_in_selectFieldName97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereStatement110 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_whereStatement112 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_OPTION_in_whereStatement114 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_fieldValue_in_whereStatement116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTES_in_fieldValue131 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_fieldValue133 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SINGLE_QUOTES_in_fieldValue135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_fieldValue138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERBY_in_orderStatement152 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_orderStatement154 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_order_in_orderStatement156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_order170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_order173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitStatement185 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INT_in_limitStatement189 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INT_in_limitStatement194 = new BitSet(new long[]{0x0000000000000002L});

}