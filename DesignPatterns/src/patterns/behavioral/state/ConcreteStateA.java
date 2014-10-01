package patterns.behavioral.state;

/**
 * ConcreteStateA implements behavior depending on the state of the Context
 * 
 * @author Tomek
 *
 */
public class ConcreteStateA implements State
{
	@Override
	public void handle()
	{
		System.out.println( "ConcreteStateA.handle()" );
	}
}
