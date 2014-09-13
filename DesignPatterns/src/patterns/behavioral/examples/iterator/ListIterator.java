package patterns.behavioral.examples.iterator;

/**
 * Implementation of list iterator
 * 
 * @author Tomek
 *
 * @param <T>
 */
public class ListIterator< T > implements Iterator< T >
{
	private List< T > list;
	private long index = 0;

	public ListIterator( List< T > list )
	{
		this.list = list;
	}

	@Override
	public void first()
	{
		index = 0;
	}

	@Override
	public void next()
	{
		index++;
	}

	@Override
	public boolean isDone()
	{
		return index >= list.count();
	}

	@Override
	public T currentItem()
	{
		if( index < list.count() )
		{
			return list.get( index );
		}
		throw new IndexOutOfBoundsException();
	}
}
