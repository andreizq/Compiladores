import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {

	public static void main(String[] args)  {
		try {
		CharStream input = CharStreams.fromStream(System.in); 
		RomanoLexer lexer = new RomanoLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		RomanoParser parser = new RomanoParser(tokens);
		ParseTree tree = parser.romano(); 
		//System.out.println(tree.toStringTree(parser)); 
		ParseTreeWalker walker = new ParseTreeWalker();
		MiListener listener = new MiListener();
		walker.walk(listener, tree);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}