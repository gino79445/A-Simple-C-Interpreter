all:tmp
	javac -cp ./antlr-3.5.2-complete.jar:. *.java
tmp:myparser.g
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myparser.g 
clean:
	rm *.class myparserParser.java myparserLexer.java *.tokens