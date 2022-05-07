// $ANTLR 3.5.2 myInterp.g 2022-05-08 02:52:00

    import java.util.HashMap;
    import java.util.Scanner;
    import java.util.Iterator;
    import java.util.LinkedHashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myInterpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AND", "ASSIGHNMENT", "CHAR", 
		"COLON", "COMMA", "COMMENT1", "COMMENT2", "Char", "DEC_NUM", "DIGIT", 
		"DIV", "ELSE", "EQ_OP", "ESC_SEQ", "FLOAT", "FLOAT_NUM", "FLOAT_NUM1", 
		"FLOAT_NUM2", "FOR", "GE_OP", "GR_OP", "IF", "INT", "Identifier", "LEFT_BRACE", 
		"LEFT_BRACKET", "LEFT_PARRENTHESE", "LETTER", "LE_OP", "LS_OP", "MAIN", 
		"MM_OP", "MOD", "MUL_POINTER", "NE_OP", "OR", "PP_OP", "PRINTF", "QUESTION_MARK", 
		"RETURN", "RIGHT_BRACE", "RIGHT_BRACKET", "RIGHT_PARRENTHESE", "SCANF", 
		"SEMICOLON", "STRING", "SUB", "VOID", "WHILE", "WS", "'&'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myInterpParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myInterpParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myInterpParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myInterp.g"; }


	    //boolean TRACEON = true;
	    //HashMap memory = new HashMap();
	    Map<String, Integer> memory = new LinkedHashMap<>();
	    int[] memorySize = new int[1000];
	   
	   
	   



	// $ANTLR start "program"
	// myInterp.g:24:1: program : ( VOID | INT ) MAIN '(' ')' '{' statements[1,0] ( RETURN ( logic_arith_expression[0] )? ';' )? '}' ;
	public final void program() throws RecognitionException {
		try {
			// myInterp.g:24:8: ( ( VOID | INT ) MAIN '(' ')' '{' statements[1,0] ( RETURN ( logic_arith_expression[0] )? ';' )? '}' )
			// myInterp.g:24:9: ( VOID | INT ) MAIN '(' ')' '{' statements[1,0] ( RETURN ( logic_arith_expression[0] )? ';' )? '}'
			{
			if ( input.LA(1)==INT||input.LA(1)==VOID ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,MAIN,FOLLOW_MAIN_in_program41); if (state.failed) return;
			match(input,LEFT_PARRENTHESE,FOLLOW_LEFT_PARRENTHESE_in_program43); if (state.failed) return;
			match(input,RIGHT_PARRENTHESE,FOLLOW_RIGHT_PARRENTHESE_in_program45); if (state.failed) return;
			match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_program47); if (state.failed) return;
			pushFollow(FOLLOW_statements_in_program50);
			statements(1, 0);
			state._fsp--;
			if (state.failed) return;
			// myInterp.g:24:54: ( RETURN ( logic_arith_expression[0] )? ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==RETURN) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// myInterp.g:24:55: RETURN ( logic_arith_expression[0] )? ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_program54); if (state.failed) return;
					// myInterp.g:24:62: ( logic_arith_expression[0] )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= Char && LA1_0 <= DEC_NUM)||LA1_0==FLOAT_NUM||LA1_0==Identifier||LA1_0==LEFT_PARRENTHESE||LA1_0==SUB) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// myInterp.g:24:63: logic_arith_expression[0]
							{
							pushFollow(FOLLOW_logic_arith_expression_in_program57);
							logic_arith_expression(0);
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program64); if (state.failed) return;
					}
					break;

			}

			match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_program68); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// myInterp.g:27:1: declaration[int scope] : ( type Identifier ';' | type Identifier '=' logic_arith_expression[$scope] ';' );
	public final void declaration(int scope) throws RecognitionException {
		Token Identifier1=null;
		Token Identifier2=null;
		ParserRuleReturnScope logic_arith_expression3 =null;

		try {
			// myInterp.g:27:23: ( type Identifier ';' | type Identifier '=' logic_arith_expression[$scope] ';' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CHAR||LA3_0==FLOAT||LA3_0==INT) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==Identifier) ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2==SEMICOLON) ) {
						alt3=1;
					}
					else if ( (LA3_2==ASSIGHNMENT) ) {
						alt3=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myInterp.g:27:24: type Identifier ';'
					{
					pushFollow(FOLLOW_type_in_declaration77);
					type();
					state._fsp--;
					if (state.failed) return;
					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declaration79); if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declaration81); if (state.failed) return;
					if ( state.backtracking==0 ) { 
							String str = (Identifier1!=null?Identifier1.getText():null)+Integer.toString(scope);
							memory.put(str,0);
							memorySize[scope] = memorySize[scope]+1;
							
							
						   }
					}
					break;
				case 2 :
					// myInterp.g:34:13: type Identifier '=' logic_arith_expression[$scope] ';'
					{
					pushFollow(FOLLOW_type_in_declaration96);
					type();
					state._fsp--;
					if (state.failed) return;
					Identifier2=(Token)match(input,Identifier,FOLLOW_Identifier_in_declaration98); if (state.failed) return;
					match(input,ASSIGHNMENT,FOLLOW_ASSIGHNMENT_in_declaration100); if (state.failed) return;
					pushFollow(FOLLOW_logic_arith_expression_in_declaration102);
					logic_arith_expression3=logic_arith_expression(scope);
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declaration106); if (state.failed) return;
					if ( state.backtracking==0 ) {
					           	    String str = (Identifier2!=null?Identifier2.getText():null)+Integer.toString(scope);
						            memory.put(str,new Integer((logic_arith_expression3!=null?((myInterpParser.logic_arith_expression_return)logic_arith_expression3).value:0)));
						            memorySize[scope] = memorySize[scope]+1;
						            
					            }
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
	}
	// $ANTLR end "declaration"



	// $ANTLR start "type"
	// myInterp.g:42:1: type : ( INT | FLOAT | CHAR );
	public final void type() throws RecognitionException {
		try {
			// myInterp.g:42:5: ( INT | FLOAT | CHAR )
			// myInterp.g:
			{
			if ( input.LA(1)==CHAR||input.LA(1)==FLOAT||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myInterp.g:46:1: statements[int flag,int scope] : ( statement[$flag,$scope] statements[$flag,$scope] |);
	public final void statements(int flag, int scope) throws RecognitionException {
		try {
			// myInterp.g:46:32: ( statement[$flag,$scope] statements[$flag,$scope] |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==CHAR||(LA4_0 >= COMMENT1 && LA4_0 <= DEC_NUM)||(LA4_0 >= FLOAT && LA4_0 <= FLOAT_NUM)||(LA4_0 >= IF && LA4_0 <= Identifier)||LA4_0==LEFT_PARRENTHESE||LA4_0==PRINTF||(LA4_0 >= SCANF && LA4_0 <= SEMICOLON)||LA4_0==SUB||LA4_0==WHILE) ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= RETURN && LA4_0 <= RIGHT_BRACE)) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// myInterp.g:46:33: statement[$flag,$scope] statements[$flag,$scope]
					{
					pushFollow(FOLLOW_statement_in_statements148);
					statement(flag, scope);
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statements_in_statements151);
					statements(flag, scope);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myInterp.g:47:10: 
					{
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
	}
	// $ANTLR end "statements"


	public static class logic_arith_expression_return extends ParserRuleReturnScope {
		public int value;
	};


	// $ANTLR start "logic_arith_expression"
	// myInterp.g:49:1: logic_arith_expression[int scope] returns [int value] : a= arith_expression[$scope] ( GR_OP b= arith_expression[$scope] | LS_OP c= arith_expression[$scope] | EQ_OP d= arith_expression[$scope] | LE_OP e= arith_expression[$scope] | GE_OP f= arith_expression[$scope] | NE_OP g= arith_expression[$scope] | AND h= arith_expression[$scope] | OR i= arith_expression[$scope] )* ;
	public final myInterpParser.logic_arith_expression_return logic_arith_expression(int scope) throws RecognitionException {
		myInterpParser.logic_arith_expression_return retval = new myInterpParser.logic_arith_expression_return();
		retval.start = input.LT(1);

		int a =0;
		int b =0;
		int c =0;
		int d =0;
		int e =0;
		int f =0;
		int g =0;
		int h =0;
		int i =0;

		try {
			// myInterp.g:50:5: (a= arith_expression[$scope] ( GR_OP b= arith_expression[$scope] | LS_OP c= arith_expression[$scope] | EQ_OP d= arith_expression[$scope] | LE_OP e= arith_expression[$scope] | GE_OP f= arith_expression[$scope] | NE_OP g= arith_expression[$scope] | AND h= arith_expression[$scope] | OR i= arith_expression[$scope] )* )
			// myInterp.g:50:7: a= arith_expression[$scope] ( GR_OP b= arith_expression[$scope] | LS_OP c= arith_expression[$scope] | EQ_OP d= arith_expression[$scope] | LE_OP e= arith_expression[$scope] | GE_OP f= arith_expression[$scope] | NE_OP g= arith_expression[$scope] | AND h= arith_expression[$scope] | OR i= arith_expression[$scope] )*
			{
			pushFollow(FOLLOW_arith_expression_in_logic_arith_expression183);
			a=arith_expression(scope);
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {retval.value = a;}
			// myInterp.g:51:19: ( GR_OP b= arith_expression[$scope] | LS_OP c= arith_expression[$scope] | EQ_OP d= arith_expression[$scope] | LE_OP e= arith_expression[$scope] | GE_OP f= arith_expression[$scope] | NE_OP g= arith_expression[$scope] | AND h= arith_expression[$scope] | OR i= arith_expression[$scope] )*
			loop5:
			while (true) {
				int alt5=9;
				switch ( input.LA(1) ) {
				case GR_OP:
					{
					alt5=1;
					}
					break;
				case LS_OP:
					{
					alt5=2;
					}
					break;
				case EQ_OP:
					{
					alt5=3;
					}
					break;
				case LE_OP:
					{
					alt5=4;
					}
					break;
				case GE_OP:
					{
					alt5=5;
					}
					break;
				case NE_OP:
					{
					alt5=6;
					}
					break;
				case AND:
					{
					alt5=7;
					}
					break;
				case OR:
					{
					alt5=8;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// myInterp.g:51:21: GR_OP b= arith_expression[$scope]
					{
					match(input,GR_OP,FOLLOW_GR_OP_in_logic_arith_expression215); if (state.failed) return retval;
					pushFollow(FOLLOW_arith_expression_in_logic_arith_expression221);
					b=arith_expression(scope);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = (retval.value>b) ? 1 : 0;}
					}
					break;
				case 2 :
					// myInterp.g:52:6: LS_OP c= arith_expression[$scope]
					{
					match(input,LS_OP,FOLLOW_LS_OP_in_logic_arith_expression232); if (state.failed) return retval;
					pushFollow(FOLLOW_arith_expression_in_logic_arith_expression238);
					c=arith_expression(scope);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = (retval.value<c) ? 1 : 0;}
					}
					break;
				case 3 :
					// myInterp.g:53:6: EQ_OP d= arith_expression[$scope]
					{
					match(input,EQ_OP,FOLLOW_EQ_OP_in_logic_arith_expression250); if (state.failed) return retval;
					pushFollow(FOLLOW_arith_expression_in_logic_arith_expression256);
					d=arith_expression(scope);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = (retval.value==d) ? 1 : 0;}
					}
					break;
				case 4 :
					// myInterp.g:54:6: LE_OP e= arith_expression[$scope]
					{
					match(input,LE_OP,FOLLOW_LE_OP_in_logic_arith_expression268); if (state.failed) return retval;
					pushFollow(FOLLOW_arith_expression_in_logic_arith_expression274);
					e=arith_expression(scope);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = (retval.value<=e) ? 1 : 0;}
					}
					break;
				case 5 :
					// myInterp.g:55:6: GE_OP f= arith_expression[$scope]
					{
					match(input,GE_OP,FOLLOW_GE_OP_in_logic_arith_expression286); if (state.failed) return retval;
					pushFollow(FOLLOW_arith_expression_in_logic_arith_expression292);
					f=arith_expression(scope);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = (retval.value>=f) ? 1 : 0;}
					}
					break;
				case 6 :
					// myInterp.g:56:6: NE_OP g= arith_expression[$scope]
					{
					match(input,NE_OP,FOLLOW_NE_OP_in_logic_arith_expression304); if (state.failed) return retval;
					pushFollow(FOLLOW_arith_expression_in_logic_arith_expression310);
					g=arith_expression(scope);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = (retval.value!=g) ? 1 : 0;}
					}
					break;
				case 7 :
					// myInterp.g:57:6: AND h= arith_expression[$scope]
					{
					match(input,AND,FOLLOW_AND_in_logic_arith_expression322); if (state.failed) return retval;
					pushFollow(FOLLOW_arith_expression_in_logic_arith_expression329);
					h=arith_expression(scope);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = ((retval.value!=1)||(h !=1) )? 0 : 1;}
					}
					break;
				case 8 :
					// myInterp.g:58:6: OR i= arith_expression[$scope]
					{
					match(input,OR,FOLLOW_OR_in_logic_arith_expression342); if (state.failed) return retval;
					pushFollow(FOLLOW_arith_expression_in_logic_arith_expression349);
					i=arith_expression(scope);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = ((retval.value ==1)|| (i ==1 ) )? 1 : 0;}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logic_arith_expression"



	// $ANTLR start "arith_expression"
	// myInterp.g:62:1: arith_expression[int scope] returns [int value] : a= multExpr[$scope] ( ADD b= multExpr[$scope] | SUB c= multExpr[$scope] )* ;
	public final int arith_expression(int scope) throws RecognitionException {
		int value = 0;


		int a =0;
		int b =0;
		int c =0;

		try {
			// myInterp.g:62:48: (a= multExpr[$scope] ( ADD b= multExpr[$scope] | SUB c= multExpr[$scope] )* )
			// myInterp.g:63:4: a= multExpr[$scope] ( ADD b= multExpr[$scope] | SUB c= multExpr[$scope] )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression408);
			a=multExpr(scope);
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {value = a;}
			// myInterp.g:64:18: ( ADD b= multExpr[$scope] | SUB c= multExpr[$scope] )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ADD) ) {
					alt6=1;
				}
				else if ( (LA6_0==SUB) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// myInterp.g:64:20: ADD b= multExpr[$scope]
					{
					match(input,ADD,FOLLOW_ADD_in_arith_expression432); if (state.failed) return value;
					pushFollow(FOLLOW_multExpr_in_arith_expression438);
					b=multExpr(scope);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = value+b;}
					}
					break;
				case 2 :
					// myInterp.g:65:20: SUB c= multExpr[$scope]
					{
					match(input,SUB,FOLLOW_SUB_in_arith_expression461); if (state.failed) return value;
					pushFollow(FOLLOW_multExpr_in_arith_expression467);
					c=multExpr(scope);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = value-c;}
					}
					break;

				default :
					break loop6;
				}
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
		return value;
	}
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myInterp.g:68:1: multExpr[int scope] returns [int value] : a= signExpr[$scope] ( MUL_POINTER b= signExpr[$scope] | DIV c= signExpr[$scope] | MOD d= signExpr[$scope] )* ;
	public final int multExpr(int scope) throws RecognitionException {
		int value = 0;


		int a =0;
		int b =0;
		int c =0;
		int d =0;

		try {
			// myInterp.g:68:40: (a= signExpr[$scope] ( MUL_POINTER b= signExpr[$scope] | DIV c= signExpr[$scope] | MOD d= signExpr[$scope] )* )
			// myInterp.g:68:42: a= signExpr[$scope] ( MUL_POINTER b= signExpr[$scope] | DIV c= signExpr[$scope] | MOD d= signExpr[$scope] )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr511);
			a=signExpr(scope);
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {value = a;}
			// myInterp.g:69:11: ( MUL_POINTER b= signExpr[$scope] | DIV c= signExpr[$scope] | MOD d= signExpr[$scope] )*
			loop7:
			while (true) {
				int alt7=4;
				switch ( input.LA(1) ) {
				case MUL_POINTER:
					{
					alt7=1;
					}
					break;
				case DIV:
					{
					alt7=2;
					}
					break;
				case MOD:
					{
					alt7=3;
					}
					break;
				}
				switch (alt7) {
				case 1 :
					// myInterp.g:69:13: MUL_POINTER b= signExpr[$scope]
					{
					match(input,MUL_POINTER,FOLLOW_MUL_POINTER_in_multExpr528); if (state.failed) return value;
					pushFollow(FOLLOW_signExpr_in_multExpr534);
					b=signExpr(scope);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = value*b;}
					}
					break;
				case 2 :
					// myInterp.g:70:13: DIV c= signExpr[$scope]
					{
					match(input,DIV,FOLLOW_DIV_in_multExpr552); if (state.failed) return value;
					pushFollow(FOLLOW_signExpr_in_multExpr558);
					c=signExpr(scope);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = value/c;}
					}
					break;
				case 3 :
					// myInterp.g:71:13: MOD d= signExpr[$scope]
					{
					match(input,MOD,FOLLOW_MOD_in_multExpr576); if (state.failed) return value;
					pushFollow(FOLLOW_signExpr_in_multExpr582);
					d=signExpr(scope);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = value%d;}
					}
					break;

				default :
					break loop7;
				}
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
		return value;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myInterp.g:75:1: signExpr[int scope] returns [int value] : (a= primaryExpr[$scope] | '-' b= primaryExpr[$scope] );
	public final int signExpr(int scope) throws RecognitionException {
		int value = 0;


		int a =0;
		int b =0;

		try {
			// myInterp.g:75:40: (a= primaryExpr[$scope] | '-' b= primaryExpr[$scope] )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= Char && LA8_0 <= DEC_NUM)||LA8_0==FLOAT_NUM||LA8_0==Identifier||LA8_0==LEFT_PARRENTHESE) ) {
				alt8=1;
			}
			else if ( (LA8_0==SUB) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// myInterp.g:76:2: a= primaryExpr[$scope]
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr623);
					a=primaryExpr(scope);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = a;}
					}
					break;
				case 2 :
					// myInterp.g:77:11: '-' b= primaryExpr[$scope]
					{
					match(input,SUB,FOLLOW_SUB_in_signExpr638); if (state.failed) return value;
					pushFollow(FOLLOW_primaryExpr_in_signExpr644);
					b=primaryExpr(scope);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = 0- b;}
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
		return value;
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myInterp.g:80:1: primaryExpr[int scope] returns [int value] : ( DEC_NUM | FLOAT_NUM | Identifier | Char | '(' logic_arith_expression[$scope] ')' );
	public final int primaryExpr(int scope) throws RecognitionException {
		int value = 0;


		Token DEC_NUM4=null;
		Token Identifier5=null;
		ParserRuleReturnScope logic_arith_expression6 =null;

		try {
			// myInterp.g:81:4: ( DEC_NUM | FLOAT_NUM | Identifier | Char | '(' logic_arith_expression[$scope] ')' )
			int alt9=5;
			switch ( input.LA(1) ) {
			case DEC_NUM:
				{
				alt9=1;
				}
				break;
			case FLOAT_NUM:
				{
				alt9=2;
				}
				break;
			case Identifier:
				{
				alt9=3;
				}
				break;
			case Char:
				{
				alt9=4;
				}
				break;
			case LEFT_PARRENTHESE:
				{
				alt9=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// myInterp.g:81:6: DEC_NUM
					{
					DEC_NUM4=(Token)match(input,DEC_NUM,FOLLOW_DEC_NUM_in_primaryExpr670); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = Integer.parseInt((DEC_NUM4!=null?DEC_NUM4.getText():null));}
					}
					break;
				case 2 :
					// myInterp.g:82:14: FLOAT_NUM
					{
					match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_primaryExpr688); if (state.failed) return value;
					}
					break;
				case 3 :
					// myInterp.g:83:14: Identifier
					{
					Identifier5=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr704); if (state.failed) return value;
					if ( state.backtracking==0 ) {    
					           	String str = (Identifier5!=null?Identifier5.getText():null)+Integer.toString(scope);
							Integer v = (Integer)memory.get(str);
							if(v!=null)
								value = v.intValue();
							while(v==null){
									scope = scope -1;
									if (scope<0){
										System.err.println("undefined var: "+(Identifier5!=null?Identifier5.getText():null));
										break;
									}
									str = (Identifier5!=null?Identifier5.getText():null)+Integer.toString(scope);
									v = (Integer)memory.get(str);

									if(v!=null)
										value = v.intValue();
										
									
									
							}
						   }
					}
					break;
				case 4 :
					// myInterp.g:107:14: Char
					{
					match(input,Char,FOLLOW_Char_in_primaryExpr746); if (state.failed) return value;
					}
					break;
				case 5 :
					// myInterp.g:108:7: '(' logic_arith_expression[$scope] ')'
					{
					match(input,LEFT_PARRENTHESE,FOLLOW_LEFT_PARRENTHESE_in_primaryExpr755); if (state.failed) return value;
					pushFollow(FOLLOW_logic_arith_expression_in_primaryExpr757);
					logic_arith_expression6=logic_arith_expression(scope);
					state._fsp--;
					if (state.failed) return value;
					match(input,RIGHT_PARRENTHESE,FOLLOW_RIGHT_PARRENTHESE_in_primaryExpr760); if (state.failed) return value;
					if ( state.backtracking==0 ) {value = (logic_arith_expression6!=null?((myInterpParser.logic_arith_expression_return)logic_arith_expression6).value:0);}
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
		return value;
	}
	// $ANTLR end "primaryExpr"



	// $ANTLR start "statement"
	// myInterp.g:112:1: statement[int flag,int scope] : ( Identifier '=' logic_arith_expression[$scope] ';' | IF '(' logic_arith_expression[$scope] ')' if_statements[(($logic_arith_expression.value>=1)&&($flag>=1))?1:0,scope+1] ( ( ELSE )=> ELSE else_statements[(($logic_arith_expression.value>=1)||($flag<1))?1:0,scope+1] |) | logic_arith_expression[$scope] ';' | WHILE '(' logic_arith_expression[$scope] ')' if_statements[1,$scope] | SCANF '(' STRING ',' '&' q= Identifier ( ',' '&' w= Identifier )? ')' ';' | PRINTF '(' STRING ( ',' a= logic_arith_expression[$scope] ( ',' b= logic_arith_expression[$scope] )? )? ')' ';' | declaration[$scope] | ';' | COMMENT1 | COMMENT2 );
	public final void statement(int flag, int scope) throws RecognitionException {
		Token q=null;
		Token w=null;
		Token Identifier7=null;
		Token STRING10=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope logic_arith_expression8 =null;
		ParserRuleReturnScope logic_arith_expression9 =null;

		try {
			// myInterp.g:112:30: ( Identifier '=' logic_arith_expression[$scope] ';' | IF '(' logic_arith_expression[$scope] ')' if_statements[(($logic_arith_expression.value>=1)&&($flag>=1))?1:0,scope+1] ( ( ELSE )=> ELSE else_statements[(($logic_arith_expression.value>=1)||($flag<1))?1:0,scope+1] |) | logic_arith_expression[$scope] ';' | WHILE '(' logic_arith_expression[$scope] ')' if_statements[1,$scope] | SCANF '(' STRING ',' '&' q= Identifier ( ',' '&' w= Identifier )? ')' ';' | PRINTF '(' STRING ( ',' a= logic_arith_expression[$scope] ( ',' b= logic_arith_expression[$scope] )? )? ')' ';' | declaration[$scope] | ';' | COMMENT1 | COMMENT2 )
			int alt14=10;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA14_1 = input.LA(2);
				if ( (LA14_1==ASSIGHNMENT) ) {
					alt14=1;
				}
				else if ( ((LA14_1 >= ADD && LA14_1 <= AND)||LA14_1==DIV||LA14_1==EQ_OP||(LA14_1 >= GE_OP && LA14_1 <= GR_OP)||(LA14_1 >= LE_OP && LA14_1 <= LS_OP)||(LA14_1 >= MOD && LA14_1 <= OR)||LA14_1==SEMICOLON||LA14_1==SUB) ) {
					alt14=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt14=2;
				}
				break;
			case Char:
			case DEC_NUM:
			case FLOAT_NUM:
			case LEFT_PARRENTHESE:
			case SUB:
				{
				alt14=3;
				}
				break;
			case WHILE:
				{
				alt14=4;
				}
				break;
			case SCANF:
				{
				alt14=5;
				}
				break;
			case PRINTF:
				{
				alt14=6;
				}
				break;
			case CHAR:
			case FLOAT:
			case INT:
				{
				alt14=7;
				}
				break;
			case SEMICOLON:
				{
				alt14=8;
				}
				break;
			case COMMENT1:
				{
				alt14=9;
				}
				break;
			case COMMENT2:
				{
				alt14=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// myInterp.g:112:32: Identifier '=' logic_arith_expression[$scope] ';'
					{
					Identifier7=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement784); if (state.failed) return;
					match(input,ASSIGHNMENT,FOLLOW_ASSIGHNMENT_in_statement786); if (state.failed) return;
					pushFollow(FOLLOW_logic_arith_expression_in_statement788);
					logic_arith_expression8=logic_arith_expression(scope);
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement791); if (state.failed) return;
					if ( state.backtracking==0 ) {
						   	if(flag>=1){
						   		String str = (Identifier7!=null?Identifier7.getText():null)+Integer.toString(scope);
								Integer v = (Integer)memory.get(str);
								if(v!=null)
									memory.replace(str, (logic_arith_expression8!=null?((myInterpParser.logic_arith_expression_return)logic_arith_expression8).value:0));
								while(v==null){
									scope = scope -1;
									if (scope<0){
										System.err.println("undefined var: "+(Identifier7!=null?Identifier7.getText():null));
										break;
									}
									str = (Identifier7!=null?Identifier7.getText():null)+Integer.toString(scope);
									v = (Integer)memory.get(str);

									if(v!=null){
										memory.replace(str, (logic_arith_expression8!=null?((myInterpParser.logic_arith_expression_return)logic_arith_expression8).value:0));
										
									}
									
								}
								
								
							}
						   }
					}
					break;
				case 2 :
					// myInterp.g:138:11: IF '(' logic_arith_expression[$scope] ')' if_statements[(($logic_arith_expression.value>=1)&&($flag>=1))?1:0,scope+1] ( ( ELSE )=> ELSE else_statements[(($logic_arith_expression.value>=1)||($flag<1))?1:0,scope+1] |)
					{
					match(input,IF,FOLLOW_IF_in_statement809); if (state.failed) return;
					match(input,LEFT_PARRENTHESE,FOLLOW_LEFT_PARRENTHESE_in_statement811); if (state.failed) return;
					pushFollow(FOLLOW_logic_arith_expression_in_statement813);
					logic_arith_expression9=logic_arith_expression(scope);
					state._fsp--;
					if (state.failed) return;
					match(input,RIGHT_PARRENTHESE,FOLLOW_RIGHT_PARRENTHESE_in_statement815); if (state.failed) return;
					pushFollow(FOLLOW_if_statements_in_statement827);
					if_statements((((logic_arith_expression9!=null?((myInterpParser.logic_arith_expression_return)logic_arith_expression9).value:0)>=1)&&(flag>=1))?1:0, scope+1);
					state._fsp--;
					if (state.failed) return;
					// myInterp.g:139:86: ( ( ELSE )=> ELSE else_statements[(($logic_arith_expression.value>=1)||($flag<1))?1:0,scope+1] |)
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ELSE) ) {
						int LA10_1 = input.LA(2);
						if ( (synpred1_myInterp()) ) {
							alt10=1;
						}
						else if ( (true) ) {
							alt10=2;
						}

					}
					else if ( (LA10_0==CHAR||(LA10_0 >= COMMENT1 && LA10_0 <= DEC_NUM)||(LA10_0 >= FLOAT && LA10_0 <= FLOAT_NUM)||(LA10_0 >= IF && LA10_0 <= Identifier)||LA10_0==LEFT_PARRENTHESE||LA10_0==PRINTF||(LA10_0 >= RETURN && LA10_0 <= RIGHT_BRACE)||(LA10_0 >= SCANF && LA10_0 <= SEMICOLON)||LA10_0==SUB||LA10_0==WHILE) ) {
						alt10=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// myInterp.g:139:87: ( ELSE )=> ELSE else_statements[(($logic_arith_expression.value>=1)||($flag<1))?1:0,scope+1]
							{
							match(input,ELSE,FOLLOW_ELSE_in_statement837); if (state.failed) return;
							pushFollow(FOLLOW_else_statements_in_statement839);
							else_statements((((logic_arith_expression9!=null?((myInterpParser.logic_arith_expression_return)logic_arith_expression9).value:0)>=1)||(flag<1))?1:0, scope+1);
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// myInterp.g:139:181: 
							{
							}
							break;

					}

					if ( state.backtracking==0 ) {
						
							
						
						
							
							Iterator<Map.Entry<String, Integer>> it = memory.entrySet().iterator();
							int i=1;
							int n = memory.size();
							
							while(it.hasNext())
							{ 	
								it.next();
								if(n-i<memorySize[scope+1]){
									//System.out.println("s");
									//System.out.println(memorySize[scope+1]);
									it.remove();
								}
								
								
								 
								i=i+1;
							} 
							//System.out.println(memory);

						}
					}
					break;
				case 3 :
					// myInterp.g:167:4: logic_arith_expression[$scope] ';'
					{
					pushFollow(FOLLOW_logic_arith_expression_in_statement856);
					logic_arith_expression(scope);
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement859); if (state.failed) return;
					}
					break;
				case 4 :
					// myInterp.g:170:4: WHILE '(' logic_arith_expression[$scope] ')' if_statements[1,$scope]
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement869); if (state.failed) return;
					match(input,LEFT_PARRENTHESE,FOLLOW_LEFT_PARRENTHESE_in_statement871); if (state.failed) return;
					pushFollow(FOLLOW_logic_arith_expression_in_statement873);
					logic_arith_expression(scope);
					state._fsp--;
					if (state.failed) return;
					match(input,RIGHT_PARRENTHESE,FOLLOW_RIGHT_PARRENTHESE_in_statement876); if (state.failed) return;
					pushFollow(FOLLOW_if_statements_in_statement878);
					if_statements(1, scope);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myInterp.g:171:4: SCANF '(' STRING ',' '&' q= Identifier ( ',' '&' w= Identifier )? ')' ';'
					{
					match(input,SCANF,FOLLOW_SCANF_in_statement884); if (state.failed) return;
					match(input,LEFT_PARRENTHESE,FOLLOW_LEFT_PARRENTHESE_in_statement886); if (state.failed) return;
					match(input,STRING,FOLLOW_STRING_in_statement887); if (state.failed) return;
					match(input,COMMA,FOLLOW_COMMA_in_statement889); if (state.failed) return;
					match(input,55,FOLLOW_55_in_statement891); if (state.failed) return;
					q=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement897); if (state.failed) return;
					// myInterp.g:171:42: ( ',' '&' w= Identifier )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==COMMA) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// myInterp.g:171:43: ',' '&' w= Identifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_statement899); if (state.failed) return;
							match(input,55,FOLLOW_55_in_statement901); if (state.failed) return;
							w=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement907); if (state.failed) return;
							}
							break;

					}

					match(input,RIGHT_PARRENTHESE,FOLLOW_RIGHT_PARRENTHESE_in_statement913); if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement915); if (state.failed) return;
					if ( state.backtracking==0 ) {
						 	if(flag>=1){
							 	Scanner sc = new Scanner(System.in);  
							 	String q1 = (q!=null?q.getText():null)+Integer.toString(scope);
							 	String w1 = (w!=null?w.getText():null)+Integer.toString(scope);
						            	
							 	if((w!=null?w.getText():null) == null ){
							 		int num = sc.nextInt();
									Integer v = (Integer)memory.get(q1);
									if (v != null)
										memory.replace(q1, num);
									else
										System.err.println("undefined var: "+q1);
							 		
							 	}else{
							 		int num1 = sc.nextInt();
							 		int num2 = sc.nextInt();
									Integer v1 = (Integer)memory.get(q1);
									Integer v2 = (Integer)memory.get(w1);
									if (v1 != null && v2 !=null){
										memory.replace(q1, num1);
										memory.replace(w1, num2);
									}else{
										System.err.println("undefined var: "+q1);
										System.err.println("undefined var: "+w1);
							 		}
							 	
							 	}
						 	}
						 
						 }
					}
					break;
				case 6 :
					// myInterp.g:203:4: PRINTF '(' STRING ( ',' a= logic_arith_expression[$scope] ( ',' b= logic_arith_expression[$scope] )? )? ')' ';'
					{
					match(input,PRINTF,FOLLOW_PRINTF_in_statement924); if (state.failed) return;
					match(input,LEFT_PARRENTHESE,FOLLOW_LEFT_PARRENTHESE_in_statement926); if (state.failed) return;
					STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_statement927); if (state.failed) return;
					// myInterp.g:203:21: ( ',' a= logic_arith_expression[$scope] ( ',' b= logic_arith_expression[$scope] )? )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==COMMA) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// myInterp.g:203:22: ',' a= logic_arith_expression[$scope] ( ',' b= logic_arith_expression[$scope] )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_statement930); if (state.failed) return;
							pushFollow(FOLLOW_logic_arith_expression_in_statement936);
							a=logic_arith_expression(scope);
							state._fsp--;
							if (state.failed) return;
							// myInterp.g:203:60: ( ',' b= logic_arith_expression[$scope] )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==COMMA) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// myInterp.g:203:61: ',' b= logic_arith_expression[$scope]
									{
									match(input,COMMA,FOLLOW_COMMA_in_statement939); if (state.failed) return;
									pushFollow(FOLLOW_logic_arith_expression_in_statement945);
									b=logic_arith_expression(scope);
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;

					}

					match(input,RIGHT_PARRENTHESE,FOLLOW_RIGHT_PARRENTHESE_in_statement954); if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement956); if (state.failed) return;
					if ( state.backtracking==0 ) {
						 	if(flag>=1){
						 	
							 	String str = (STRING10!=null?STRING10.getText():null);
							 	
							 	str = str.substring(1, str.length()-1);
						
						 //	str = str.replace("\\n","%n");
							 	for( int i=0;i<str.length();i++){
							 		if(str.charAt(i)=='\\'){
							 			if(str.charAt(i+1)=='\\'){
							 				str = str.substring(0, i+1) + str.substring(i+2,str.length() );
							 				
							 				
							 			}else if(str.charAt(i+1)=='n'){
							 				str = str.substring(0, i)+ '%' + str.substring(i+1,str.length() );
							 				i=i+1;
							 			}else if(str.charAt(i+1)=='t'){
							 				str = str.substring(0, i)+ "    " + str.substring(i+2,str.length() );
							 				i=i+1;
							 			}else if(str.charAt(i+1)=='\"'){
							 				str = str.substring(0, i)+ "\"" + str.substring(i+2,str.length() );
							 				
							 			}
						
						 			}
							 	}
							 	
							 	if((a!=null?input.toString(a.start,a.stop):null) == null){
							 		System.out.printf(str);
							 		
							 	}else if((b!=null?input.toString(b.start,b.stop):null) == null ){
						
						 		System.out.printf(str,(a!=null?((myInterpParser.logic_arith_expression_return)a).value:0));
							 	}else{
							 			
							 		System.out.printf(str,(a!=null?((myInterpParser.logic_arith_expression_return)a).value:0),(b!=null?((myInterpParser.logic_arith_expression_return)b).value:0));
							 	
							 	}
						 	
						 	}
						 	
						 
						 
						 }
					}
					break;
				case 7 :
					// myInterp.g:250:4: declaration[$scope]
					{
					pushFollow(FOLLOW_declaration_in_statement968);
					declaration(scope);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// myInterp.g:251:4: ';'
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement974); if (state.failed) return;
					}
					break;
				case 9 :
					// myInterp.g:252:4: COMMENT1
					{
					match(input,COMMENT1,FOLLOW_COMMENT1_in_statement979); if (state.failed) return;
					}
					break;
				case 10 :
					// myInterp.g:253:4: COMMENT2
					{
					match(input,COMMENT2,FOLLOW_COMMENT2_in_statement985); if (state.failed) return;
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
	}
	// $ANTLR end "statement"



	// $ANTLR start "if_statements"
	// myInterp.g:262:1: if_statements[int flag,int scope] : ( statement[$flag,scope] | '{' statements[$flag,scope] '}' );
	public final void if_statements(int flag, int scope) throws RecognitionException {
		try {
			// myInterp.g:262:35: ( statement[$flag,scope] | '{' statements[$flag,scope] '}' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CHAR||(LA15_0 >= COMMENT1 && LA15_0 <= DEC_NUM)||(LA15_0 >= FLOAT && LA15_0 <= FLOAT_NUM)||(LA15_0 >= IF && LA15_0 <= Identifier)||LA15_0==LEFT_PARRENTHESE||LA15_0==PRINTF||(LA15_0 >= SCANF && LA15_0 <= SEMICOLON)||LA15_0==SUB||LA15_0==WHILE) ) {
				alt15=1;
			}
			else if ( (LA15_0==LEFT_BRACE) ) {
				alt15=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// myInterp.g:263:3: statement[$flag,scope]
					{
					pushFollow(FOLLOW_statement_in_if_statements1014);
					statement(flag, scope);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myInterp.g:264:19: '{' statements[$flag,scope] '}'
					{
					match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_if_statements1035); if (state.failed) return;
					pushFollow(FOLLOW_statements_in_if_statements1037);
					statements(flag, scope);
					state._fsp--;
					if (state.failed) return;
					match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_if_statements1040); if (state.failed) return;
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
	}
	// $ANTLR end "if_statements"



	// $ANTLR start "else_statements"
	// myInterp.g:268:1: else_statements[int flag,int scope] : ( statement[($flag<1)? 1 : 0,scope] | '{' statements[($flag<1)? 1 : 0,scope] '}' );
	public final void else_statements(int flag, int scope) throws RecognitionException {
		try {
			// myInterp.g:268:37: ( statement[($flag<1)? 1 : 0,scope] | '{' statements[($flag<1)? 1 : 0,scope] '}' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==CHAR||(LA16_0 >= COMMENT1 && LA16_0 <= DEC_NUM)||(LA16_0 >= FLOAT && LA16_0 <= FLOAT_NUM)||(LA16_0 >= IF && LA16_0 <= Identifier)||LA16_0==LEFT_PARRENTHESE||LA16_0==PRINTF||(LA16_0 >= SCANF && LA16_0 <= SEMICOLON)||LA16_0==SUB||LA16_0==WHILE) ) {
				alt16=1;
			}
			else if ( (LA16_0==LEFT_BRACE) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// myInterp.g:269:3: statement[($flag<1)? 1 : 0,scope]
					{
					pushFollow(FOLLOW_statement_in_else_statements1094);
					statement((flag<1)? 1 : 0, scope);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myInterp.g:270:19: '{' statements[($flag<1)? 1 : 0,scope] '}'
					{
					match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_else_statements1115); if (state.failed) return;
					pushFollow(FOLLOW_statements_in_else_statements1117);
					statements((flag<1)? 1 : 0, scope);
					state._fsp--;
					if (state.failed) return;
					match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_else_statements1120); if (state.failed) return;
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
	}
	// $ANTLR end "else_statements"

	// $ANTLR start synpred1_myInterp
	public final void synpred1_myInterp_fragment() throws RecognitionException {
		// myInterp.g:139:87: ( ELSE )
		// myInterp.g:139:88: ELSE
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred1_myInterp832); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_myInterp

	// Delegated rules

	public final boolean synpred1_myInterp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_myInterp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_set_in_program35 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_MAIN_in_program41 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LEFT_PARRENTHESE_in_program43 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RIGHT_PARRENTHESE_in_program45 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LEFT_BRACE_in_program47 = new BitSet(new long[]{0x002B34009C183C80L});
	public static final BitSet FOLLOW_statements_in_program50 = new BitSet(new long[]{0x0000300000000000L});
	public static final BitSet FOLLOW_RETURN_in_program54 = new BitSet(new long[]{0x000A000090103000L});
	public static final BitSet FOLLOW_logic_arith_expression_in_program57 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program64 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RIGHT_BRACE_in_program68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration77 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_declaration79 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declaration81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declaration96 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_declaration98 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGHNMENT_in_declaration100 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_logic_arith_expression_in_declaration102 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declaration106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements148 = new BitSet(new long[]{0x002B04009C183C80L});
	public static final BitSet FOLLOW_statements_in_statements151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_logic_arith_expression183 = new BitSet(new long[]{0x0000018603020022L});
	public static final BitSet FOLLOW_GR_OP_in_logic_arith_expression215 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_arith_expression_in_logic_arith_expression221 = new BitSet(new long[]{0x0000018603020022L});
	public static final BitSet FOLLOW_LS_OP_in_logic_arith_expression232 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_arith_expression_in_logic_arith_expression238 = new BitSet(new long[]{0x0000018603020022L});
	public static final BitSet FOLLOW_EQ_OP_in_logic_arith_expression250 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_arith_expression_in_logic_arith_expression256 = new BitSet(new long[]{0x0000018603020022L});
	public static final BitSet FOLLOW_LE_OP_in_logic_arith_expression268 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_arith_expression_in_logic_arith_expression274 = new BitSet(new long[]{0x0000018603020022L});
	public static final BitSet FOLLOW_GE_OP_in_logic_arith_expression286 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_arith_expression_in_logic_arith_expression292 = new BitSet(new long[]{0x0000018603020022L});
	public static final BitSet FOLLOW_NE_OP_in_logic_arith_expression304 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_arith_expression_in_logic_arith_expression310 = new BitSet(new long[]{0x0000018603020022L});
	public static final BitSet FOLLOW_AND_in_logic_arith_expression322 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_arith_expression_in_logic_arith_expression329 = new BitSet(new long[]{0x0000018603020022L});
	public static final BitSet FOLLOW_OR_in_logic_arith_expression342 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_arith_expression_in_logic_arith_expression349 = new BitSet(new long[]{0x0000018603020022L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression408 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_ADD_in_arith_expression432 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression438 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_SUB_in_arith_expression461 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression467 = new BitSet(new long[]{0x0008000000000012L});
	public static final BitSet FOLLOW_signExpr_in_multExpr511 = new BitSet(new long[]{0x0000006000008002L});
	public static final BitSet FOLLOW_MUL_POINTER_in_multExpr528 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr534 = new BitSet(new long[]{0x0000006000008002L});
	public static final BitSet FOLLOW_DIV_in_multExpr552 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr558 = new BitSet(new long[]{0x0000006000008002L});
	public static final BitSet FOLLOW_MOD_in_multExpr576 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr582 = new BitSet(new long[]{0x0000006000008002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_signExpr638 = new BitSet(new long[]{0x0000000090103000L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_NUM_in_primaryExpr670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_NUM_in_primaryExpr688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Char_in_primaryExpr746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARRENTHESE_in_primaryExpr755 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_logic_arith_expression_in_primaryExpr757 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RIGHT_PARRENTHESE_in_primaryExpr760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement784 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGHNMENT_in_statement786 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_logic_arith_expression_in_statement788 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement809 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LEFT_PARRENTHESE_in_statement811 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_logic_arith_expression_in_statement813 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RIGHT_PARRENTHESE_in_statement815 = new BitSet(new long[]{0x002B0400BC183C80L});
	public static final BitSet FOLLOW_if_statements_in_statement827 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_ELSE_in_statement837 = new BitSet(new long[]{0x002B0400BC183C80L});
	public static final BitSet FOLLOW_else_statements_in_statement839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logic_arith_expression_in_statement856 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement869 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LEFT_PARRENTHESE_in_statement871 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_logic_arith_expression_in_statement873 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RIGHT_PARRENTHESE_in_statement876 = new BitSet(new long[]{0x002B0400BC183C80L});
	public static final BitSet FOLLOW_if_statements_in_statement878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCANF_in_statement884 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LEFT_PARRENTHESE_in_statement886 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_STRING_in_statement887 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COMMA_in_statement889 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_statement891 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_statement897 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_COMMA_in_statement899 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_statement901 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_statement907 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RIGHT_PARRENTHESE_in_statement913 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_statement924 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LEFT_PARRENTHESE_in_statement926 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_STRING_in_statement927 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_COMMA_in_statement930 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_logic_arith_expression_in_statement936 = new BitSet(new long[]{0x0000800000000200L});
	public static final BitSet FOLLOW_COMMA_in_statement939 = new BitSet(new long[]{0x0008000090103000L});
	public static final BitSet FOLLOW_logic_arith_expression_in_statement945 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RIGHT_PARRENTHESE_in_statement954 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_statement968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT1_in_statement979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT2_in_statement985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_if_statements1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_BRACE_in_if_statements1035 = new BitSet(new long[]{0x002B24009C183C80L});
	public static final BitSet FOLLOW_statements_in_if_statements1037 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RIGHT_BRACE_in_if_statements1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_else_statements1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_BRACE_in_else_statements1115 = new BitSet(new long[]{0x002B24009C183C80L});
	public static final BitSet FOLLOW_statements_in_else_statements1117 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RIGHT_BRACE_in_else_statements1120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred1_myInterp832 = new BitSet(new long[]{0x0000000000000002L});
}
