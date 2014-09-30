package patterns.behavioral.command;

/**
 * Invoker stores and invokes Commands
 * 
 * @author Tomek
 *
 */
public class Invoker
{
	private Command command;

	public void storeCommand( Command command )
	{
		this.command = command;
	}

	public void invokeCommand()
	{
		command.execute();
	}
}
