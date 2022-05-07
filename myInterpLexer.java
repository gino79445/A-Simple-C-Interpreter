// $ANTLR 3.5.2 myInterp.g 2022-05-08 02:52:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myInterpLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__55=55;
	public static final int ADD=4;
	public static final int AND=5;
	public static final int ASSIGHNMENT=6;
	public static final int CHAR=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int COMMENT1=10;
	public static final int COMMENT2=11;
	public static final int Char=12;
	public static final int DEC_NUM=13;
	public static final int DIGIT=14;
	public static final int DIV=15;
	public static final int ELSE=16;
	public static final int EQ_OP=17;
	public static final int ESC_SEQ=18;
	public static final int FLOAT=19;
	public static final int FLOAT_NUM=20;
	public static final int FLOAT_NUM1=21;
	public static final int FLOAT_NUM2=22;
	public static final int FOR=23;
	public static final int GE_OP=24;
	public static final int GR_OP=25;
	public static final int IF=26;
	public static final int INT=27;
	public static final int Identifier=28;
	public static final int LEFT_BRACE=29;
	public static final int LEFT_BRACKET=30;
	public static final int LEFT_PARRENTHESE=31;
	public static final int LETTER=32;
	public static final int LE_OP=33;
	public static final int LS_OP=34;
	public static final int MAIN=35;
	public static final int MM_OP=36;
	public static final int MOD=37;
	public static final int MUL_POINTER=38;
	public static final int NE_OP=39;
	public static final int OR=40;
	public static final int PP_OP=41;
	public static final int PRINTF=42;
	public static final int QUESTION_MARK=43;
	public static final int RETURN=44;
	public static final int RIGHT_BRACE=45;
	public static final int RIGHT_BRACKET=46;
	public static final int RIGHT_PARRENTHESE=47;
	public static final int SCANF=48;
	public static final int SEMICOLON=49;
	public static final int STRING=50;
	public static final int SUB=51;
	public static final int VOID=52;
	public static final int WHILE=53;
	public static final int WS=54;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myInterpLexer() {} 
	public myInterpLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myInterpLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myInterp.g"; }

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:7:7: ( '&' )
			// myInterp.g:7:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:279:7: ( 'main' )
			// myInterp.g:279:9: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:280:9: ( 'printf' )
			// myInterp.g:280:11: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "SCANF"
	public final void mSCANF() throws RecognitionException {
		try {
			int _type = SCANF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:281:8: ( 'scanf' )
			// myInterp.g:281:10: 'scanf'
			{
			match("scanf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:282:6: ( 'int' )
			// myInterp.g:282:8: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:283:6: ( 'char' )
			// myInterp.g:283:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:284:6: ( 'void' )
			// myInterp.g:284:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:285:6: ( 'float' )
			// myInterp.g:285:8: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:286:7: ( 'while' )
			// myInterp.g:286:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:287:6: ( 'else' )
			// myInterp.g:287:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:288:5: ( 'for' )
			// myInterp.g:288:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:289:4: ( 'if' )
			// myInterp.g:289:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:290:9: ( 'return' )
			// myInterp.g:290:11: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:296:5: ( '+' )
			// myInterp.g:296:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:297:5: ( '-' )
			// myInterp.g:297:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:298:5: ( '/' )
			// myInterp.g:298:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "MUL_POINTER"
	public final void mMUL_POINTER() throws RecognitionException {
		try {
			int _type = MUL_POINTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:299:13: ( '*' )
			// myInterp.g:299:15: '*'
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
	// $ANTLR end "MUL_POINTER"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:300:5: ( '%' )
			// myInterp.g:300:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "GR_OP"
	public final void mGR_OP() throws RecognitionException {
		try {
			int _type = GR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:304:7: ( '>' )
			// myInterp.g:304:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GR_OP"

	// $ANTLR start "LS_OP"
	public final void mLS_OP() throws RecognitionException {
		try {
			int _type = LS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:305:7: ( '<' )
			// myInterp.g:305:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LS_OP"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:306:7: ( '==' )
			// myInterp.g:306:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:307:7: ( '<=' )
			// myInterp.g:307:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:308:7: ( '>=' )
			// myInterp.g:308:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:309:7: ( '!=' )
			// myInterp.g:309:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:311:7: ( '++' )
			// myInterp.g:311:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:312:7: ( '--' )
			// myInterp.g:312:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:314:5: ( '&&' )
			// myInterp.g:314:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:315:4: ( '||' )
			// myInterp.g:315:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:320:8: ( '\"' ( ESC_SEQ | '\"\"' |~ ( '\"' | '\\\\' ) )* '\"' )
			// myInterp.g:320:11: '\"' ( ESC_SEQ | '\"\"' |~ ( '\"' | '\\\\' ) )* '\"'
			{
			match('\"'); 
			// myInterp.g:320:15: ( ESC_SEQ | '\"\"' |~ ( '\"' | '\\\\' ) )*
			loop1:
			while (true) {
				int alt1=4;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\"') ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1=='\"') ) {
						alt1=2;
					}

				}
				else if ( (LA1_0=='\\') ) {
					alt1=1;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
					alt1=3;
				}

				switch (alt1) {
				case 1 :
					// myInterp.g:320:17: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// myInterp.g:320:25: '\"\"'
					{
					match("\"\""); 

					}
					break;
				case 3 :
					// myInterp.g:320:31: ~ ( '\"' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// myInterp.g:321:18: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) )
			// myInterp.g:321:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "Char"
	public final void mChar() throws RecognitionException {
		try {
			int _type = Char;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:322:6: ( '\\'' ( '\\\\\\'' |~ '\\'' ) '\\'' )
			// myInterp.g:322:8: '\\'' ( '\\\\\\'' |~ '\\'' ) '\\''
			{
			match('\''); 
			// myInterp.g:322:13: ( '\\\\\\'' |~ '\\'' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\\') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='\'') ) {
					int LA2_3 = input.LA(3);
					if ( (LA2_3=='\'') ) {
						alt2=1;
					}

					else {
						alt2=2;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myInterp.g:322:14: '\\\\\\''
					{
					match("\\'"); 

					}
					break;
				case 2 :
					// myInterp.g:322:21: ~ '\\''
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
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

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Char"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:325:7: ( ',' )
			// myInterp.g:325:9: ','
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

	// $ANTLR start "ASSIGHNMENT"
	public final void mASSIGHNMENT() throws RecognitionException {
		try {
			int _type = ASSIGHNMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:326:13: ( '=' )
			// myInterp.g:326:15: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGHNMENT"

	// $ANTLR start "QUESTION_MARK"
	public final void mQUESTION_MARK() throws RecognitionException {
		try {
			int _type = QUESTION_MARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:327:15: ( '?' )
			// myInterp.g:327:17: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION_MARK"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:328:7: ( ':' )
			// myInterp.g:328:8: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:329:11: ( ';' )
			// myInterp.g:329:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "LEFT_PARRENTHESE"
	public final void mLEFT_PARRENTHESE() throws RecognitionException {
		try {
			int _type = LEFT_PARRENTHESE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:330:18: ( '(' )
			// myInterp.g:330:20: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_PARRENTHESE"

	// $ANTLR start "RIGHT_PARRENTHESE"
	public final void mRIGHT_PARRENTHESE() throws RecognitionException {
		try {
			int _type = RIGHT_PARRENTHESE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:331:19: ( ')' )
			// myInterp.g:331:21: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_PARRENTHESE"

	// $ANTLR start "LEFT_BRACE"
	public final void mLEFT_BRACE() throws RecognitionException {
		try {
			int _type = LEFT_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:332:12: ( '{' )
			// myInterp.g:332:14: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_BRACE"

	// $ANTLR start "RIGHT_BRACE"
	public final void mRIGHT_BRACE() throws RecognitionException {
		try {
			int _type = RIGHT_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:333:13: ( '}' )
			// myInterp.g:333:15: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_BRACE"

	// $ANTLR start "LEFT_BRACKET"
	public final void mLEFT_BRACKET() throws RecognitionException {
		try {
			int _type = LEFT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:334:14: ( '[' )
			// myInterp.g:334:16: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_BRACKET"

	// $ANTLR start "RIGHT_BRACKET"
	public final void mRIGHT_BRACKET() throws RecognitionException {
		try {
			int _type = RIGHT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:335:15: ( ']' )
			// myInterp.g:335:17: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_BRACKET"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:338:9: ( ( DIGIT )+ )
			// myInterp.g:338:11: ( DIGIT )+
			{
			// myInterp.g:338:11: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myInterp.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:339:10: ( FLOAT_NUM1 | FLOAT_NUM2 )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
				alt4=1;
			}
			else if ( (LA4_0=='.') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// myInterp.g:339:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// myInterp.g:339:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

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
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// myInterp.g:340:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// myInterp.g:340:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// myInterp.g:340:22: ( DIGIT )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myInterp.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			match('.'); 
			// myInterp.g:340:33: ( DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myInterp.g:
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
					break loop6;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// myInterp.g:341:20: ( '.' ( DIGIT )+ )
			// myInterp.g:341:22: '.' ( DIGIT )+
			{
			match('.'); 
			// myInterp.g:341:25: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myInterp.g:
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:349:12: ( ( LETTER ) ( LETTER | DIGIT )* )
			// myInterp.g:349:14: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myInterp.g:349:22: ( LETTER | DIGIT )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myInterp.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop8;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:353:10: ( '//' ( . )* '\\n' )
			// myInterp.g:353:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// myInterp.g:353:16: ( . )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\n') ) {
					alt9=2;
				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myInterp.g:353:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop9;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:354:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myInterp.g:354:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myInterp.g:354:17: ( options {greedy=false; } : . )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='*') ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1=='/') ) {
						alt10=2;
					}
					else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
						alt10=1;
					}

				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myInterp.g:354:41: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop10;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// myInterp.g:358:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// myInterp.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// myInterp.g:359:16: ( '0' .. '9' )
			// myInterp.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:363:5: ( ( ' ' | '\\r' | '\\t' | '\\n' )+ )
			// myInterp.g:363:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			{
			// myInterp.g:363:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myInterp.g:
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
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
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

	@Override
	public void mTokens() throws RecognitionException {
		// myInterp.g:1:8: ( T__55 | MAIN | PRINTF | SCANF | INT | CHAR | VOID | FLOAT | WHILE | ELSE | FOR | IF | RETURN | ADD | SUB | DIV | MUL_POINTER | MOD | GR_OP | LS_OP | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | AND | OR | STRING | Char | COMMA | ASSIGHNMENT | QUESTION_MARK | COLON | SEMICOLON | LEFT_PARRENTHESE | RIGHT_PARRENTHESE | LEFT_BRACE | RIGHT_BRACE | LEFT_BRACKET | RIGHT_BRACKET | DEC_NUM | FLOAT_NUM | Identifier | COMMENT1 | COMMENT2 | WS )
		int alt12=47;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// myInterp.g:1:10: T__55
				{
				mT__55(); 

				}
				break;
			case 2 :
				// myInterp.g:1:16: MAIN
				{
				mMAIN(); 

				}
				break;
			case 3 :
				// myInterp.g:1:21: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 4 :
				// myInterp.g:1:28: SCANF
				{
				mSCANF(); 

				}
				break;
			case 5 :
				// myInterp.g:1:34: INT
				{
				mINT(); 

				}
				break;
			case 6 :
				// myInterp.g:1:38: CHAR
				{
				mCHAR(); 

				}
				break;
			case 7 :
				// myInterp.g:1:43: VOID
				{
				mVOID(); 

				}
				break;
			case 8 :
				// myInterp.g:1:48: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 9 :
				// myInterp.g:1:54: WHILE
				{
				mWHILE(); 

				}
				break;
			case 10 :
				// myInterp.g:1:60: ELSE
				{
				mELSE(); 

				}
				break;
			case 11 :
				// myInterp.g:1:65: FOR
				{
				mFOR(); 

				}
				break;
			case 12 :
				// myInterp.g:1:69: IF
				{
				mIF(); 

				}
				break;
			case 13 :
				// myInterp.g:1:72: RETURN
				{
				mRETURN(); 

				}
				break;
			case 14 :
				// myInterp.g:1:79: ADD
				{
				mADD(); 

				}
				break;
			case 15 :
				// myInterp.g:1:83: SUB
				{
				mSUB(); 

				}
				break;
			case 16 :
				// myInterp.g:1:87: DIV
				{
				mDIV(); 

				}
				break;
			case 17 :
				// myInterp.g:1:91: MUL_POINTER
				{
				mMUL_POINTER(); 

				}
				break;
			case 18 :
				// myInterp.g:1:103: MOD
				{
				mMOD(); 

				}
				break;
			case 19 :
				// myInterp.g:1:107: GR_OP
				{
				mGR_OP(); 

				}
				break;
			case 20 :
				// myInterp.g:1:113: LS_OP
				{
				mLS_OP(); 

				}
				break;
			case 21 :
				// myInterp.g:1:119: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 22 :
				// myInterp.g:1:125: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 23 :
				// myInterp.g:1:131: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 24 :
				// myInterp.g:1:137: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 25 :
				// myInterp.g:1:143: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 26 :
				// myInterp.g:1:149: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 27 :
				// myInterp.g:1:155: AND
				{
				mAND(); 

				}
				break;
			case 28 :
				// myInterp.g:1:159: OR
				{
				mOR(); 

				}
				break;
			case 29 :
				// myInterp.g:1:162: STRING
				{
				mSTRING(); 

				}
				break;
			case 30 :
				// myInterp.g:1:169: Char
				{
				mChar(); 

				}
				break;
			case 31 :
				// myInterp.g:1:174: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 32 :
				// myInterp.g:1:180: ASSIGHNMENT
				{
				mASSIGHNMENT(); 

				}
				break;
			case 33 :
				// myInterp.g:1:192: QUESTION_MARK
				{
				mQUESTION_MARK(); 

				}
				break;
			case 34 :
				// myInterp.g:1:206: COLON
				{
				mCOLON(); 

				}
				break;
			case 35 :
				// myInterp.g:1:212: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 36 :
				// myInterp.g:1:222: LEFT_PARRENTHESE
				{
				mLEFT_PARRENTHESE(); 

				}
				break;
			case 37 :
				// myInterp.g:1:239: RIGHT_PARRENTHESE
				{
				mRIGHT_PARRENTHESE(); 

				}
				break;
			case 38 :
				// myInterp.g:1:257: LEFT_BRACE
				{
				mLEFT_BRACE(); 

				}
				break;
			case 39 :
				// myInterp.g:1:268: RIGHT_BRACE
				{
				mRIGHT_BRACE(); 

				}
				break;
			case 40 :
				// myInterp.g:1:280: LEFT_BRACKET
				{
				mLEFT_BRACKET(); 

				}
				break;
			case 41 :
				// myInterp.g:1:293: RIGHT_BRACKET
				{
				mRIGHT_BRACKET(); 

				}
				break;
			case 42 :
				// myInterp.g:1:307: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 43 :
				// myInterp.g:1:315: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 44 :
				// myInterp.g:1:325: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 45 :
				// myInterp.g:1:336: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 46 :
				// myInterp.g:1:345: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 47 :
				// myInterp.g:1:354: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\1\uffff\1\47\12\44\1\65\1\67\1\72\2\uffff\1\74\1\76\1\100\16\uffff\1"+
		"\101\5\uffff\4\44\1\106\7\44\16\uffff\3\44\1\121\1\uffff\3\44\1\125\3"+
		"\44\1\131\2\44\1\uffff\1\134\1\135\1\44\1\uffff\1\44\1\140\1\44\1\uffff"+
		"\1\44\1\143\2\uffff\1\144\1\145\1\uffff\1\44\1\147\3\uffff\1\150\2\uffff";
	static final String DFA12_eofS =
		"\151\uffff";
	static final String DFA12_minS =
		"\1\11\1\46\1\141\1\162\1\143\1\146\1\150\1\157\1\154\1\150\1\154\1\145"+
		"\1\53\1\55\1\52\2\uffff\3\75\16\uffff\1\56\5\uffff\2\151\1\141\1\164\1"+
		"\60\1\141\1\151\1\157\1\162\1\151\1\163\1\164\16\uffff\3\156\1\60\1\uffff"+
		"\1\162\1\144\1\141\1\60\1\154\1\145\1\165\1\60\1\164\1\146\1\uffff\2\60"+
		"\1\164\1\uffff\1\145\1\60\1\162\1\uffff\1\146\1\60\2\uffff\2\60\1\uffff"+
		"\1\156\1\60\3\uffff\1\60\2\uffff";
	static final String DFA12_maxS =
		"\1\175\1\46\1\141\1\162\1\143\1\156\1\150\2\157\1\150\1\154\1\145\1\53"+
		"\1\55\1\57\2\uffff\3\75\16\uffff\1\71\5\uffff\2\151\1\141\1\164\1\172"+
		"\1\141\1\151\1\157\1\162\1\151\1\163\1\164\16\uffff\3\156\1\172\1\uffff"+
		"\1\162\1\144\1\141\1\172\1\154\1\145\1\165\1\172\1\164\1\146\1\uffff\2"+
		"\172\1\164\1\uffff\1\145\1\172\1\162\1\uffff\1\146\1\172\2\uffff\2\172"+
		"\1\uffff\1\156\1\172\3\uffff\1\172\2\uffff";
	static final String DFA12_acceptS =
		"\17\uffff\1\21\1\22\3\uffff\1\30\1\34\1\35\1\36\1\37\1\41\1\42\1\43\1"+
		"\44\1\45\1\46\1\47\1\50\1\51\1\uffff\1\53\1\54\1\57\1\33\1\1\14\uffff"+
		"\1\31\1\16\1\32\1\17\1\55\1\56\1\20\1\27\1\23\1\26\1\24\1\25\1\40\1\52"+
		"\4\uffff\1\14\12\uffff\1\5\3\uffff\1\13\3\uffff\1\2\2\uffff\1\6\1\7\2"+
		"\uffff\1\12\2\uffff\1\4\1\10\1\11\1\uffff\1\3\1\15";
	static final String DFA12_specialS =
		"\151\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\45\2\uffff\1\45\22\uffff\1\45\1\24\1\26\2\uffff\1\20\1\1\1\27\1\34"+
			"\1\35\1\17\1\14\1\30\1\15\1\43\1\16\12\42\1\32\1\33\1\22\1\23\1\21\1"+
			"\31\1\uffff\32\44\1\40\1\uffff\1\41\1\uffff\1\44\1\uffff\2\44\1\6\1\44"+
			"\1\12\1\10\2\44\1\5\3\44\1\2\2\44\1\3\1\44\1\13\1\4\2\44\1\7\1\11\3\44"+
			"\1\36\1\25\1\37",
			"\1\46",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\54\7\uffff\1\53",
			"\1\55",
			"\1\56",
			"\1\57\2\uffff\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\66",
			"\1\71\4\uffff\1\70",
			"",
			"",
			"\1\73",
			"\1\75",
			"\1\77",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\43\1\uffff\12\42",
			"",
			"",
			"",
			"",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\116",
			"\1\117",
			"\1\120",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"\1\122",
			"\1\123",
			"\1\124",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\126",
			"\1\127",
			"\1\130",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\132",
			"\1\133",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\136",
			"",
			"\1\137",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\141",
			"",
			"\1\142",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"\1\146",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"",
			"",
			"\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__55 | MAIN | PRINTF | SCANF | INT | CHAR | VOID | FLOAT | WHILE | ELSE | FOR | IF | RETURN | ADD | SUB | DIV | MUL_POINTER | MOD | GR_OP | LS_OP | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | AND | OR | STRING | Char | COMMA | ASSIGHNMENT | QUESTION_MARK | COLON | SEMICOLON | LEFT_PARRENTHESE | RIGHT_PARRENTHESE | LEFT_BRACE | RIGHT_BRACE | LEFT_BRACKET | RIGHT_BRACKET | DEC_NUM | FLOAT_NUM | Identifier | COMMENT1 | COMMENT2 | WS );";
		}
	}

}
