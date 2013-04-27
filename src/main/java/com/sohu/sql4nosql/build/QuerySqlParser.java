// $ANTLR 3.4 /E:/workspace/sql4nosql/target/classes/QuerySql.g 2013-04-27 19:17:54

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASC", "DESC", "FROM", "INT", "LIMIT", "NAME", "OFFSET", "OPTION", "ORDERBY", "SELECT", "WHERE", "WS", "'*'", "','", "'\\''"
    };

    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int ASC=4;
    public static final int DESC=5;
    public static final int FROM=6;
    public static final int INT=7;
    public static final int LIMIT=8;
    public static final int NAME=9;
    public static final int OFFSET=10;
    public static final int OPTION=11;
    public static final int ORDERBY=12;
    public static final int SELECT=13;
    public static final int WHERE=14;
    public static final int WS=15;

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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:17:1: selectFromStatement[QuerySqlStruct result] : selectStatement[result] FROM NAME ( WS )? ;
    public final void selectFromStatement(QuerySqlStruct result) throws RecognitionException {
        Token NAME1=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:18:2: ( selectStatement[result] FROM NAME ( WS )? )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:18:4: selectStatement[result] FROM NAME ( WS )?
            {
            pushFollow(FOLLOW_selectStatement_in_selectFromStatement54);
            selectStatement(result);

            state._fsp--;


            match(input,FROM,FOLLOW_FROM_in_selectFromStatement57); 

            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_selectFromStatement59); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:18:38: ( WS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:18:38: WS
                    {
                    match(input,WS,FOLLOW_WS_in_selectFromStatement61); 

                    }
                    break;

            }



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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:21:1: selectStatement[QuerySqlStruct result] : SELECT ( '*' | selectFieldName[result] ( ',' selectFieldName[result] )* ) ( WS )+ ;
    public final void selectStatement(QuerySqlStruct result) throws RecognitionException {
        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:2: ( SELECT ( '*' | selectFieldName[result] ( ',' selectFieldName[result] )* ) ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:4: SELECT ( '*' | selectFieldName[result] ( ',' selectFieldName[result] )* ) ( WS )+
            {
            match(input,SELECT,FOLLOW_SELECT_in_selectStatement73); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:11: ( '*' | selectFieldName[result] ( ',' selectFieldName[result] )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:12: '*'
                    {
                    match(input,16,FOLLOW_16_in_selectStatement76); 

                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:16: selectFieldName[result] ( ',' selectFieldName[result] )*
                    {
                    pushFollow(FOLLOW_selectFieldName_in_selectStatement78);
                    selectFieldName(result);

                    state._fsp--;


                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:40: ( ',' selectFieldName[result] )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:41: ',' selectFieldName[result]
                    	    {
                    	    match(input,17,FOLLOW_17_in_selectStatement82); 

                    	    pushFollow(FOLLOW_selectFieldName_in_selectStatement84);
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


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:72: ( WS )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:72: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_selectStatement90); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "selectStatement"



    // $ANTLR start "selectFieldName"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:23:1: selectFieldName[QuerySqlStruct result] : NAME ;
    public final void selectFieldName(QuerySqlStruct result) throws RecognitionException {
        Token NAME2=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:24:2: ( NAME )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:24:4: NAME
            {
            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_selectFieldName102); 


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
            match(input,WHERE,FOLLOW_WHERE_in_whereStatement115); 

            NAME3=(Token)match(input,NAME,FOLLOW_NAME_in_whereStatement117); 

            OPTION4=(Token)match(input,OPTION,FOLLOW_OPTION_in_whereStatement119); 

            pushFollow(FOLLOW_fieldValue_in_whereStatement121);
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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:32:1: fieldValue[QuerySqlStruct result] : ( ( '\\'' NAME '\\'' ) | INT ) ;
    public final void fieldValue(QuerySqlStruct result) throws RecognitionException {
        Token NAME5=null;
        Token INT6=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:2: ( ( ( '\\'' NAME '\\'' ) | INT ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:4: ( ( '\\'' NAME '\\'' ) | INT )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:4: ( ( '\\'' NAME '\\'' ) | INT )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:5: ( '\\'' NAME '\\'' )
                    {
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:5: ( '\\'' NAME '\\'' )
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:6: '\\'' NAME '\\''
                    {
                    match(input,18,FOLLOW_18_in_fieldValue136); 

                    NAME5=(Token)match(input,NAME,FOLLOW_NAME_in_fieldValue137); 

                    match(input,18,FOLLOW_18_in_fieldValue138); 

                    }


                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:33:20: INT
                    {
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_fieldValue141); 

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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:41:1: orderStatement[QuerySqlStruct result] : ORDERBY NAME ( ( WS )+ ( DESC | ( ASC )? ) )? ;
    public final void orderStatement(QuerySqlStruct result) throws RecognitionException {
        Token NAME7=null;
        Token DESC8=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:2: ( ORDERBY NAME ( ( WS )+ ( DESC | ( ASC )? ) )? )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:4: ORDERBY NAME ( ( WS )+ ( DESC | ( ASC )? ) )?
            {
            match(input,ORDERBY,FOLLOW_ORDERBY_in_orderStatement155); 

            NAME7=(Token)match(input,NAME,FOLLOW_NAME_in_orderStatement157); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:17: ( ( WS )+ ( DESC | ( ASC )? ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==WS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:18: ( WS )+ ( DESC | ( ASC )? )
                    {
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:18: ( WS )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==WS) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:18: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_orderStatement160); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:22: ( DESC | ( ASC )? )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==DESC) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==EOF||LA11_0==ASC||LA11_0==LIMIT) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;

                    }
                    switch (alt11) {
                        case 1 :
                            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:23: DESC
                            {
                            DESC8=(Token)match(input,DESC,FOLLOW_DESC_in_orderStatement164); 

                            }
                            break;
                        case 2 :
                            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:28: ( ASC )?
                            {
                            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:28: ( ASC )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==ASC) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:28: ASC
                                    {
                                    match(input,ASC,FOLLOW_ASC_in_orderStatement166); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }



            		result.orderFieldName = (NAME7!=null?NAME7.getText():null);
            		if((DESC8!=null?DESC8.getText():null) != null) {
            			result.orderType = 1;
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
    // $ANTLR end "orderStatement"



    // $ANTLR start "limitStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:48:1: limitStatement[QuerySqlStruct result] : LIMIT ( OFFSET )? INT ;
    public final void limitStatement(QuerySqlStruct result) throws RecognitionException {
        Token OFFSET9=null;
        Token INT10=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:49:2: ( LIMIT ( OFFSET )? INT )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:49:5: LIMIT ( OFFSET )? INT
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limitStatement183); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:49:11: ( OFFSET )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==OFFSET) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:49:11: OFFSET
                    {
                    OFFSET9=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_limitStatement185); 

                    }
                    break;

            }


            INT10=(Token)match(input,INT,FOLLOW_INT_in_limitStatement188); 


            		if((OFFSET9!=null?OFFSET9.getText():null) != null) {
            			result.offset = Integer.parseInt((OFFSET9!=null?OFFSET9.getText():null).trim());
            		}
            		result.rowLimit = Integer.parseInt((INT10!=null?INT10.getText():null));
            	

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


 

    public static final BitSet FOLLOW_selectFromStatement_in_querySql27 = new BitSet(new long[]{0x0000000000005102L});
    public static final BitSet FOLLOW_whereStatement_in_querySql30 = new BitSet(new long[]{0x0000000000001102L});
    public static final BitSet FOLLOW_orderStatement_in_querySql37 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_limitStatement_in_querySql41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_selectFromStatement54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FROM_in_selectFromStatement57 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_selectFromStatement59 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_WS_in_selectFromStatement61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectStatement73 = new BitSet(new long[]{0x0000000000010200L});
    public static final BitSet FOLLOW_16_in_selectStatement76 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_selectFieldName_in_selectStatement78 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_selectStatement82 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_selectFieldName_in_selectStatement84 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_WS_in_selectStatement90 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_NAME_in_selectFieldName102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereStatement115 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_whereStatement117 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_OPTION_in_whereStatement119 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_fieldValue_in_whereStatement121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_fieldValue136 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_fieldValue137 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_fieldValue138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_fieldValue141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERBY_in_orderStatement155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_orderStatement157 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_WS_in_orderStatement160 = new BitSet(new long[]{0x0000000000008032L});
    public static final BitSet FOLLOW_DESC_in_orderStatement164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_orderStatement166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitStatement183 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_OFFSET_in_limitStatement185 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INT_in_limitStatement188 = new BitSet(new long[]{0x0000000000000002L});

}