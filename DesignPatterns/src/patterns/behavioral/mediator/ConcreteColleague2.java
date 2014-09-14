package patterns.behavioral.mediator;

/**
 * Implementation of concrete colleague object
 * 
 * @author Tomek
 *
 */
public class ConcreteColleague2 extends Colleague
{
	public ConcreteColleague2( Mediator mediator )
	{
		super( mediator );
	}

	@Override
	public void operation()
	{
		System.out.println( "ConcreteColleague2.operation()" );
		notifyMediator();
	}
}
