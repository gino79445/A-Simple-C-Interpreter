import org.antlr.runtime.*;

public class testParser {
	public static void main(String[] args) throws Exception {

      CharStream input = new ANTLRFileStream(args[0]);
      myparserLexer lexer = new myparserLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
 
      myparserParser parser = new myparserParser(tokens);
      parser.program();
	}
}
