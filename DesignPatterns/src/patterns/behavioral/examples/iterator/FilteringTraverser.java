package patterns.behavioral.examples.iterator;

/**
 * Traverser which filters traversed items in given aggregate
 * 
 * @author Tomek
 *
 * @param <T>
 */
public abstract class FilteringTraverser< T >
{
	private Iterator< T > iterator;

	public FilteringTraverser( Traversable< T > aggregate )
	{
		System.out.println( "FilteringTraverser<T>(aggregate)" );
		iterator = aggregate.createIterator();
	}

	protected abstract boolean processItem( T currentItem );

	protected abstract boolean test( T currentItem );

	public boolean traverse()
	{
		boolean result = false;
		for( iterator.first(); !iterator.isDone(); iterator.next() )
		{
			if( test( iterator.currentItem() ) )
			{
				result = processItem( iterator.currentItem() );
				if( !result )
				{
					break;
				}
			}
		}
		return result;
	}
}
