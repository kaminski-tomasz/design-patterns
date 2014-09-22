package patterns.behavioral.memento;

/**
 * Internal state of the Originator
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

	@Override
	public String toString()
	{
		return value;
	}
}
