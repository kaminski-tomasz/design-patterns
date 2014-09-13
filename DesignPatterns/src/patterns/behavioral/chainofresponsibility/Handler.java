package patterns.behavioral.chainofresponsibility;

/**
 * Abstract class for Handlers with default implementation of handleRequest()
 * method
 * 
 * @author Tomek
 *
 */
public abstract class Handler
{
	private Handler successor;

	public Handler( Handler successor )
	{
		this.successor = successor;
	}

	/**
	 * Default implementation of handleRequest() method. It delegates
	 * handling the request to the successor of this handler
	 */
	public void handleRequest()
	{
		if( successor != null )
		{
			successor.handleRequest();
		}
	}
}
