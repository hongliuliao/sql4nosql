// $ANTLR 3.4 /E:/workspace/sql4nosql/target/classes/QuerySql.g 2013-04-27 19:17:54

package com.sohu.sql4nosql.build;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QuerySqlLexer extends Lexer {
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

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:8:7: ( '\\'' )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:8:9: '\\''
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
    // $ANTLR end "T__18"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:57:7: ( ( 'select' | 'SELECT' ) ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:57:8: ( 'select' | 'SELECT' ) ( WS )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:57:8: ( 'select' | 'SELECT' )
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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:57:9: 'select'
                    {
                    match("select"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:57:18: 'SELECT'
                    {
                    match("SELECT"); 



                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:57:27: ( WS )+
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:58:7: ( ( WS )+ ( 'limit' | 'LIMIT' ) ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:58:10: ( WS )+ ( 'limit' | 'LIMIT' ) ( WS )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:58:10: ( WS )+
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


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:58:14: ( 'limit' | 'LIMIT' )
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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:58:15: 'limit'
                    {
                    match("limit"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:58:23: 'LIMIT'
                    {
                    match("LIMIT"); 



                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:58:32: ( WS )+
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:6: ( ( 'from' | 'FROM' ) ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:8: ( 'from' | 'FROM' ) ( WS )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:8: ( 'from' | 'FROM' )
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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:9: 'from'
                    {
                    match("from"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:16: 'FROM'
                    {
                    match("FROM"); 



                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:59:24: ( WS )+
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:7: ( ( WS )+ ( 'where' | 'WHERE' ) ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:9: ( WS )+ ( 'where' | 'WHERE' ) ( WS )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:9: ( WS )+
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


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:13: ( 'where' | 'WHERE' )
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
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:14: 'where'
                    {
                    match("where"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:22: 'WHERE'
                    {
                    match("WHERE"); 



                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:60:31: ( WS )+
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

    // $ANTLR start "ORDERBY"
    public final void mORDERBY() throws RecognitionException {
        try {
            int _type = ORDERBY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:9: ( ( WS )+ ( 'order by' | 'ORDER BY' ) ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:11: ( WS )+ ( 'order by' | 'ORDER BY' ) ( WS )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:11: ( WS )+
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:15: ( 'order by' | 'ORDER BY' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='o') ) {
                alt12=1;
            }
            else if ( (LA12_0=='O') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:16: 'order by'
                    {
                    match("order by"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:27: 'ORDER BY'
                    {
                    match("ORDER BY"); 



                    }
                    break;

            }


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:61:39: ( WS )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:62:6: ( ( 'desc' | 'DESC' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:62:8: ( 'desc' | 'DESC' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:62:8: ( 'desc' | 'DESC' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='d') ) {
                alt14=1;
            }
            else if ( (LA14_0=='D') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:62:9: 'desc'
                    {
                    match("desc"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:62:16: 'DESC'
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:63:5: ( ( 'asc' | 'ASC' ) )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:63:7: ( 'asc' | 'ASC' )
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:63:7: ( 'asc' | 'ASC' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='a') ) {
                alt15=1;
            }
            else if ( (LA15_0=='A') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:63:8: 'asc'
                    {
                    match("asc"); 



                    }
                    break;
                case 2 :
                    // /E:/workspace/sql4nosql/target/classes/QuerySql.g:63:14: 'ASC'
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:5: ( ( '0' .. '9' )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:7: ( '0' .. '9' )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:65:7: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
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
    // $ANTLR end "INT"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:66:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:66:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:66:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= 'A' && LA17_0 <= 'Z')||LA17_0=='_'||(LA17_0 >= 'a' && LA17_0 <= 'z')) ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:8: ( ( WS )? ( '>' | '<' | '=' ) ( WS )? )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:10: ( WS )? ( '>' | '<' | '=' ) ( WS )?
            {
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:10: ( WS )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0 >= '\t' && LA18_0 <= '\n')||LA18_0=='\r'||LA18_0==' ') ) {
                alt18=1;
            }
            switch (alt18) {
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


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:67:28: ( WS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0 >= '\t' && LA19_0 <= '\n')||LA19_0=='\r'||LA19_0==' ') ) {
                alt19=1;
            }
            switch (alt19) {
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:68:4: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
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
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:69:8: ( INT ( WS )+ )
            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:69:10: INT ( WS )+
            {
            mINT(); 


            // /E:/workspace/sql4nosql/target/classes/QuerySql.g:69:14: ( WS )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0 >= '\t' && LA20_0 <= '\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
        // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:8: ( T__16 | T__17 | T__18 | SELECT | LIMIT | FROM | WHERE | ORDERBY | DESC | ASC | INT | NAME | OPTION | WS | OFFSET )
        int alt21=15;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:10: T__16
                {
                mT__16(); 


                }
                break;
            case 2 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:16: T__17
                {
                mT__17(); 


                }
                break;
            case 3 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:22: T__18
                {
                mT__18(); 


                }
                break;
            case 4 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:28: SELECT
                {
                mSELECT(); 


                }
                break;
            case 5 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:35: LIMIT
                {
                mLIMIT(); 


                }
                break;
            case 6 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:41: FROM
                {
                mFROM(); 


                }
                break;
            case 7 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:46: WHERE
                {
                mWHERE(); 


                }
                break;
            case 8 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:52: ORDERBY
                {
                mORDERBY(); 


                }
                break;
            case 9 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:60: DESC
                {
                mDESC(); 


                }
                break;
            case 10 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:65: ASC
                {
                mASC(); 


                }
                break;
            case 11 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:69: INT
                {
                mINT(); 


                }
                break;
            case 12 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:73: NAME
                {
                mNAME(); 


                }
                break;
            case 13 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:78: OPTION
                {
                mOPTION(); 


                }
                break;
            case 14 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:85: WS
                {
                mWS(); 


                }
                break;
            case 15 :
                // /E:/workspace/sql4nosql/target/classes/QuerySql.g:1:88: OFFSET
                {
                mOFFSET(); 


                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\4\uffff\2\16\1\26\6\16\1\35\2\uffff\2\16\5\uffff\6\16\2\uffff\6"+
        "\16\2\55\4\16\2\61\1\uffff\2\16\2\uffff\2\16\1\uffff";
    static final String DFA21_eofS =
        "\65\uffff";
    static final String DFA21_minS =
        "\1\11\3\uffff\1\145\1\105\1\11\1\162\1\122\1\145\1\105\1\163\1\123"+
        "\1\11\2\uffff\1\154\1\114\1\uffff\1\11\3\uffff\1\157\1\117\1\163"+
        "\1\123\1\143\1\103\2\uffff\1\145\1\105\1\155\1\115\1\143\1\103\2"+
        "\101\1\143\1\103\2\11\2\101\1\uffff\1\164\1\124\2\uffff\2\11\1\uffff";
    static final String DFA21_maxS =
        "\1\172\3\uffff\1\145\1\105\1\167\1\162\1\122\1\145\1\105\1\163\1"+
        "\123\1\71\2\uffff\1\154\1\114\1\uffff\1\167\3\uffff\1\157\1\117"+
        "\1\163\1\123\1\143\1\103\2\uffff\1\145\1\105\1\155\1\115\1\143\1"+
        "\103\2\172\1\143\1\103\2\40\2\172\1\uffff\1\164\1\124\2\uffff\2"+
        "\40\1\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\1\3\12\uffff\1\14\1\15\2\uffff\1\5\1\uffff\1\7"+
        "\1\10\1\16\6\uffff\1\13\1\17\16\uffff\1\12\2\uffff\1\6\1\11\2\uffff"+
        "\1\4";
    static final String DFA21_specialS =
        "\65\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\6\uffff\1\3\2\uffff\1\1\1\uffff"+
            "\1\2\3\uffff\12\15\2\uffff\3\17\2\uffff\1\14\2\16\1\12\1\16"+
            "\1\10\14\16\1\5\7\16\4\uffff\1\16\1\uffff\1\13\2\16\1\11\1\16"+
            "\1\7\14\16\1\4\7\16",
            "",
            "",
            "",
            "\1\20",
            "\1\21",
            "\2\23\2\uffff\1\23\22\uffff\1\23\33\uffff\3\17\15\uffff\1\22"+
            "\2\uffff\1\25\7\uffff\1\24\24\uffff\1\22\2\uffff\1\25\7\uffff"+
            "\1\24",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\2\36\2\uffff\1\36\22\uffff\1\36\17\uffff\12\15",
            "",
            "",
            "\1\37",
            "\1\40",
            "",
            "\2\23\2\uffff\1\23\22\uffff\1\23\53\uffff\1\22\2\uffff\1\25"+
            "\7\uffff\1\24\24\uffff\1\22\2\uffff\1\25\7\uffff\1\24",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\32\16\4\uffff\1\16\1\uffff\32\16",
            "\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\56",
            "\1\57",
            "\2\60\2\uffff\1\60\22\uffff\1\60",
            "\2\60\2\uffff\1\60\22\uffff\1\60",
            "\32\16\4\uffff\1\16\1\uffff\32\16",
            "\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\62",
            "\1\63",
            "",
            "",
            "\2\64\2\uffff\1\64\22\uffff\1\64",
            "\2\64\2\uffff\1\64\22\uffff\1\64",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | SELECT | LIMIT | FROM | WHERE | ORDERBY | DESC | ASC | INT | NAME | OPTION | WS | OFFSET );";
        }
    }
 

}