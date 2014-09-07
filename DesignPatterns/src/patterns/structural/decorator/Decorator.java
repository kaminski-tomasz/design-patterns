package patterns.structural.decorator;

/**
 * Abstract decorator of Component class
 * 
 * @author Tomek
 *
 */
public abstract class Decorator implements Component
{
	private Component component;

	public Decorator( Component component )
	{
		this.component = component;
	}

	@Override
	public void operation()
	{
		component.operation();
	}
}
