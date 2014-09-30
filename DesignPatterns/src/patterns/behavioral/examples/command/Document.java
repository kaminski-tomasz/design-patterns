package patterns.behavioral.examples.command;

public class Document
{
	private String name;

	public Document( String name )
	{
		System.out.println( "Creating document " + name );
		this.name = name;
	}

	public void open()
	{
		System.out.println( "Opening document " + name );
	}

	public void close()
	{
		System.out.println( "Closing document " + name );
	}

	public void copy()
	{
		System.out.println( "Copying text from document " + name );
	}

	public void paste()
	{
		System.out.println( "Pasting text into document " + name );
	}

	public void cut()
	{
		System.out.println( "Cutting text from document " + name );
	}

	public String getName()
	{
		return name;
	}
}
