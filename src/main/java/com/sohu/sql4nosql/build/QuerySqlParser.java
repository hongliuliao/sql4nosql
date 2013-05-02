// $ANTLR 3.4 /E:/workspace/sql4nosql/target/classes/QuerySql.g 2013-05-02 22:56:38

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASC", "COMMA", "DESC", "FROM", "GROUP_BY", "INT", "LIMIT", "NAME", "OPTION", "ORDERBY", "SELECT", "SELECT_ALL", "SINGLE_QUOTES", "WHERE", "WS"
    };

    public static final int EOF=-1;
    public static final int ASC=4;
    public static final int COMMA=5;
    public static final int DESC=6;
    public static final int FROM=7;
    public static final int GROUP_BY=8;
    public static final int INT=9;
    public static final int LIMIT=10;
    public static final int NAME=11;
    public static final int OPTION=12;
    public static final int ORDERBY=13;
    public static final int SELECT=14;
    public static final int SELECT_ALL=15;
    public static final int SINGLE_QUOTES=16;
    public static final int WHERE=17;
    public static final int WS=18;

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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:13:1: querySql returns [QuerySqlStruct result = new QuerySqlStruct()] : selectFromStatement[result] ( whereStatement[result] )? ( groupbyStatement[result] )? ( orderStatement[result] )? ( limitStatement[result] )? ;
    public final QuerySqlStruct querySql() throws RecognitionException {
        QuerySqlStruct result =  new QuerySqlStruct();


        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:2: ( selectFromStatement[result] ( whereStatement[result] )? ( groupbyStatement[result] )? ( orderStatement[result] )? ( limitStatement[result] )? )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:4: selectFromStatement[result] ( whereStatement[result] )? ( groupbyStatement[result] )? ( orderStatement[result] )? ( limitStatement[result] )?
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


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:15:3: ( groupbyStatement[result] )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==GROUP_BY) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:15:3: groupbyStatement[result]
                    {
                    pushFollow(FOLLOW_groupbyStatement_in_querySql37);
                    groupbyStatement(result);

                    state._fsp--;


                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:16:3: ( orderStatement[result] )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ORDERBY) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:16:3: orderStatement[result]
                    {
                    pushFollow(FOLLOW_orderStatement_in_querySql43);
                    orderStatement(result);

                    state._fsp--;


                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:16:27: ( limitStatement[result] )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LIMIT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:16:27: limitStatement[result]
                    {
                    pushFollow(FOLLOW_limitStatement_in_querySql47);
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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:18:1: selectFromStatement[QuerySqlStruct result] : selectStatement[result] FROM NAME ;
    public final void selectFromStatement(QuerySqlStruct result) throws RecognitionException {
        Token NAME1=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:19:2: ( selectStatement[result] FROM NAME )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:19:4: selectStatement[result] FROM NAME
            {
            pushFollow(FOLLOW_selectStatement_in_selectFromStatement60);
            selectStatement(result);

            state._fsp--;


            match(input,FROM,FOLLOW_FROM_in_selectFromStatement63); 

            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_selectFromStatement65); 


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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:1: selectStatement[QuerySqlStruct result] : SELECT ( SELECT_ALL | selectFieldName[result] ( COMMA selectFieldName[result] )* ) ;
    public final void selectStatement(QuerySqlStruct result) throws RecognitionException {
        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:23:2: ( SELECT ( SELECT_ALL | selectFieldName[result] ( COMMA selectFieldName[result] )* ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:23:4: SELECT ( SELECT_ALL | selectFieldName[result] ( COMMA selectFieldName[result] )* )
            {
            match(input,SELECT,FOLLOW_SELECT_in_selectStatement77); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:23:11: ( SELECT_ALL | selectFieldName[result] ( COMMA selectFieldName[result] )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==SELECT_ALL) ) {
                alt6=1;
            }
            else if ( (LA6_0==NAME) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:23:12: SELECT_ALL
                    {
                    match(input,SELECT_ALL,FOLLOW_SELECT_ALL_in_selectStatement80); 

                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:23:23: selectFieldName[result] ( COMMA selectFieldName[result] )*
                    {
                    pushFollow(FOLLOW_selectFieldName_in_selectStatement82);
                    selectFieldName(result);

                    state._fsp--;


                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:23:47: ( COMMA selectFieldName[result] )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:23:48: COMMA selectFieldName[result]
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_selectStatement86); 

                    	    pushFollow(FOLLOW_selectFieldName_in_selectStatement88);
                    	    selectFieldName(result);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:24:1: selectFieldName[QuerySqlStruct result] : NAME ;
    public final void selectFieldName(QuerySqlStruct result) throws RecognitionException {
        Token NAME2=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:25:2: ( NAME )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:25:4: NAME
            {
            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_selectFieldName103); 


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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:28:1: whereStatement[QuerySqlStruct result] : WHERE NAME OPTION fieldValue[result] ;
    public final void whereStatement(QuerySqlStruct result) throws RecognitionException {
        Token NAME3=null;
        Token OPTION4=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:29:3: ( WHERE NAME OPTION fieldValue[result] )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:29:5: WHERE NAME OPTION fieldValue[result]
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereStatement116); 

            NAME3=(Token)match(input,NAME,FOLLOW_NAME_in_whereStatement118); 

            OPTION4=(Token)match(input,OPTION,FOLLOW_OPTION_in_whereStatement120); 

            pushFollow(FOLLOW_fieldValue_in_whereStatement122);
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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:1: fieldValue[QuerySqlStruct result] : ( ( SINGLE_QUOTES NAME SINGLE_QUOTES ) | INT ) ;
    public final void fieldValue(QuerySqlStruct result) throws RecognitionException {
        Token NAME5=null;
        Token INT6=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:34:2: ( ( ( SINGLE_QUOTES NAME SINGLE_QUOTES ) | INT ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:34:4: ( ( SINGLE_QUOTES NAME SINGLE_QUOTES ) | INT )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:34:4: ( ( SINGLE_QUOTES NAME SINGLE_QUOTES ) | INT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SINGLE_QUOTES) ) {
                alt7=1;
            }
            else if ( (LA7_0==INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:34:5: ( SINGLE_QUOTES NAME SINGLE_QUOTES )
                    {
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:34:5: ( SINGLE_QUOTES NAME SINGLE_QUOTES )
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:34:6: SINGLE_QUOTES NAME SINGLE_QUOTES
                    {
                    match(input,SINGLE_QUOTES,FOLLOW_SINGLE_QUOTES_in_fieldValue137); 

                    NAME5=(Token)match(input,NAME,FOLLOW_NAME_in_fieldValue139); 

                    match(input,SINGLE_QUOTES,FOLLOW_SINGLE_QUOTES_in_fieldValue141); 

                    }


                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:34:40: INT
                    {
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_fieldValue144); 

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



    // $ANTLR start "groupbyStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:41:1: groupbyStatement[QuerySqlStruct result] : GROUP_BY groupName= NAME ( COMMA groupName= NAME )* ;
    public final void groupbyStatement(QuerySqlStruct result) throws RecognitionException {
        Token groupName=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:2: ( GROUP_BY groupName= NAME ( COMMA groupName= NAME )* )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:4: GROUP_BY groupName= NAME ( COMMA groupName= NAME )*
            {
            match(input,GROUP_BY,FOLLOW_GROUP_BY_in_groupbyStatement157); 

            groupName=(Token)match(input,NAME,FOLLOW_NAME_in_groupbyStatement163); 


            		result.groupByFields.add((groupName!=null?groupName.getText():null));
            	

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:44:3: ( COMMA groupName= NAME )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:44:4: COMMA groupName= NAME
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_groupbyStatement166); 

            	    groupName=(Token)match(input,NAME,FOLLOW_NAME_in_groupbyStatement172); 


            	    		result.groupByFields.add((groupName!=null?groupName.getText():null));
            	    	

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "groupbyStatement"



    // $ANTLR start "orderStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:47:1: orderStatement[QuerySqlStruct result] : ORDERBY NAME ( order[result] )? ;
    public final void orderStatement(QuerySqlStruct result) throws RecognitionException {
        Token NAME7=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:48:2: ( ORDERBY NAME ( order[result] )? )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:48:4: ORDERBY NAME ( order[result] )?
            {
            match(input,ORDERBY,FOLLOW_ORDERBY_in_orderStatement185); 

            NAME7=(Token)match(input,NAME,FOLLOW_NAME_in_orderStatement187); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:48:17: ( order[result] )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ASC||LA9_0==DESC) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:48:17: order[result]
                    {
                    pushFollow(FOLLOW_order_in_orderStatement189);
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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:51:1: order[QuerySqlStruct result] : ( DESC | ASC );
    public final void order(QuerySqlStruct result) throws RecognitionException {
        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:52:2: ( DESC | ASC )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DESC) ) {
                alt10=1;
            }
            else if ( (LA10_0==ASC) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:52:4: DESC
                    {
                    match(input,DESC,FOLLOW_DESC_in_order203); 


                    		result.orderType = 1;
                    	

                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:54:4: ASC
                    {
                    match(input,ASC,FOLLOW_ASC_in_order206); 

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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:55:1: limitStatement[QuerySqlStruct result] : LIMIT (offset= INT )? rowLimit= INT ;
    public final void limitStatement(QuerySqlStruct result) throws RecognitionException {
        Token offset=null;
        Token rowLimit=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:56:2: ( LIMIT (offset= INT )? rowLimit= INT )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:56:5: LIMIT (offset= INT )? rowLimit= INT
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limitStatement218); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:56:17: (offset= INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==INT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==INT) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:56:17: offset= INT
                    {
                    offset=(Token)match(input,INT,FOLLOW_INT_in_limitStatement222); 

                    }
                    break;

            }


            rowLimit=(Token)match(input,INT,FOLLOW_INT_in_limitStatement227); 


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


 

    public static final BitSet FOLLOW_selectFromStatement_in_querySql27 = new BitSet(new long[]{0x0000000000022502L});
    public static final BitSet FOLLOW_whereStatement_in_querySql30 = new BitSet(new long[]{0x0000000000002502L});
    public static final BitSet FOLLOW_groupbyStatement_in_querySql37 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_orderStatement_in_querySql43 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_limitStatement_in_querySql47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_selectFromStatement60 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FROM_in_selectFromStatement63 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NAME_in_selectFromStatement65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectStatement77 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_SELECT_ALL_in_selectStatement80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectFieldName_in_selectStatement82 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_selectStatement86 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_selectFieldName_in_selectStatement88 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_NAME_in_selectFieldName103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereStatement116 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NAME_in_whereStatement118 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_OPTION_in_whereStatement120 = new BitSet(new long[]{0x0000000000010200L});
    public static final BitSet FOLLOW_fieldValue_in_whereStatement122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTES_in_fieldValue137 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NAME_in_fieldValue139 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SINGLE_QUOTES_in_fieldValue141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_fieldValue144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_BY_in_groupbyStatement157 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NAME_in_groupbyStatement163 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_groupbyStatement166 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NAME_in_groupbyStatement172 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ORDERBY_in_orderStatement185 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NAME_in_orderStatement187 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_order_in_orderStatement189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_order203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_order206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitStatement218 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_limitStatement222 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_limitStatement227 = new BitSet(new long[]{0x0000000000000002L});

}