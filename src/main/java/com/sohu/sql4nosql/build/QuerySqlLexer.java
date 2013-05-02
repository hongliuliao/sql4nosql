// $ANTLR 3.4 /E:/workspace/sql4nosql/target/classes/QuerySql.g 2013-05-02 22:56:38

package com.sohu.sql4nosql.build;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QuerySqlLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public QuerySqlLexer() {} 
    public QuerySqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public QuerySqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/E:/workspace/sql4nosql/target/classes/QuerySql.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:64:7: ( ( 'select' | 'SELECT' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:64:8: ( 'select' | 'SELECT' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:64:8: ( 'select' | 'SELECT' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='s') ) {
                alt1=1;
            }
            else if ( (LA1_0=='S') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:64:9: 'select'
                    {
                    match("select"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:64:18: 'SELECT'
                    {
                    match("SELECT"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:7: ( ( 'limit' | 'LIMIT' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:10: ( 'limit' | 'LIMIT' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:10: ( 'limit' | 'LIMIT' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='l') ) {
                alt2=1;
            }
            else if ( (LA2_0=='L') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:11: 'limit'
                    {
                    match("limit"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:19: 'LIMIT'
                    {
                    match("LIMIT"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:66:6: ( ( 'from' | 'FROM' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:66:8: ( 'from' | 'FROM' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:66:8: ( 'from' | 'FROM' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='f') ) {
                alt3=1;
            }
            else if ( (LA3_0=='F') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:66:9: 'from'
                    {
                    match("from"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:66:16: 'FROM'
                    {
                    match("FROM"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:7: ( ( 'where' | 'WHERE' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:9: ( 'where' | 'WHERE' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:9: ( 'where' | 'WHERE' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='w') ) {
                alt4=1;
            }
            else if ( (LA4_0=='W') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:10: 'where'
                    {
                    match("where"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:18: 'WHERE'
                    {
                    match("WHERE"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "GROUP_BY"
    public final void mGROUP_BY() throws RecognitionException {
        try {
            int _type = GROUP_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:68:10: ( 'group by' | 'GROUP BY' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='g') ) {
                alt5=1;
            }
            else if ( (LA5_0=='G') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:68:12: 'group by'
                    {
                    match("group by"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:68:23: 'GROUP BY'
                    {
                    match("GROUP BY"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP_BY"

    // $ANTLR start "ORDERBY"
    public final void mORDERBY() throws RecognitionException {
        try {
            int _type = ORDERBY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:69:9: ( ( 'order by' | 'ORDER BY' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:69:12: ( 'order by' | 'ORDER BY' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:69:12: ( 'order by' | 'ORDER BY' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='o') ) {
                alt6=1;
            }
            else if ( (LA6_0=='O') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:69:13: 'order by'
                    {
                    match("order by"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:69:24: 'ORDER BY'
                    {
                    match("ORDER BY"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORDERBY"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:70:6: ( ( 'desc' | 'DESC' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:70:8: ( 'desc' | 'DESC' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:70:8: ( 'desc' | 'DESC' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='d') ) {
                alt7=1;
            }
            else if ( (LA7_0=='D') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:70:9: 'desc'
                    {
                    match("desc"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:70:16: 'DESC'
                    {
                    match("DESC"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:71:5: ( ( 'asc' | 'ASC' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:71:7: ( 'asc' | 'ASC' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:71:7: ( 'asc' | 'ASC' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='a') ) {
                alt8=1;
            }
            else if ( (LA8_0=='A') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:71:8: 'asc'
                    {
                    match("asc"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:71:14: 'ASC'
                    {
                    match("ASC"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "SINGLE_QUOTES"
    public final void mSINGLE_QUOTES() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:73:15: ( '\\'' )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:73:17: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_QUOTES"

    // $ANTLR start "SELECT_ALL"
    public final void mSELECT_ALL() throws RecognitionException {
        try {
            int _type = SELECT_ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:74:12: ( '*' )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:74:14: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT_ALL"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:75:7: ( ',' )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:75:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:76:5: ( ( '0' .. '9' )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:76:7: ( '0' .. '9' )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:76:7: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:77:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:77:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:77:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "OPTION"
    public final void mOPTION() throws RecognitionException {
        try {
            int _type = OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:78:8: ( ( '>' | '<' | '=' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
            {
            if ( (input.LA(1) >= '<' && input.LA(1) <= '>') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPTION"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:79:4: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:79:6: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:8: ( SELECT | LIMIT | FROM | WHERE | GROUP_BY | ORDERBY | DESC | ASC | SINGLE_QUOTES | SELECT_ALL | COMMA | INT | NAME | OPTION | WS )
        int alt11=15;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:10: SELECT
                {
                mSELECT(); 


                }
                break;
            case 2 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:17: LIMIT
                {
                mLIMIT(); 


                }
                break;
            case 3 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:23: FROM
                {
                mFROM(); 


                }
                break;
            case 4 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:28: WHERE
                {
                mWHERE(); 


                }
                break;
            case 5 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:34: GROUP_BY
                {
                mGROUP_BY(); 


                }
                break;
            case 6 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:43: ORDERBY
                {
                mORDERBY(); 


                }
                break;
            case 7 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:51: DESC
                {
                mDESC(); 


                }
                break;
            case 8 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:56: ASC
                {
                mASC(); 


                }
                break;
            case 9 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:60: SINGLE_QUOTES
                {
                mSINGLE_QUOTES(); 


                }
                break;
            case 10 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:74: SELECT_ALL
                {
                mSELECT_ALL(); 


                }
                break;
            case 11 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:85: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 12 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:91: INT
                {
                mINT(); 


                }
                break;
            case 13 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:95: NAME
                {
                mNAME(); 


                }
                break;
            case 14 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:100: OPTION
                {
                mOPTION(); 


                }
                break;
            case 15 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:107: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\20\25\7\uffff\36\25\2\106\4\25\2\113\6\25\2\122\1\uffff"+
        "\2\25\2\125\1\uffff\2\126\4\25\1\uffff\2\131\5\uffff";
    static final String DFA11_eofS =
        "\132\uffff";
    static final String DFA11_minS =
        "\1\11\1\145\1\105\1\151\1\111\1\162\1\122\1\150\1\110\1\162\1\122"+
        "\1\162\1\122\1\145\1\105\1\163\1\123\7\uffff\1\154\1\114\1\155\1"+
        "\115\1\157\1\117\1\145\1\105\1\157\1\117\1\144\1\104\1\163\1\123"+
        "\1\143\1\103\1\145\1\105\1\151\1\111\1\155\1\115\1\162\1\122\1\165"+
        "\1\125\1\145\1\105\1\143\1\103\2\101\1\143\1\103\1\164\1\124\2\101"+
        "\1\145\1\105\1\160\1\120\1\162\1\122\2\101\1\uffff\1\164\1\124\2"+
        "\101\1\uffff\2\101\4\40\1\uffff\2\101\5\uffff";
    static final String DFA11_maxS =
        "\1\172\1\145\1\105\1\151\1\111\1\162\1\122\1\150\1\110\1\162\1\122"+
        "\1\162\1\122\1\145\1\105\1\163\1\123\7\uffff\1\154\1\114\1\155\1"+
        "\115\1\157\1\117\1\145\1\105\1\157\1\117\1\144\1\104\1\163\1\123"+
        "\1\143\1\103\1\145\1\105\1\151\1\111\1\155\1\115\1\162\1\122\1\165"+
        "\1\125\1\145\1\105\1\143\1\103\2\172\1\143\1\103\1\164\1\124\2\172"+
        "\1\145\1\105\1\160\1\120\1\162\1\122\2\172\1\uffff\1\164\1\124\2"+
        "\172\1\uffff\2\172\4\40\1\uffff\2\172\5\uffff";
    static final String DFA11_acceptS =
        "\21\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\56\uffff\1\10\4\uffff"+
        "\1\3\6\uffff\1\7\2\uffff\1\2\1\4\1\5\1\6\1\1";
    static final String DFA11_specialS =
        "\132\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\6\uffff\1\21\2\uffff\1\22\1"+
            "\uffff\1\23\3\uffff\12\24\2\uffff\3\26\2\uffff\1\20\2\25\1\16"+
            "\1\25\1\6\1\12\4\25\1\4\2\25\1\14\3\25\1\2\3\25\1\10\3\25\4"+
            "\uffff\1\25\1\uffff\1\17\2\25\1\15\1\25\1\5\1\11\4\25\1\3\2"+
            "\25\1\13\3\25\1\1\3\25\1\7\3\25",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\123",
            "\1\124",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\127",
            "\1\127",
            "\1\130",
            "\1\130",
            "",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | LIMIT | FROM | WHERE | GROUP_BY | ORDERBY | DESC | ASC | SINGLE_QUOTES | SELECT_ALL | COMMA | INT | NAME | OPTION | WS );";
        }
    }
 

}