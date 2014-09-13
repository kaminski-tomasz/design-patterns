package patterns.behavioral.chainofresponsibility;

/**
 * Implementation of concrete handler
 * 
 * @author Tomek
 *
 */
public class ConcreteHandler1 extends Handler
{
	public ConcreteHandler1( Handler successor )
	{
		super( successor );
	}

	@Override
	public void handleRequest()
	{
		System.out.println( "ConcreteHandler1.handleRequest()" );
	}
}
