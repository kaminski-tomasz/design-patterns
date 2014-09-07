package patterns.structural.decorator;

/**
 * Concrete decorator which decorates witch state
 * 
 * @author Tomek
 *
 */
public class ConcreteDecoratorA extends Decorator
{
	private String addedState;

	public ConcreteDecoratorA( Component component )
	{
		super( component );
	}

	public Object getAddedState()
	{
		return addedState;
	}

	public void setAddedState( String addedState )
	{
		this.addedState = addedState;
	}
}
