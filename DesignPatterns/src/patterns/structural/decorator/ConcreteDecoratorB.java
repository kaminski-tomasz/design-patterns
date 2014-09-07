package patterns.structural.decorator;

/**
 * Concrete decorator wchich adds behaviour
 * 
 * @author Tomek
 *
 */
public class ConcreteDecoratorB extends Decorator
{
	public ConcreteDecoratorB( Component component )
	{
		super( component );
	}

	@Override
	public void operation()
	{
		super.operation();
		addedBehaviour();
	}

	public void addedBehaviour()
	{
		System.out.println( "ConcreteDecoratorB.addedBehaviour()" );
	}
}
