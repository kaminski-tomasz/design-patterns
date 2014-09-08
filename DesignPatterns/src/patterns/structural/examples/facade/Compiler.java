package patterns.structural.examples.facade;

import java.io.InputStream;
import java.io.OutputStream;

public class Compiler
{
	public void compile( InputStream input, OutputStream output )
	{
		Scanner scanner = new Scanner( input );
		ProgramNodeBuilder builder = new ProgramNodeBuilder();
		Parser parser = new Parser();

		parser.parse( scanner, builder );

		RISCCodeGenerator generator = new RISCCodeGenerator( output );
		ProgramNode parseTree = builder.getRootNode();
		parseTree.traverse( generator );
	}
}
