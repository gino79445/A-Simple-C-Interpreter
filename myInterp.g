grammar myInterp;

options {
   language = Java;
}

@header {
    import java.util.HashMap;
    import java.util.Scanner;
    import java.util.Iterator;
    import java.util.LinkedHashMap;
}

@members {
    //boolean TRACEON = true;
    //HashMap memory = new HashMap();
    Map<String, Integer> memory = new LinkedHashMap<>();
    int[] memorySize = new int[1000];
   
   
   
}

program:(VOID|INT) MAIN '(' ')' '{'  statements[1,0] (RETURN (logic_arith_expression[0]  )? ';')? '}'
	;

declaration[int scope]:type Identifier ';'{ 
		String str = $Identifier.text+Integer.toString(scope);
		memory.put(str,0);
		memorySize[scope] = memorySize[scope]+1;
		
		
	   }
           |type Identifier '=' logic_arith_expression[$scope]  ';'{
           	    String str = $Identifier.text+Integer.toString(scope);
	            memory.put(str,new Integer($logic_arith_expression.value));
	            memorySize[scope] = memorySize[scope]+1;
	            
            }
           ;

type:INT
   | FLOAT
   | CHAR ;

statements[int flag,int scope] :statement[$flag,$scope] statements[$flag,$scope]
        |;

logic_arith_expression[int scope] returns [int value]
		  : a = arith_expression[$scope]        {$value = $a.value;}
                  ( GR_OP b = arith_expression[$scope]  {$value = ($value>$b.value) ? 1 : 0;}
		  |LS_OP c = arith_expression[$scope]   {$value = ($value<$c.value) ? 1 : 0;}
		  |EQ_OP d = arith_expression[$scope]   {$value = ($value==$d.value) ? 1 : 0;}
		  |LE_OP e = arith_expression[$scope]   {$value = ($value<=$e.value) ? 1 : 0;}
		  |GE_OP f = arith_expression[$scope]   {$value = ($value>=$f.value) ? 1 : 0;}
		  |NE_OP g = arith_expression[$scope]   {$value = ($value!=$g.value) ? 1 : 0;}
		  |AND  h = arith_expression[$scope]    {$value = (($value!=1)||($h.value !=1) )? 0 : 1;}
		  |OR  i = arith_expression[$scope]	{$value = (($value ==1)|| ($i.value ==1 ) )? 1 : 0;}
				  
		  )*	                  
		  ;
arith_expression[int scope] returns [int value]:
		 a = multExpr[$scope] {$value = $a.value;}
                 ( ADD b = multExpr[$scope]{$value = $value+$b.value;}
                 | SUB c = multExpr[$scope]{$value = $value-$c.value;})*	                  
		 ;	

multExpr[int scope] returns [int value]: a = signExpr[$scope] {$value = $a.value;}
          ( MUL_POINTER b = signExpr[$scope]  {$value = $value*$b.value;}
          | DIV c = signExpr[$scope]  {$value = $value/$c.value;}
          | MOD d = signExpr[$scope]    {$value = $value\%$d.value;}     
		  )*
		  ;

signExpr[int scope] returns [int value]: 
	a = primaryExpr[$scope] {$value = $a.value;}
        | '-' b = primaryExpr[$scope] {$value = 0- $b.value;}
		;
		  
primaryExpr[int scope] returns [int value]
	  : DEC_NUM  {$value = Integer.parseInt($DEC_NUM.text);}
           | FLOAT_NUM 
           | Identifier 
           
           {    
           	String str = $Identifier.text+Integer.toString(scope);
		Integer v = (Integer)memory.get(str);
		if(v!=null)
			$value = v.intValue();
		while(v==null){
				scope = scope -1;
				if (scope<0){
					System.err.println("undefined var: "+$Identifier.text);
					break;
				}
				str = $Identifier.text+Integer.toString(scope);
				v = (Integer)memory.get(str);

				if(v!=null)
					$value = v.intValue();
					
				
				
		}
	   }

           | Char 
	   | '(' logic_arith_expression[$scope] ')'  {$value = $logic_arith_expression.value;}

           ;

statement[int flag,int scope]: Identifier '=' logic_arith_expression[$scope] ';'
	   {
	   	if($flag>=1){
	   		String str = $Identifier.text+Integer.toString(scope);
			Integer v = (Integer)memory.get(str);
			if(v!=null)
				memory.replace(str, $logic_arith_expression.value);
			while(v==null){
				scope = scope -1;
				if (scope<0){
					System.err.println("undefined var: "+$Identifier.text);
					break;
				}
				str = $Identifier.text+Integer.toString(scope);
				v = (Integer)memory.get(str);

				if(v!=null){
					memory.replace(str, $logic_arith_expression.value);
					
				}
				
			}
			
			
		}
	   }
         |IF '(' logic_arith_expression[$scope]')' 
         if_statements[(($logic_arith_expression.value>=1)&&($flag>=1))?1:0,scope+1] ((ELSE) => ELSE else_statements[(($logic_arith_expression.value>=1)||($flag<1))?1:0,scope+1]|  )
	{
	
		
	
	
		
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
	  
	 |logic_arith_expression[$scope] ';'
	 
	
	 |WHILE '(' logic_arith_expression[$scope] ')' if_statements[1,$scope]
	 |SCANF '('STRING ',' '&' q = Identifier(',' '&' w = Identifier)?   ')' ';'
	 {
	 	if($flag>=1){
		 	Scanner sc = new Scanner(System.in);  
		 	String q1 = $q.text+Integer.toString($scope);
		 	String w1 = $w.text+Integer.toString($scope);
	            	
		 	if($w.text == null ){
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
	 |PRINTF '('STRING (',' a = logic_arith_expression[$scope](',' b = logic_arith_expression[$scope])?)?   ')' ';'
	 {
	 	if($flag>=1){
	 	
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
		 			}else if(str.charAt(i+1)=='\"'){
		 				str = str.substring(0, i)+ "\"" + str.substring(i+2,str.length() );
		 				
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
	 	
	 
	 
	 }
	 
	 |declaration[$scope]
	 |';'
	 |COMMENT1 
	 |COMMENT2 
	 

	 
	 ;

	
	
	
if_statements [int flag,int scope]: 
		statement[$flag,scope]
                | '{' statements[$flag,scope] '}'
                
                  
				  ;
else_statements [int flag,int scope]: 
		statement[($flag<1)? 1 : 0,scope]
                | '{' statements[($flag<1)? 1 : 0,scope] '}'
                
                
                  
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
