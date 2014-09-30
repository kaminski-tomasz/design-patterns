package patterns.behavioral.command;

/**
 * Concrete Command defines association between Receiver and the operation to
 * perform and implements the Command interface
 * 
 * @author Tomek
 *
 */
public class ConcreteCommand implements Command
{
	private State state;
	private Receiver receiver;

	public ConcreteCommand( Receiver receiver )
	{
		this.receiver = receiver;
	}

	@Override
	public void execute()
	{
		receiver.action();
	}

	public State getState()
	{
		return state;
	}

	public void setState( State state )
	{
		this.state = state;
	}
}
