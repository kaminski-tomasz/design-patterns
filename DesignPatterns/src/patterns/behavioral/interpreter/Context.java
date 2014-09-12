package patterns.behavioral.interpreter;

/**
 * Context for expressions
 * 
 * @author Tomek
 *
 */
public class Context
{
	private String value;

	public Context( String value )
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return value;
	}
}
