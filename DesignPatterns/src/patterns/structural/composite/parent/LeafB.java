package patterns.structural.composite.parent;

/**
 * Example of leaf component
 * 
 * @author Tomek
 *
 */
public class LeafB extends AbstractComponent
{
	@Override
	public void operation()
	{
		System.out.println( "LeafB.operation()" );
	}
}
