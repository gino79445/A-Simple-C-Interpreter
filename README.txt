用的是(antlr-3.5.2-complete.jar)

可使用makefile來編譯檔案，輸入make後，會自動編譯
(java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myparser.g 
javac -cp ./antlr-3.5.2-complete.jar:. *.java)
產生testParser.java......

因為有三個測試程式test1.c、test2.c、test3.c，
因此假設若要執行 test1.c ，請輸入java -cp antlr-3.5.2-complete.jar:. testParser test1.c，以此類推。
(前提是antlr-3.5.2-complete.jar在此資料夾)

input1.c =>測試 if-then、if-then-else、for-loop、while-loop 結構
input2.c =>測試printf函數
input1.c =>測試運算(+,-,*,%,/ 之優先權) 及 條件判斷


subset_description 描述此 subset of C language。

輸入make clean 可清除make產生的文件


(1) 對於每個推導都會印出相關資訊
(2) 使用int main 或 void main開頭都行
(3) 宣告同時也能賦值
    Ex:int a; int b = 3;
(4) if-then-else 可使用多個接在一起
(5) if-then、if-then-else、for-loop、while-loop 可巢狀使用
(6) if-then、if-then-else、for-loop、while-loop 若要做內只有一行，不必加{}
    Ex: if(a>1) printf("a>1");
(7) printf 函數(可含一個、兩個或三個參數) 
    Ex: printf("%d %d" ,a,b);  printf("%d " ,3);  printf("ccc");
(8) if-then、if-then-else、for-loop、while-loop 能支持較複雜條件判斷
    Ex:if ((a==b+1)&&3>1||8<=2)  printf("a");
(9) 要return 不 return 都行
(10) 支援註解
(11) Ex:  ; 或 a+1; ……等，也能為一個statement




