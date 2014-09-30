package patterns.behavioral.command;

/**
 * Internal state of Command
 * 
 * @author Tomek
 *
 */
public class State
{
	private String value;

	public State( String value )
	{
		this.value = value;
	}

	public void setValue( String value )
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return value;
	}
}
