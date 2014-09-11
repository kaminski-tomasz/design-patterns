package patterns.structural.flyweight;

/**
 * State that belongs to unshared concrete flyweights
 * 
 * @author Tomek
 *
 */
public class AllState
{
	private String state;

	public AllState( String state )
	{
		this.state = state;
	}

	@Override
	public String toString()
	{
		return state;
	}
}
