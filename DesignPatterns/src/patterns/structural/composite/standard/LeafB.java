package patterns.structural.composite.standard;

/**
 * Example of leaf component class
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
