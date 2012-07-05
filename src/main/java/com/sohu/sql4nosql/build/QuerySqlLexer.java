// $ANTLR 3.4 /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g 2012-06-02 14:38:25

package com.sohu.sql4nosql.build;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QuerySqlLexer extends Lexer {
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
    public String getGrammarFileName() { return "/C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g"; }

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:46:7: ( ( 'select' | 'SELECT' ) ( WS )+ )
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:46:8: ( 'select' | 'SELECT' ) ( WS )+
            {
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:46:8: ( 'select' | 'SELECT' )
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
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:46:9: 'select'
                    {
                    match("select"); 



                    }
                    break;
                case 2 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:46:18: 'SELECT'
                    {
                    match("SELECT"); 



                    }
                    break;

            }


            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:46:27: ( WS )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "SELECTFIELD"
    public final void mSELECTFIELD() throws RecognitionException {
        try {
            int _type = SELECTFIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:47:12: ( ( '*' | NAME ( ',' NAME )* ) ( WS )+ )
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:47:13: ( '*' | NAME ( ',' NAME )* ) ( WS )+
            {
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:47:13: ( '*' | NAME ( ',' NAME )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='*') ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:47:14: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:47:18: NAME ( ',' NAME )*
                    {
                    mNAME(); 


                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:47:23: ( ',' NAME )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==',') ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:47:24: ',' NAME
                    	    {
                    	    match(','); 

                    	    mNAME(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:47:36: ( WS )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECTFIELD"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:48:14: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:48:15: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:48:15: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "FROMSTATEMENT"
    public final void mFROMSTATEMENT() throws RecognitionException {
        try {
            int _type = FROMSTATEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:49:15: ( ( 'from' | 'FROM' ) ( WS )+ NAME )
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:49:16: ( 'from' | 'FROM' ) ( WS )+ NAME
            {
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:49:16: ( 'from' | 'FROM' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='f') ) {
                alt7=1;
            }
            else if ( (LA7_0=='F') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:49:17: 'from'
                    {
                    match("from"); 



                    }
                    break;
                case 2 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:49:24: 'FROM'
                    {
                    match("FROM"); 



                    }
                    break;

            }


            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:49:32: ( WS )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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


            mNAME(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROMSTATEMENT"

    // $ANTLR start "WHERESATEMENT"
    public final void mWHERESATEMENT() throws RecognitionException {
        try {
            int _type = WHERESATEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:50:15: ( ( WS )+ ( 'where' | 'WHERE' ) ( WS )+ NAME )
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:50:17: ( WS )+ ( 'where' | 'WHERE' ) ( WS )+ NAME
            {
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:50:17: ( WS )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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


            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:50:21: ( 'where' | 'WHERE' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='w') ) {
                alt10=1;
            }
            else if ( (LA10_0=='W') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:50:22: 'where'
                    {
                    match("where"); 



                    }
                    break;
                case 2 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:50:30: 'WHERE'
                    {
                    match("WHERE"); 



                    }
                    break;

            }


            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:50:39: ( WS )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            mNAME(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERESATEMENT"

    // $ANTLR start "OPTION"
    public final void mOPTION() throws RecognitionException {
        try {
            int _type = OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:51:8: ( ( WS )? ( '>' | '<' | '=' ) ( WS )? )
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:51:10: ( WS )? ( '>' | '<' | '=' ) ( WS )?
            {
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:51:10: ( WS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:
                    {
                    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            if ( (input.LA(1) >= '<' && input.LA(1) <= '>') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:51:28: ( WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:
                    {
                    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


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
    // $ANTLR end "OPTION"

    // $ANTLR start "FIELDVALUE"
    public final void mFIELDVALUE() throws RecognitionException {
        try {
            int _type = FIELDVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:53:2: ( ( '\\'' NAME '\\'' ) | '0' .. '9' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\'') ) {
                alt14=1;
            }
            else if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:53:4: ( '\\'' NAME '\\'' )
                    {
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:53:4: ( '\\'' NAME '\\'' )
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:53:5: '\\'' NAME '\\''
                    {
                    match('\''); 

                    mNAME(); 


                    match('\''); 

                    }


                    }
                    break;
                case 2 :
                    // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:53:19: '0' .. '9'
                    {
                    matchRange('0','9'); 

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
    // $ANTLR end "FIELDVALUE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:54:4: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:1:8: ( SELECT | SELECTFIELD | FROMSTATEMENT | WHERESATEMENT | OPTION | FIELDVALUE | WS )
        int alt15=7;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:1:10: SELECT
                {
                mSELECT(); 


                }
                break;
            case 2 :
                // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:1:17: SELECTFIELD
                {
                mSELECTFIELD(); 


                }
                break;
            case 3 :
                // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:1:29: FROMSTATEMENT
                {
                mFROMSTATEMENT(); 


                }
                break;
            case 4 :
                // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:1:43: WHERESATEMENT
                {
                mWHERESATEMENT(); 


                }
                break;
            case 5 :
                // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:1:57: OPTION
                {
                mOPTION(); 


                }
                break;
            case 6 :
                // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:1:64: FIELDVALUE
                {
                mFIELDVALUE(); 


                }
                break;
            case 7 :
                // /C:/Documents and Settings/Administrator/git/sql4nosql/target/classes/QuerySql.g:1:75: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\6\uffff\1\16\22\uffff\1\3\3\uffff\1\36\1\uffff";
    static final String DFA15_eofS =
        "\37\uffff";
    static final String DFA15_minS =
        "\3\11\1\uffff\3\11\2\uffff\4\11\2\uffff\15\11\1\uffff\1\11\1\uffff";
    static final String DFA15_maxS =
        "\3\172\1\uffff\2\172\1\167\2\uffff\4\172\2\uffff\15\172\1\uffff"+
        "\1\40\1\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\2\3\uffff\1\5\1\6\4\uffff\1\4\1\7\15\uffff\1\3\1\uffff"+
        "\1\1";
    static final String DFA15_specialS =
        "\37\uffff}>";
    static final String[] DFA15_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\6\uffff\1\10\2\uffff\1\3\5\uffff"+
            "\12\10\2\uffff\3\7\2\uffff\5\3\1\5\14\3\1\2\7\3\6\uffff\5\3"+
            "\1\4\14\3\1\1\7\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\32\3\6"+
            "\uffff\4\3\1\11\25\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\4\3\1\12"+
            "\25\3\6\uffff\32\3",
            "",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\32\3\6"+
            "\uffff\21\3\1\13\10\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\21\3\1"+
            "\14\10\3\6\uffff\32\3",
            "\2\15\2\uffff\1\15\22\uffff\1\15\33\uffff\3\7\30\uffff\1\15"+
            "\37\uffff\1\15",
            "",
            "",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\32\3\6"+
            "\uffff\13\3\1\17\16\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\13\3\1"+
            "\20\16\3\6\uffff\32\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\32\3\6"+
            "\uffff\16\3\1\21\13\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\16\3\1"+
            "\22\13\3\6\uffff\32\3",
            "",
            "",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\32\3\6"+
            "\uffff\4\3\1\23\25\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\4\3\1\24"+
            "\25\3\6\uffff\32\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\32\3\6"+
            "\uffff\14\3\1\25\15\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\14\3\1"+
            "\26\15\3\6\uffff\32\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\32\3\6"+
            "\uffff\2\3\1\27\27\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\2\3\1\30"+
            "\27\3\6\uffff\32\3",
            "\2\31\2\uffff\1\31\22\uffff\1\31\13\uffff\1\3\24\uffff\32\3"+
            "\6\uffff\32\3",
            "\2\31\2\uffff\1\31\22\uffff\1\31\13\uffff\1\3\24\uffff\32\3"+
            "\6\uffff\32\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\32\3\6"+
            "\uffff\23\3\1\32\6\3",
            "\2\3\2\uffff\1\3\22\uffff\1\3\13\uffff\1\3\24\uffff\23\3\1"+
            "\33\6\3\6\uffff\32\3",
            "\2\31\2\uffff\1\31\22\uffff\1\31\40\uffff\32\34\6\uffff\32"+
            "\34",
            "\2\35\2\uffff\1\35\22\uffff\1\35\13\uffff\1\3\24\uffff\32\3"+
            "\6\uffff\32\3",
            "\2\35\2\uffff\1\35\22\uffff\1\35\13\uffff\1\3\24\uffff\32\3"+
            "\6\uffff\32\3",
            "",
            "\2\35\2\uffff\1\35\22\uffff\1\35",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( SELECT | SELECTFIELD | FROMSTATEMENT | WHERESATEMENT | OPTION | FIELDVALUE | WS );";
        }
    }
 

}