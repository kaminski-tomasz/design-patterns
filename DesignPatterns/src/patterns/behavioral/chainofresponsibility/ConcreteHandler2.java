package patterns.behavioral.chainofresponsibility;

/**
 * Implementation of concrete handler
 * 
 * @author Tomek
 *
 */
public class ConcreteHandler2 extends Handler
{
	public ConcreteHandler2( Handler successor )
	{
		super( successor );
	}

	@Override
	public void handleRequest()
	{
		super.handleRequest();
	}
}
