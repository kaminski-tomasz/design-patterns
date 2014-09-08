package patterns.structural.examples.facade;

public class Parser
{
	public void parse( Scanner scanner, ProgramNodeBuilder builder )
	{
		System.out.println( "Parse using Scanner" );
		System.out.println( "Build syntax tree using ProgramNodeBuilder" );
	}
}
