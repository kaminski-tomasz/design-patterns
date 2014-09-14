package patterns.behavioral.mediator;

/**
 * Implementation of concrete colleague object
 * 
 * @author Tomek
 *
 */
public class ConcreteColleague1 extends Colleague
{
	public ConcreteColleague1( Mediator mediator )
	{
		super( mediator );
	}

	@Override
	public void operation()
	{
		System.out.println( "ConcreteColleague1.operation()" );
		notifyMediator();
	}
}
