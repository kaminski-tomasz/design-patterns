package patterns.structural.composite.parent;

/**
 * Example of leaf component
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
