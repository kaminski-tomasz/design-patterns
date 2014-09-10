package patterns.structural.composite.parent;

/**
 * Testing Composite pattern with parent node
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Component root = new Composite();
		root.add( new LeafA() );
		root.add( new LeafB() );

		Component subnode = new Composite();
		subnode.add( new LeafA() );
		subnode.add( new LeafA() );
		subnode.add( new LeafB() );

		root.add( subnode );
		root.operation();
	}
}
