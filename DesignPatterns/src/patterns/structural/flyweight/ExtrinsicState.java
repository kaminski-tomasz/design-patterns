package patterns.structural.flyweight;

/**
 * External state of a flyweight which should depend on the context only
 * 
 * @author Tomek
 *
 */
public class ExtrinsicState
{
	private String state;

	public ExtrinsicState( String state )
	{
		this.state = state;
	}

	@Override
	public String toString()
	{
		return state;
	}
}
