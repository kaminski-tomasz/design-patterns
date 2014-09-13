package patterns.behavioral.iterator;

/**
 * Testing the Iterator Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	private static void testIterator( Aggregate< Integer > collection )
	{
		Iterator< Integer > iterator = collection.createIterator();
		for( iterator.first(); !iterator.isDone(); iterator.next() )
		{
			System.out.println( iterator.currentItem() );
		}
	}

	public static void main( String[] args )
	{
		ConcreteAggregate< Integer > aggregate = 
				new ConcreteAggregate< Integer >();
		aggregate.append( 1 );
		aggregate.append( 2 );
		aggregate.append( 5 );
		aggregate.append( 4 );
		testIterator( aggregate );
	}
}
