package patterns.structural.composite.standard;

/**
 * Example of leaf component class
 * 
 * @author Tomek
 *
 */
public class LeafA extends AbstractComponent
{
	@Override
	public void operation()
	{
		System.out.println( "LeafA.operation()" );
	}
}
