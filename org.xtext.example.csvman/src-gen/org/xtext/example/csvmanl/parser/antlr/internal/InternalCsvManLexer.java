package org.xtext.example.csvmanl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCsvManLexer extends Lexer {
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OP=6;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=4;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalCsvManLexer() {;} 
    public InternalCsvManLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCsvManLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCsvMan.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:11:7: ( 'delete' )
            // InternalCsvMan.g:11:9: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:12:7: ( 'copy' )
            // InternalCsvMan.g:12:9: 'copy'
            {
            match("copy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:13:7: ( 'in' )
            // InternalCsvMan.g:13:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:14:7: ( 'create' )
            // InternalCsvMan.g:14:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:15:7: ( 'load' )
            // InternalCsvMan.g:15:9: 'load'
            {
            match("load"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:16:7: ( 'as' )
            // InternalCsvMan.g:16:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:17:7: ( 'show' )
            // InternalCsvMan.g:17:9: 'show'
            {
            match("show"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:18:7: ( '(' )
            // InternalCsvMan.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:19:7: ( ',' )
            // InternalCsvMan.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:20:7: ( ')' )
            // InternalCsvMan.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:21:7: ( 'update' )
            // InternalCsvMan.g:21:9: 'update'
            {
            match("update"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:22:7: ( 'set' )
            // InternalCsvMan.g:22:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:23:7: ( 'add' )
            // InternalCsvMan.g:23:9: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:24:7: ( 'join' )
            // InternalCsvMan.g:24:9: 'join'
            {
            match("join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:25:7: ( 'remove' )
            // InternalCsvMan.g:25:9: 'remove'
            {
            match("remove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:26:7: ( 'exit' )
            // InternalCsvMan.g:26:9: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:27:7: ( 'where' )
            // InternalCsvMan.g:27:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:28:7: ( '=' )
            // InternalCsvMan.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_OP"
    public final void mRULE_OP() throws RecognitionException {
        try {
            int _type = RULE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:1405:9: ( ( '<' | '>' | '>=' | '<=' ) )
            // InternalCsvMan.g:1405:11: ( '<' | '>' | '>=' | '<=' )
            {
            // InternalCsvMan.g:1405:11: ( '<' | '>' | '>=' | '<=' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='<') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='=') ) {
                    alt1=4;
                }
                else {
                    alt1=1;}
            }
            else if ( (LA1_0=='>') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='=') ) {
                    alt1=3;
                }
                else {
                    alt1=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCsvMan.g:1405:12: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:1405:16: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // InternalCsvMan.g:1405:20: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // InternalCsvMan.g:1405:25: '<='
                    {
                    match("<="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:1407:9: ( ( '\\b' | '\\t' )* ( '\\r' | '\\n' | ';' )+ )
            // InternalCsvMan.g:1407:11: ( '\\b' | '\\t' )* ( '\\r' | '\\n' | ';' )+
            {
            // InternalCsvMan.g:1407:11: ( '\\b' | '\\t' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\b' && LA2_0<='\t')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCsvMan.g:
            	    {
            	    if ( (input.LA(1)>='\b' && input.LA(1)<='\t') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCsvMan.g:1407:24: ( '\\r' | '\\n' | ';' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n'||LA3_0=='\r'||LA3_0==';') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCsvMan.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)==';' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:1409:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCsvMan.g:1409:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCsvMan.g:1409:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCsvMan.g:1409:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCsvMan.g:1409:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCsvMan.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:1411:10: ( ( '0' .. '9' )+ )
            // InternalCsvMan.g:1411:12: ( '0' .. '9' )+
            {
            // InternalCsvMan.g:1411:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCsvMan.g:1411:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:1413:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCsvMan.g:1413:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCsvMan.g:1413:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCsvMan.g:1413:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCsvMan.g:1413:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCsvMan.g:1413:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCsvMan.g:1413:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:1413:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCsvMan.g:1413:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCsvMan.g:1413:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCsvMan.g:1413:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:1415:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCsvMan.g:1415:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCsvMan.g:1415:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCsvMan.g:1415:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:1417:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCsvMan.g:1417:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCsvMan.g:1417:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCsvMan.g:1417:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalCsvMan.g:1417:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCsvMan.g:1417:41: ( '\\r' )? '\\n'
                    {
                    // InternalCsvMan.g:1417:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalCsvMan.g:1417:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:1419:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCsvMan.g:1419:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCsvMan.g:1419:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCsvMan.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsvMan.g:1421:16: ( . )
            // InternalCsvMan.g:1421:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCsvMan.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_OP | RULE_NL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=27;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalCsvMan.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalCsvMan.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalCsvMan.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalCsvMan.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalCsvMan.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalCsvMan.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalCsvMan.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalCsvMan.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalCsvMan.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalCsvMan.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalCsvMan.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalCsvMan.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalCsvMan.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalCsvMan.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalCsvMan.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalCsvMan.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalCsvMan.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalCsvMan.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalCsvMan.g:1:118: RULE_OP
                {
                mRULE_OP(); 

                }
                break;
            case 20 :
                // InternalCsvMan.g:1:126: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 21 :
                // InternalCsvMan.g:1:134: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalCsvMan.g:1:142: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalCsvMan.g:1:151: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // InternalCsvMan.g:1:163: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalCsvMan.g:1:179: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalCsvMan.g:1:195: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalCsvMan.g:1:203: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\6\37\3\uffff\5\37\3\uffff\1\62\1\65\1\35\2\uffff\4\35\3\uffff\1\37\1\uffff\2\37\1\75\1\37\1\77\3\37\3\uffff\5\37\3\uffff\1\65\1\62\5\uffff\3\37\1\uffff\1\37\1\uffff\1\114\1\37\1\116\6\37\1\125\1\37\1\127\1\uffff\1\130\1\uffff\1\37\1\132\1\37\1\134\2\37\1\uffff\1\37\2\uffff\1\37\1\uffff\1\37\1\uffff\1\142\1\143\1\144\1\145\1\146\5\uffff";
    static final String DFA15_eofS =
        "\147\uffff";
    static final String DFA15_minS =
        "\1\0\1\145\1\157\1\156\1\157\1\144\1\145\3\uffff\1\160\1\157\1\145\1\170\1\150\3\uffff\1\10\1\11\1\101\2\uffff\2\0\1\52\1\10\3\uffff\1\154\1\uffff\1\160\1\145\1\60\1\141\1\60\1\144\1\157\1\164\3\uffff\1\144\1\151\1\155\1\151\1\145\3\uffff\1\11\1\10\5\uffff\1\145\1\171\1\141\1\uffff\1\144\1\uffff\1\60\1\167\1\60\1\141\1\156\1\157\1\164\1\162\1\164\1\60\1\164\1\60\1\uffff\1\60\1\uffff\1\164\1\60\1\166\1\60\2\145\1\uffff\1\145\2\uffff\1\145\1\uffff\1\145\1\uffff\5\60\5\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\145\1\162\1\156\1\157\1\163\1\150\3\uffff\1\160\1\157\1\145\1\170\1\150\3\uffff\1\73\1\40\1\172\2\uffff\2\uffff\1\57\1\73\3\uffff\1\154\1\uffff\1\160\1\145\1\172\1\141\1\172\1\144\1\157\1\164\3\uffff\1\144\1\151\1\155\1\151\1\145\3\uffff\1\40\1\73\5\uffff\1\145\1\171\1\141\1\uffff\1\144\1\uffff\1\172\1\167\1\172\1\141\1\156\1\157\1\164\1\162\1\164\1\172\1\164\1\172\1\uffff\1\172\1\uffff\1\164\1\172\1\166\1\172\2\145\1\uffff\1\145\2\uffff\1\145\1\uffff\1\145\1\uffff\5\172\5\uffff";
    static final String DFA15_acceptS =
        "\7\uffff\1\10\1\11\1\12\5\uffff\1\22\2\23\3\uffff\1\25\1\26\4\uffff\1\24\1\32\1\33\1\uffff\1\25\10\uffff\1\10\1\11\1\12\5\uffff\1\22\1\23\1\32\2\uffff\1\24\1\26\1\27\1\30\1\31\3\uffff\1\3\1\uffff\1\6\14\uffff\1\15\1\uffff\1\14\6\uffff\1\2\1\uffff\1\5\1\7\1\uffff\1\16\1\uffff\1\20\5\uffff\1\21\1\1\1\4\1\13\1\17";
    static final String DFA15_specialS =
        "\1\1\26\uffff\1\0\1\2\116\uffff}>";
    static final String[] DFA15_transitionS = {
            "\10\35\1\32\1\22\1\23\2\35\1\23\22\35\1\34\1\35\1\27\4\35\1\30\1\7\1\11\2\35\1\10\2\35\1\31\12\26\1\35\1\33\1\20\1\17\1\21\2\35\32\25\3\35\1\24\1\25\1\35\1\5\1\25\1\2\1\1\1\15\3\25\1\3\1\13\1\25\1\4\5\25\1\14\1\6\1\25\1\12\1\25\1\16\3\25\uff85\35",
            "\1\36",
            "\1\40\2\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\45\16\uffff\1\44",
            "\1\47\2\uffff\1\46",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "\1\65\1\64\1\63\2\uffff\1\63\55\uffff\1\65",
            "\1\62\1\63\2\uffff\1\63\22\uffff\1\62",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\67",
            "\0\67",
            "\1\70\4\uffff\1\71",
            "\3\65\2\uffff\1\65\55\uffff\1\65",
            "",
            "",
            "",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\76",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "\1\62\1\63\2\uffff\1\63\22\uffff\1\62",
            "\1\65\1\64\1\63\2\uffff\1\63\55\uffff\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\115",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\126",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\131",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\133",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "",
            "",
            "\1\140",
            "",
            "\1\141",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_OP | RULE_NL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_23 = input.LA(1);

                        s = -1;
                        if ( ((LA15_23>='\u0000' && LA15_23<='\uFFFF')) ) {s = 55;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='d') ) {s = 1;}

                        else if ( (LA15_0=='c') ) {s = 2;}

                        else if ( (LA15_0=='i') ) {s = 3;}

                        else if ( (LA15_0=='l') ) {s = 4;}

                        else if ( (LA15_0=='a') ) {s = 5;}

                        else if ( (LA15_0=='s') ) {s = 6;}

                        else if ( (LA15_0=='(') ) {s = 7;}

                        else if ( (LA15_0==',') ) {s = 8;}

                        else if ( (LA15_0==')') ) {s = 9;}

                        else if ( (LA15_0=='u') ) {s = 10;}

                        else if ( (LA15_0=='j') ) {s = 11;}

                        else if ( (LA15_0=='r') ) {s = 12;}

                        else if ( (LA15_0=='e') ) {s = 13;}

                        else if ( (LA15_0=='w') ) {s = 14;}

                        else if ( (LA15_0=='=') ) {s = 15;}

                        else if ( (LA15_0=='<') ) {s = 16;}

                        else if ( (LA15_0=='>') ) {s = 17;}

                        else if ( (LA15_0=='\t') ) {s = 18;}

                        else if ( (LA15_0=='\n'||LA15_0=='\r') ) {s = 19;}

                        else if ( (LA15_0=='^') ) {s = 20;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||(LA15_0>='f' && LA15_0<='h')||LA15_0=='k'||(LA15_0>='m' && LA15_0<='q')||LA15_0=='t'||LA15_0=='v'||(LA15_0>='x' && LA15_0<='z')) ) {s = 21;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 22;}

                        else if ( (LA15_0=='\"') ) {s = 23;}

                        else if ( (LA15_0=='\'') ) {s = 24;}

                        else if ( (LA15_0=='/') ) {s = 25;}

                        else if ( (LA15_0=='\b') ) {s = 26;}

                        else if ( (LA15_0==';') ) {s = 27;}

                        else if ( (LA15_0==' ') ) {s = 28;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\u0007')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||LA15_0==':'||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_24 = input.LA(1);

                        s = -1;
                        if ( ((LA15_24>='\u0000' && LA15_24<='\uFFFF')) ) {s = 55;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}