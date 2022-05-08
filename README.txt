用的是(antlr-3.5.2-complete.jar)
可使用makefile來編譯檔案，輸入make後，會自動編譯
(java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myInterp.g 
javac -cp ./antlr-3.5.2-complete.jar:. *.java)
產生myInterpParser.java......

因為有三個測試程式test1.c、test2.c、test3.c，
因此假設若要執行 test1.c ，請輸入java -cp antlr-3.5.2-complete.jar:. myInterp_test test1.c，以此類推。
(前提是antlr-3.5.2-complete.jar在此資料夾)

input1.c =>測試if-then-else多巢狀使用、及printf與scanf功能
input2.c =>測試對於variable的scope判斷是否正確
input3.c =>測試運算(+,-,*,%,/ 之優先權) 及 條件判斷 與 範例測資

subset_description 描述此 subset of C language。

輸入make clean 可清除make產生的文件

此程式是在implement a simple C interpreter，以下為提供功能:
(1) 使用int main 或 void main開頭都行
(2) 宣告同時也能賦值以及宣告多個
    Ex: int a;  int b = 3;  int a,b;
(3) if-then-else 可使用多個接在一起
(4) if-then、if-then-else可巢狀使用
(5) if-then、if-then-else若要做內只有一行，不必加{}
    Ex: if(a>1) printf("a>1");
(6) scanf 函數(支援輸入一個或兩個)
   Ex: scanf("%d %d",&a ,&b); scanf("%d ",&a);
(7) printf 函數(可含一個、兩個或三個參數) 
    Ex: printf("%d %d" ,a,b);  printf("%d " ,3);  printf("ccc");
有做出%%印出%、”\n”換行、”\\”印出\ 、”\t”印出tab空格、”\””印出”
Ex: printf("\"\\\\a\n\ta\n");
印出:
"\\a
    a
(8) if-then、if-then-else能支持較複雜條件判斷
    Ex:if ((a==b+1)&&3>1||8<=2)  printf("a");
(9) 要return 不 return 都行
(10) 支援註解
(11) Ex:	; 或 a+1; ……等，也能為一個statement
(12) 在if-then、if-then-else中，有辦法使local variable 有自己的scope，且若此scope沒有會找外面scope的。
Ex :
int a =0;
if(1){
	int a =1;
	if(1){ printf(“%d”,a); }
}
printf(“%d”,a);
會印出: 10





