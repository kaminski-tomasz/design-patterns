package patterns.behavioral.command;

/**
 * Receiver is able to execute operations needed for handling the request
 * 
 * @author Tomek
 *
 */
public class Receiver
{
	/**
	 * Action performed by the Receiver
	 */
	public void action()
	{
		System.out.println( "Receiver.action()" );
	}
}
