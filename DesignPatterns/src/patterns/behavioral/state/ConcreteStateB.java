package patterns.behavioral.state;

/**
 * ConcreteStateB implements behavior depending on the state of the Context
 * 
 * @author Tomek
 *
 */
public class ConcreteStateB implements State
{
	@Override
	public void handle()
	{
		System.out.println( "ConcreteStateB.handle()" );
	}
}
