// $ANTLR 3.4 /E:/workspace/sql4nosql/target/classes/QuerySql.g 2013-04-27 17:14:44

package com.sohu.sql4nosql.build;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QuerySqlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int FIELDVALUE=4;
    public static final int FROM=5;
    public static final int INT=6;
    public static final int LIMIT=7;
    public static final int NAME=8;
    public static final int OFFSET=9;
    public static final int OPTION=10;
    public static final int SELECT=11;
    public static final int WHERE=12;
    public static final int WS=13;

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

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:6:7: ( '*' )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:6:9: '*'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:7:7: ( ',' )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:7:9: ','
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
    // $ANTLR end "T__15"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:7: ( ( 'select' | 'SELECT' ) ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:8: ( 'select' | 'SELECT' ) ( WS )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:8: ( 'select' | 'SELECT' )
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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:9: 'select'
                    {
                    match("select"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:18: 'SELECT'
                    {
                    match("SELECT"); 



                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:42:27: ( WS )+
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
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
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

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:43:7: ( ( WS )+ ( 'limit' | 'LIMIT' ) ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:43:10: ( WS )+ ( 'limit' | 'LIMIT' ) ( WS )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:43:10: ( WS )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:43:14: ( 'limit' | 'LIMIT' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='l') ) {
                alt4=1;
            }
            else if ( (LA4_0=='L') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:43:15: 'limit'
                    {
                    match("limit"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:43:23: 'LIMIT'
                    {
                    match("LIMIT"); 



                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:43:32: ( WS )+
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
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
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
    // $ANTLR end "LIMIT"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:44:6: ( ( 'from' | 'FROM' ) ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:44:8: ( 'from' | 'FROM' ) ( WS )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:44:8: ( 'from' | 'FROM' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='f') ) {
                alt6=1;
            }
            else if ( (LA6_0=='F') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:44:9: 'from'
                    {
                    match("from"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:44:16: 'FROM'
                    {
                    match("FROM"); 



                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:44:24: ( WS )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:45:7: ( ( WS )+ ( 'where' | 'WHERE' ) ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:45:9: ( WS )+ ( 'where' | 'WHERE' ) ( WS )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:45:9: ( WS )+
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
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
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


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:45:13: ( 'where' | 'WHERE' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='w') ) {
                alt9=1;
            }
            else if ( (LA9_0=='W') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:45:14: 'where'
                    {
                    match("where"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:45:22: 'WHERE'
                    {
                    match("WHERE"); 



                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:45:31: ( WS )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
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
    // $ANTLR end "WHERE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:47:5: ( ( '0' .. '9' )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:47:7: ( '0' .. '9' )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:47:7: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:48:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:48:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:48:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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

    // $ANTLR start "FIELDVALUE"
    public final void mFIELDVALUE() throws RecognitionException {
        try {
            int _type = FIELDVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:49:12: ( ( '\\'' NAME '\\'' ) | INT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\'') ) {
                alt13=1;
            }
            else if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:49:14: ( '\\'' NAME '\\'' )
                    {
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:49:14: ( '\\'' NAME '\\'' )
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:49:15: '\\'' NAME '\\''
                    {
                    match('\''); 

                    mNAME(); 


                    match('\''); 

                    }


                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:49:29: INT
                    {
                    mINT(); 


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

    // $ANTLR start "OPTION"
    public final void mOPTION() throws RecognitionException {
        try {
            int _type = OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:50:8: ( ( WS )? ( '>' | '<' | '=' ) ( WS )? )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:50:10: ( WS )? ( '>' | '<' | '=' ) ( WS )?
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:50:10: ( WS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||LA14_0=='\r'||LA14_0==' ') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
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


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:50:28: ( WS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0 >= '\t' && LA15_0 <= '\n')||LA15_0=='\r'||LA15_0==' ') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:51:4: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
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

    // $ANTLR start "OFFSET"
    public final void mOFFSET() throws RecognitionException {
        try {
            int _type = OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:52:8: ( INT ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:52:10: INT ( WS )+
            {
            mINT(); 


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:52:14: ( WS )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OFFSET"

    public void mTokens() throws RecognitionException {
        // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:8: ( T__14 | T__15 | SELECT | LIMIT | FROM | WHERE | INT | NAME | FIELDVALUE | OPTION | WS | OFFSET )
        int alt17=12;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:10: T__14
                {
                mT__14(); 


                }
                break;
            case 2 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:16: T__15
                {
                mT__15(); 


                }
                break;
            case 3 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:22: SELECT
                {
                mSELECT(); 


                }
                break;
            case 4 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:29: LIMIT
                {
                mLIMIT(); 


                }
                break;
            case 5 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:35: FROM
                {
                mFROM(); 


                }
                break;
            case 6 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:40: WHERE
                {
                mWHERE(); 


                }
                break;
            case 7 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:46: INT
                {
                mINT(); 


                }
                break;
            case 8 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:50: NAME
                {
                mNAME(); 


                }
                break;
            case 9 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:55: FIELDVALUE
                {
                mFIELDVALUE(); 


                }
                break;
            case 10 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:66: OPTION
                {
                mOPTION(); 


                }
                break;
            case 11 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:73: WS
                {
                mWS(); 


                }
                break;
            case 12 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:76: OFFSET
                {
                mOFFSET(); 


                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\3\uffff\2\11\1\21\2\11\1\24\3\uffff\2\11\4\uffff\2\11\2\uffff\12"+
        "\11\1\uffff\2\11\1\uffff";
    static final String DFA17_eofS =
        "\44\uffff";
    static final String DFA17_minS =
        "\1\11\2\uffff\1\145\1\105\1\11\1\162\1\122\1\11\3\uffff\1\154\1"+
        "\114\1\uffff\1\11\2\uffff\1\157\1\117\2\uffff\1\145\1\105\1\155"+
        "\1\115\1\143\1\103\2\11\1\164\1\124\1\uffff\2\11\1\uffff";
    static final String DFA17_maxS =
        "\1\172\2\uffff\1\145\1\105\1\167\1\162\1\122\1\71\3\uffff\1\154"+
        "\1\114\1\uffff\1\167\2\uffff\1\157\1\117\2\uffff\1\145\1\105\1\155"+
        "\1\115\1\143\1\103\2\40\1\164\1\124\1\uffff\2\40\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\6\uffff\1\10\1\11\1\12\2\uffff\1\4\1\uffff\1\6"+
        "\1\13\2\uffff\1\7\1\14\12\uffff\1\5\2\uffff\1\3";
    static final String DFA17_specialS =
        "\44\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\5\2\uffff\1\5\22\uffff\1\5\6\uffff\1\12\2\uffff\1\1\1\uffff"+
            "\1\2\3\uffff\12\10\2\uffff\3\13\2\uffff\5\11\1\7\14\11\1\4\7"+
            "\11\4\uffff\1\11\1\uffff\5\11\1\6\14\11\1\3\7\11",
            "",
            "",
            "\1\14",
            "\1\15",
            "\2\17\2\uffff\1\17\22\uffff\1\17\33\uffff\3\13\15\uffff\1\16"+
            "\12\uffff\1\20\24\uffff\1\16\12\uffff\1\20",
            "\1\22",
            "\1\23",
            "\2\25\2\uffff\1\25\22\uffff\1\25\17\uffff\12\10",
            "",
            "",
            "",
            "\1\26",
            "\1\27",
            "",
            "\2\17\2\uffff\1\17\22\uffff\1\17\53\uffff\1\16\12\uffff\1\20"+
            "\24\uffff\1\16\12\uffff\1\20",
            "",
            "",
            "\1\30",
            "\1\31",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\2\40\2\uffff\1\40\22\uffff\1\40",
            "\2\40\2\uffff\1\40\22\uffff\1\40",
            "\1\41",
            "\1\42",
            "",
            "\2\43\2\uffff\1\43\22\uffff\1\43",
            "\2\43\2\uffff\1\43\22\uffff\1\43",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | SELECT | LIMIT | FROM | WHERE | INT | NAME | FIELDVALUE | OPTION | WS | OFFSET );";
        }
    }
 

}