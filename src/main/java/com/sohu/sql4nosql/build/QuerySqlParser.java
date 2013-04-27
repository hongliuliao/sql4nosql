// $ANTLR 3.4 /E:/workspace/sql4nosql/target/classes/QuerySql.g 2013-04-27 18:36:47

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASC", "DESC", "FIELDVALUE", "FROM", "INT", "LIMIT", "NAME", "OFFSET", "OPTION", "ORDERBY", "SELECT", "WHERE", "WS", "'*'", "','"
    };

    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int ASC=4;
    public static final int DESC=5;
    public static final int FIELDVALUE=6;
    public static final int FROM=7;
    public static final int INT=8;
    public static final int LIMIT=9;
    public static final int NAME=10;
    public static final int OFFSET=11;
    public static final int OPTION=12;
    public static final int ORDERBY=13;
    public static final int SELECT=14;
    public static final int WHERE=15;
    public static final int WS=16;

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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:14:33: whereStatement[result]
                    {
                    pushFollow(FOLLOW_whereStatement_in_querySql31);
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
                    pushFollow(FOLLOW_orderStatement_in_querySql39);
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
                    pushFollow(FOLLOW_limitStatement_in_querySql43);
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
            pushFollow(FOLLOW_selectStatement_in_selectFromStatement56);
            selectStatement(result);

            state._fsp--;


            match(input,FROM,FOLLOW_FROM_in_selectFromStatement59); 

            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_selectFromStatement61); 

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
                    match(input,WS,FOLLOW_WS_in_selectFromStatement63); 

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
            match(input,SELECT,FOLLOW_SELECT_in_selectStatement75); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:11: ( '*' | selectFieldName[result] ( ',' selectFieldName[result] )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
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
                    match(input,17,FOLLOW_17_in_selectStatement78); 

                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:16: selectFieldName[result] ( ',' selectFieldName[result] )*
                    {
                    pushFollow(FOLLOW_selectFieldName_in_selectStatement80);
                    selectFieldName(result);

                    state._fsp--;


                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:40: ( ',' selectFieldName[result] )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:22:41: ',' selectFieldName[result]
                    	    {
                    	    match(input,18,FOLLOW_18_in_selectStatement84); 

                    	    pushFollow(FOLLOW_selectFieldName_in_selectStatement86);
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
            	    match(input,WS,FOLLOW_WS_in_selectStatement92); 

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
            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_selectFieldName104); 


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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:27:1: whereStatement[QuerySqlStruct result] : WHERE NAME OPTION FIELDVALUE ;
    public final void whereStatement(QuerySqlStruct result) throws RecognitionException {
        Token NAME3=null;
        Token OPTION4=null;
        Token FIELDVALUE5=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:28:3: ( WHERE NAME OPTION FIELDVALUE )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:28:5: WHERE NAME OPTION FIELDVALUE
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereStatement117); 

            NAME3=(Token)match(input,NAME,FOLLOW_NAME_in_whereStatement119); 

            OPTION4=(Token)match(input,OPTION,FOLLOW_OPTION_in_whereStatement121); 

            FIELDVALUE5=(Token)match(input,FIELDVALUE,FOLLOW_FIELDVALUE_in_whereStatement123); 


             		result.whereFieldName = (NAME3!=null?NAME3.getText():null);
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



    // $ANTLR start "orderStatement"
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:34:1: orderStatement[QuerySqlStruct result] : ORDERBY NAME ( ( WS )+ ( DESC | ( ASC )? ) )? ;
    public final void orderStatement(QuerySqlStruct result) throws RecognitionException {
        Token NAME6=null;
        Token DESC7=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:2: ( ORDERBY NAME ( ( WS )+ ( DESC | ( ASC )? ) )? )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:4: ORDERBY NAME ( ( WS )+ ( DESC | ( ASC )? ) )?
            {
            match(input,ORDERBY,FOLLOW_ORDERBY_in_orderStatement135); 

            NAME6=(Token)match(input,NAME,FOLLOW_NAME_in_orderStatement137); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:17: ( ( WS )+ ( DESC | ( ASC )? ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==WS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:18: ( WS )+ ( DESC | ( ASC )? )
                    {
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:18: ( WS )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==WS) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:18: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_orderStatement140); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:22: ( DESC | ( ASC )? )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==DESC) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==EOF||LA10_0==ASC||LA10_0==LIMIT) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }
                    switch (alt10) {
                        case 1 :
                            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:23: DESC
                            {
                            DESC7=(Token)match(input,DESC,FOLLOW_DESC_in_orderStatement144); 

                            }
                            break;
                        case 2 :
                            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:28: ( ASC )?
                            {
                            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:28: ( ASC )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==ASC) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:35:28: ASC
                                    {
                                    match(input,ASC,FOLLOW_ASC_in_orderStatement146); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }



            		result.orderFieldName = (NAME6!=null?NAME6.getText():null);
            		if((DESC7!=null?DESC7.getText():null) != null) {
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
    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:41:1: limitStatement[QuerySqlStruct result] : LIMIT ( OFFSET )? INT ;
    public final void limitStatement(QuerySqlStruct result) throws RecognitionException {
        Token OFFSET8=null;
        Token INT9=null;

        try {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:2: ( LIMIT ( OFFSET )? INT )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:5: LIMIT ( OFFSET )? INT
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limitStatement163); 

            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:11: ( OFFSET )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==OFFSET) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:11: OFFSET
                    {
                    OFFSET8=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_limitStatement165); 

                    }
                    break;

            }


            INT9=(Token)match(input,INT,FOLLOW_INT_in_limitStatement168); 


            		if((OFFSET8!=null?OFFSET8.getText():null) != null) {
            			result.offset = Integer.parseInt((OFFSET8!=null?OFFSET8.getText():null).trim());
            		}
            		result.rowLimit = Integer.parseInt((INT9!=null?INT9.getText():null));
            	

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


 

    public static final BitSet FOLLOW_selectFromStatement_in_querySql27 = new BitSet(new long[]{0x000000000000A202L});
    public static final BitSet FOLLOW_whereStatement_in_querySql31 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_orderStatement_in_querySql39 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_limitStatement_in_querySql43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_selectFromStatement56 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FROM_in_selectFromStatement59 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_selectFromStatement61 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_WS_in_selectFromStatement63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectStatement75 = new BitSet(new long[]{0x0000000000020400L});
    public static final BitSet FOLLOW_17_in_selectStatement78 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_selectFieldName_in_selectStatement80 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_selectStatement84 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_selectFieldName_in_selectStatement86 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_WS_in_selectStatement92 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_NAME_in_selectFieldName104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereStatement117 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_whereStatement119 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_OPTION_in_whereStatement121 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_FIELDVALUE_in_whereStatement123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERBY_in_orderStatement135 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAME_in_orderStatement137 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_WS_in_orderStatement140 = new BitSet(new long[]{0x0000000000010032L});
    public static final BitSet FOLLOW_DESC_in_orderStatement144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_orderStatement146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitStatement163 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_OFFSET_in_limitStatement165 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INT_in_limitStatement168 = new BitSet(new long[]{0x0000000000000002L});

}