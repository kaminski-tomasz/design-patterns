package patterns.behavioral.examples.iterator;

public class ReverseListIterator< T > implements Iterator< T >
{
	private List< T > list;
	private long index = -1;

	public ReverseListIterator( List< T > list )
	{
		this.list = list;
		first();
	}

	@Override
	public void first()
	{
		index = list.count() - 1;
	}

	@Override
	public void next()
	{
		index--;
	}

	@Override
	public boolean isDone()
	{
		return index < 0;
	}

	@Override
	public T currentItem()
	{
		if( index >= 0 )
		{
			return list.get( index );
		}
		throw new IndexOutOfBoundsException();
	}
}
