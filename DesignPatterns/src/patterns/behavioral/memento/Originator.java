package patterns.behavioral.memento;

/**
 * Originator (source) class
 * 
 * @author Tomek
 *
 */
public class Originator
{
	private State state = new State( "originState" );

	public void changeState()
	{
		this.state = new State( "newState" );
	}

	public void setMemento( Memento memento )
	{
		this.state = memento.getState();
	}

	public Memento createMemento()
	{
		return new Memento( state );
	}

	@Override
	public String toString()
	{
		return "Originator: " + state;
	}

	/**
	 * Memento of the Originator. Only Originator has the full access to the
	 * whole Memento interface
	 * 
	 * @author Tomek
	 *
	 */
	public class Memento
	{
		private State state;

		private Memento( State state )
		{
			setState( state );
		}

		private State getState()
		{
			return state;
		}

		private void setState( State state )
		{
			this.state = state;
		}
	}
}
