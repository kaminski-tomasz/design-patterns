package patterns.behavioral.state;

/**
 * Context defines interface for Clients and contains specific State
 * 
 * @author Tomek
 *
 */
public class Context
{
	private State state;

	public void request()
	{
		state.handle();
	}

	void changeState( State state )
	{
		this.state = state;
	}
}
