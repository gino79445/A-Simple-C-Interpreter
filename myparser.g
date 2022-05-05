grammar myparser;

options {
   language = Java;
}

@header {
    import java.util.HashMap;
    import java.util.Scanner;
}

@members {
    //boolean TRACEON = true;
    HashMap memory = new HashMap();
   
}

program:(VOID|INT) MAIN '(' ')' '{'  statements (RETURN (logic_arith_expression)? ';')? '}'
	;

declaration:type Identifier ';'{ memory.put($Identifier.text,0);}
           |type Identifier '=' logic_arith_expression';'{ memory.put($Identifier.text,new Integer($logic_arith_expression.value));}
           ;

type:INT
   | FLOAT
   | CHAR ;

statements:statement statements
        |;

logic_arith_expression returns [int value]
		  : a = arith_expression        {$value = $a.value;}
                  ( GR_OP b = arith_expression  {$value = ($value>$b.value) ? 1 : 0;}
		  |LS_OP c = arith_expression   {$value = ($value<$b.value) ? 1 : 0;}
		  |EQ_OP d = arith_expression   {$value = ($value==$b.value) ? 1 : 0;}
		  |LE_OP e = arith_expression   {$value = ($value<=$b.value) ? 1 : 0;}
		  |GE_OP f = arith_expression   {$value = ($value>=$b.value) ? 1 : 0;}
		  |NE_OP g = arith_expression   {$value = ($value!=$b.value) ? 1 : 0;}
		  |AND  h = arith_expression    {$value = (($value!=1)||($b.value !=1) )? 0 : 1;}
		  |OR  i = arith_expression	{$value = (($value ==1)|| ($b.value ==1 ) )? 1 : 0;}
				  
		  )*	                  
		  ;
arith_expression returns [int value]:
		 a = multExpr {$value = $a.value;}
                 ( ADD b = multExpr{$value = $value+$b.value;}
                 | SUB c = multExpr{$value = $value-$c.value;})*	                  
		 ;	

multExpr returns [int value]: a = signExpr {$value = $a.value;}
          ( MUL_POINTER b = signExpr  {$value = $value*$b.value;}
          | DIV c = signExpr  {$value = $value/$b.value;}
          | MOD d = signExpr    {$value = $value\%$b.value;}     
		  )*
		  ;

signExpr returns [int value]: 
	a = primaryExpr {$value = $a.value;}
        | '-' b = primaryExpr {$value = '-' + $b.value;}
		;
		  
primaryExpr returns [int value]
	  : DEC_NUM  {$value = Integer.parseInt($DEC_NUM.text);}
           | FLOAT_NUM 
           | Identifier 
           {
		Integer v = (Integer)memory.get($Identifier.text);
		if (v != null)
		$value = v.intValue();
		else
		System.err.println("undefined var: "+$Identifier.text);
	   }

           | Char 
	   | '(' logic_arith_expression ')'  {$value = $logic_arith_expression.value;}

           ;

