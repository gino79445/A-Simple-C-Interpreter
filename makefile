all:tmp
	javac -cp ./antlr-3.5.2-complete.jar:. *.java
tmp:myInterp.g
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myInterp.g 
clean:
	rm *.class myInterpParser.java myInterpLexer.java *.tokens