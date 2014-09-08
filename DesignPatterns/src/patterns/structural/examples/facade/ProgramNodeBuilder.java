package patterns.structural.examples.facade;

public class ProgramNodeBuilder
{
	public ProgramNode getRootNode()
	{
		System.out.println( "Retrieve a root node of the syntax tree" );
		return new ProgramNode();
	}
}
