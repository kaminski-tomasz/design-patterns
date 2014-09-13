package patterns.behavioral.examples.iterator;

/**
 * Traverser which traverses through aggregate
 * 
 * @author Tomek
 *
 * @param <T>
 */
public abstract class Traverser< T >
{
	private Iterator< T > iterator;

	public Traverser( Traversable< T > aggregate )
	{
		System.out.println( "Traverser<T>(aggregate)" );
		iterator = aggregate.createIterator();
	}

	protected abstract boolean processItem( T currentItem );

	public boolean traverse()
	{
		boolean result = false;
		for( iterator.first(); !iterator.isDone(); iterator.next() )
		{
			result = processItem( iterator.currentItem() );
			if( !result )
			{
				break;
			}
		}
		return result;
	}
}
