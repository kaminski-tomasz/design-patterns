package patterns.structural.flyweight;

/**
 * Internal state of a flyweight object that is expected to be shared
 * 
 * @author Tomek
 *
 */
public class IntrinsicState
{
	private String state;

	public IntrinsicState( String state )
	{
		this.state = state;
	}

	@Override
	public String toString()
	{
		return state;
	}
}
