// $ANTLR 3.4 /E:/workspace/sql4nosql/target/classes/QuerySql.g 2013-05-02 22:23:47

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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:7: ( ( 'select' | 'SELECT' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:8: ( 'select' | 'SELECT' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:8: ( 'select' | 'SELECT' )
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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:9: 'select'
                    {
                    match("select"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:18: 'SELECT'
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:7: ( ( 'limit' | 'LIMIT' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:10: ( 'limit' | 'LIMIT' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:10: ( 'limit' | 'LIMIT' )
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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:11: 'limit'
                    {
                    match("limit"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:19: 'LIMIT'
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:6: ( ( 'from' | 'FROM' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:8: ( 'from' | 'FROM' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:8: ( 'from' | 'FROM' )
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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:9: 'from'
                    {
                    match("from"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:16: 'FROM'
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:62:7: ( ( 'where' | 'WHERE' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:62:9: ( 'where' | 'WHERE' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:62:9: ( 'where' | 'WHERE' )
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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:62:10: 'where'
                    {
                    match("where"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:62:18: 'WHERE'
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

    // $ANTLR start "ORDERBY"
    public final void mORDERBY() throws RecognitionException {
        try {
            int _type = ORDERBY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:63:9: ( ( 'order by' | 'ORDER BY' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:63:12: ( 'order by' | 'ORDER BY' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:63:12: ( 'order by' | 'ORDER BY' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='o') ) {
                alt5=1;
            }
            else if ( (LA5_0=='O') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:63:13: 'order by'
                    {
                    match("order by"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:63:24: 'ORDER BY'
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:64:6: ( ( 'desc' | 'DESC' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:64:8: ( 'desc' | 'DESC' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:64:8: ( 'desc' | 'DESC' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='d') ) {
                alt6=1;
            }
            else if ( (LA6_0=='D') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:64:9: 'desc'
                    {
                    match("desc"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:64:16: 'DESC'
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:5: ( ( 'asc' | 'ASC' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:7: ( 'asc' | 'ASC' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:7: ( 'asc' | 'ASC' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='a') ) {
                alt7=1;
            }
            else if ( (LA7_0=='A') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:8: 'asc'
                    {
                    match("asc"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:14: 'ASC'
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:15: ( '\\'' )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:17: '\\''
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:68:12: ( '*' )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:68:14: '*'
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:69:7: ( ',' )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:69:9: ','
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:70:5: ( ( '0' .. '9' )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:70:7: ( '0' .. '9' )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:70:7: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:71:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:71:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:71:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
    // $ANTLR end "NAME"

    // $ANTLR start "OPTION"
    public final void mOPTION() throws RecognitionException {
        try {
            int _type = OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:72:8: ( ( '>' | '<' | '=' ) )
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:73:4: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:73:6: ( ' ' | '\\t' | '\\n' | '\\r' )
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
        // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:8: ( SELECT | LIMIT | FROM | WHERE | ORDERBY | DESC | ASC | SINGLE_QUOTES | SELECT_ALL | COMMA | INT | NAME | OPTION | WS )
        int alt10=14;
        alt10 = dfa10.predict(input);
        switch (alt10) {
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
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:34: ORDERBY
                {
                mORDERBY(); 


                }
                break;
            case 6 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:42: DESC
                {
                mDESC(); 


                }
                break;
            case 7 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:47: ASC
                {
                mASC(); 


                }
                break;
            case 8 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:51: SINGLE_QUOTES
                {
                mSINGLE_QUOTES(); 


                }
                break;
            case 9 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:65: SELECT_ALL
                {
                mSELECT_ALL(); 


                }
                break;
            case 10 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:76: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 11 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:82: INT
                {
                mINT(); 


                }
                break;
            case 12 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:86: NAME
                {
                mNAME(); 


                }
                break;
            case 13 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:91: OPTION
                {
                mOPTION(); 


                }
                break;
            case 14 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:98: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\16\23\7\uffff\32\23\2\76\4\23\2\103\4\23\2\110\1\uffff"+
        "\2\23\2\113\1\uffff\2\114\2\23\1\uffff\2\116\4\uffff";
    static final String DFA10_eofS =
        "\117\uffff";
    static final String DFA10_minS =
        "\1\11\1\145\1\105\1\151\1\111\1\162\1\122\1\150\1\110\1\162\1\122"+
        "\1\145\1\105\1\163\1\123\7\uffff\1\154\1\114\1\155\1\115\1\157\1"+
        "\117\1\145\1\105\1\144\1\104\1\163\1\123\1\143\1\103\1\145\1\105"+
        "\1\151\1\111\1\155\1\115\1\162\1\122\1\145\1\105\1\143\1\103\2\101"+
        "\1\143\1\103\1\164\1\124\2\101\1\145\1\105\1\162\1\122\2\101\1\uffff"+
        "\1\164\1\124\2\101\1\uffff\2\101\2\40\1\uffff\2\101\4\uffff";
    static final String DFA10_maxS =
        "\1\172\1\145\1\105\1\151\1\111\1\162\1\122\1\150\1\110\1\162\1\122"+
        "\1\145\1\105\1\163\1\123\7\uffff\1\154\1\114\1\155\1\115\1\157\1"+
        "\117\1\145\1\105\1\144\1\104\1\163\1\123\1\143\1\103\1\145\1\105"+
        "\1\151\1\111\1\155\1\115\1\162\1\122\1\145\1\105\1\143\1\103\2\172"+
        "\1\143\1\103\1\164\1\124\2\172\1\145\1\105\1\162\1\122\2\172\1\uffff"+
        "\1\164\1\124\2\172\1\uffff\2\172\2\40\1\uffff\2\172\4\uffff";
    static final String DFA10_acceptS =
        "\17\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\50\uffff\1\7\4\uffff"+
        "\1\3\4\uffff\1\6\2\uffff\1\2\1\4\1\5\1\1";
    static final String DFA10_specialS =
        "\117\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\6\uffff\1\17\2\uffff\1\20\1"+
            "\uffff\1\21\3\uffff\12\22\2\uffff\3\24\2\uffff\1\16\2\23\1\14"+
            "\1\23\1\6\5\23\1\4\2\23\1\12\3\23\1\2\3\23\1\10\3\23\4\uffff"+
            "\1\23\1\uffff\1\15\2\23\1\13\1\23\1\5\5\23\1\3\2\23\1\11\3\23"+
            "\1\1\3\23\1\7\3\23",
            "\1\26",
            "\1\27",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
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
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\111",
            "\1\112",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\115",
            "\1\115",
            "",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | LIMIT | FROM | WHERE | ORDERBY | DESC | ASC | SINGLE_QUOTES | SELECT_ALL | COMMA | INT | NAME | OPTION | WS );";
        }
    }
 

}