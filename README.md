# A-Simple-C-Interpreter
## Project Description  
 The main purpose of this project is to implement a simple C interpreter with ANTLR and JAVA.  
+ generate a lexical analyzer to recognize the vocabulary of c subset and transform a string of characters into a string of words or tokens 
+ generate a parser to verify the strings can be generated by the grammar of C.
+ action with the parser we generate

## Run
You have to make the antlr-3.5.2-complete.jar and makefile in current folder and the environment of java has been installed,the run the following command:  
*if you want to run test1.c with the simple C interpreter*
```shell
make 
java -cp antlr-3.5.2-complete.jar:. myInterp_test test1.c
```
or  
```shell
java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myInterp.g 
javac -cp ./antlr-3.5.2-complete.jar:. *.java
java -cp antlr-3.5.2-complete.jar:. myInterp_test test1.c
```
## the C subset supported by the interpreter
1.	包含以下關鍵字    
    |else| if| int|return|void|
    |---:|:---:|---:|---:|---:|

2. 其中之資料型態 (宣告變數)  
    int

3. 註解方式:  
    + /\*……\*/  
      以正斜線和星號組合 (/\*) 為開頭的字元序列,可以包含可表示字元集的任何字元組合，但不包括「結尾註解」分隔符號(\*/)。     
      註解可佔用一行以上，但不可以是巢狀(EX:	/\*/\*……\*/   =>error)。  
    + //……
    使用兩個正斜線的單行註解 (//)

4. program statement相關之邏輯、數學運算子  
    + 數學運算 : + , - , \*, / , % 
    + 比較運算 : > , < , == , <= , >= , != , && , || 

5. 其他標點符號  
    ',' 、 '='  、 ':' 、 ';' 、 '(' 、 ')' 、 '{' 、 '}' 

6. 支援之程式控制結構  
    有關條件判斷:If 、 else 

7. 函式   
    支援MAIN 函數 
    PRINTF 函數(可含一個、兩個或三個參數)

8. 字串及字元  
    字串 "……" => 字串會由兩個雙引號包住，且若字串內要使用雙引號，需在其前面加上 \。  

9. 數字    
    EX:3、-44、+1

10. 空白  
    遇到 ' '、'\r'、'\t'、'\n' 略過。 



## The functions the simple c interpreter provides
1. 使用int main 或 void main開頭都行  
2. 宣告同時也能賦值以及宣告多個  
  ```C  
  //Example
  int a;    
  int b = 3;    
  int a,b;    
  ```
3. if-then-else 可使用多個接在一起  
4. if-then、if-then-else可巢狀使用  
5.  if-then、if-then-else若要做內只有一行，不必加{} 
  ```C
  //Example
  if(a>1) 
    printf("a>1"); 
  ```
6. scanf 函數(支援輸入一個或兩個) 
  ```C
  //Example
  scanf("%d %d",&a ,&b); 
  scanf("%d ",&a);  
  ```
7. printf 函數(可含一個、兩個或三個參數)   
  ```C
  //Example
  printf("%d %d" ,a,b);  
  printf("%d " ,3);  
  printf("ccc");  
  ```
%% 、 \n 、 \\ 、 \t、 \" are same as C language   

  ```C
  //Example
  printf("\"\\\\a\n\ta\n");
  ```
output:
  ```shell
  "\\a
      a
  ```
8. if-then、if-then-else能支持較複雜條件判斷  
  ```C
  //Example
  if ((a==b+1)&&3>1||8<=2)  
    printf("a");
  ```
9. 要return 不 return 都行  
10. 支援註解  
11. ; 或 a+1; ……等，也能為一個statement 
  ```C
  //Example
  ;
  a+1;
  ```
12. 在if-then、if-then-else中，有辦法使local variable 有自己的scope，且若此scope沒有會找外面scope的。  
  ```C
  //Example
  int a =0;
  if(1){
    int a =1;
    if(1){ printf(“%d”,a); }
  }
  printf(“%d”,a); 
  ```
output: 
  ```shell
  10
  ```

