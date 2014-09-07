package patterns.structural.decorator;

/**
 * Concrete Component class
 * 
 * @author Tomek
 *
 */
public class ConcreteComponent implements Component
{
	@Override
	public void operation()
	{
		System.out.println( "ConcreteComponent.operation()" );
	}
}
