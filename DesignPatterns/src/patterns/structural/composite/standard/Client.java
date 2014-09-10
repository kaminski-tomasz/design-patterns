package patterns.structural.composite.standard;

import javax.naming.OperationNotSupportedException;

/**
 * Testint Composite Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args ) throws OperationNotSupportedException
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
