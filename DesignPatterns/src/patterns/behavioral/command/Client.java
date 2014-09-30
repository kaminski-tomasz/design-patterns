package patterns.behavioral.command;

/**
 * Testing the Command Pattern. The Client creates Concrete Commands and
 * associate the Receiver with it
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Invoker invoker = new Invoker();
		Receiver receiver = new Receiver();

		Command command = new ConcreteCommand( receiver );
		invoker.storeCommand( command );

		invoker.invokeCommand();
	}
}