statement: Identifier '=' logic_arith_expression ';'
	   {
		Integer v = (Integer)memory.get($Identifier.text);
		if (v != null)
			memory.replace($Identifier.text, $logic_arith_expression.value);
		else
			System.err.println("undefined var: "+$Identifier.text);
	   }
         |IF '(' logic_arith_expression ')' ({$logic_arith_expression.value >=1}?if_statements) 
          ((ELSE) => ELSE if_statements|{ System.out.println("ddd"); }  )
	 |FOR'('forcondition';' forcondition';'forcondition ')'if_statements
	  
	 |logic_arith_expression ';'
	 { System.out.println($logic_arith_expression.value); }
	
	 |WHILE '(' logic_arith_expression ')' if_statements 
	 |SCANF '('STRING ',' '&' q = Identifier(',' '&' w = Identifier)?   ')' ';'
	 {
	 	Scanner sc = new Scanner(System.in);  
	 	
	 	if($w.text == null ){
	 		int num = sc.nextInt();
			Integer v = (Integer)memory.get($q.text);
			if (v != null)
				memory.replace($q.text, num);
			else
				System.err.println("undefined var: "+$q.text);
	 		
	 	}else{
	 		int num1 = sc.nextInt();
	 		int num2 = sc.nextInt();
			Integer v1 = (Integer)memory.get($q.text);
			Integer v2 = (Integer)memory.get($w.text);
			if (v1 != null && v2 !=null){
				memory.replace($q.text, num1);
				memory.replace($w.text, num2);
			}else{
				System.err.println("undefined var: "+$q.text);
				System.err.println("undefined var: "+$w.text);
	 		}
	 	
	 	}
	 
	 }
	 |PRINTF '('STRING (',' a = logic_arith_expression(',' b = logic_arith_expression)?)?   ')' ';'
	 {
	 	
	 	String str = $STRING.text;
	 	
	 	str = str.substring(1, str.length()-1);

	 //	str = str.replace("\\n","\%n");
	 	for( int i=0;i<str.length();i++){
	 		if(str.charAt(i)=='\\'){
	 			if(str.charAt(i+1)=='\\'){
	 				str = str.substring(0, i+1) + str.substring(i+2,str.length() );
	 				
	 			}else if(str.charAt(i+1)=='n'){
	 				str = str.substring(0, i)+ '\%' + str.substring(i+1,str.length() );
	 				i=i+1;
	 			}else if(str.charAt(i+1)=='t'){
	 				str = str.substring(0, i)+ "    " + str.substring(i+2,str.length() );
	 				i=i+1;
	 			}

	 		}
	 	}
	 	
	 	if($a.text == null){
	 		System.out.printf(str);
	 		
	 	}else if($b.text == null ){

	 		System.out.printf(str,$a.value);
	 	}else{
	 			
	 		System.out.printf(str,$a.value,$b.value);
	 	
	 	}
	 	
	 
	 
	 }
	 
	 |declaration
	 |';'
	 |COMMENT1 
	 |COMMENT2 
	 

	 
	 ;
forcondition: type Identifier
	|type Identifier '=' logic_arith_expression
	
	|logic_arith_expression
	
	| Identifier '=' logic_arith_expression 
	
	|
	;
	
	
	
if_statements : statement
                  | '{' statements '}'
                  
				  ;


		   
/* description of the tokens */
MAIN 	: 'main';	
PRINTF 	: 'printf';
SCANF 	: 'scanf';
INT  : 'int';
CHAR : 'char';
VOID : 'void';
FLOAT: 'float';
WHILE : 'while';
ELSE : 'else';
FOR : 'for';
IF : 'if';
RETURN 	: 'return';


/*----------------------*/
/*  Compound Operators  */
/*----------------------*/
ADD : '+';
SUB : '-';
DIV : '/';
MUL_POINTER : '*';
MOD : '%';



GR_OP : '>' ;
LS_OP : '<' ;
EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';

PP_OP : '++';
MM_OP : '--'; 

AND : '&&';
OR : '||';

/*STRING*/


STRING	:  '"' ( ESC_SEQ|'""'| ~('"'|'\\') )* '"';
fragment ESC_SEQ	:   '\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\') ;
Char : '\'' ('\\\''|~'\'') '\'';


COMMA : ',';
ASSIGHNMENT : '=';
QUESTION_MARK : '?';
COLON :':';
SEMICOLON : ';';
LEFT_PARRENTHESE : '(';
RIGHT_PARRENTHESE : ')';
LEFT_BRACE : '{';
RIGHT_BRACE : '}';
LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';

/*NUMBER*/
DEC_NUM : (DIGIT)+;
FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;



//fragment FLOAT_NUM3: (DIGIT)+;


/*ID*/
Identifier : (LETTER)(LETTER | DIGIT)*;


/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}:.)* '*/';

/*NEW_LINE: '\n';*/

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';



WS  : (' '|'\r'|'\t'|'\n')+{skip();};
