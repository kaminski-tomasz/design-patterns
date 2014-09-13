package patterns.behavioral.examples;

/**
 * Implementation of concrete list
 * 
 * @author Tomek
 *
 * @param <T>
 */
public class ArrayList< T > implements List< T >
{
	private java.util.List< T > internal = new java.util.ArrayList< T >();

	@Override
	public long count()
	{
		return internal.size();
	}

	@Override
	public T get( long index )
	{
		return internal.get( ( int )index );
	}

	@Override
	public T first()
	{
		if( internal.size() > 0 )
		{
			return internal.get( 0 );
		}
		else
		{
			return null;
		}
	}

	@Override
	public T last()
	{
		if( internal.size() > 0 )
		{
			return internal.get( internal.size() - 1 );
		}
		else
		{
			return null;
		}
	}

	@Override
	public boolean includes( T item )
	{
		return internal.contains( item );
	}

	@Override
	public void append( T item )
	{
		internal.add( item );
	}

	@Override
	public void prepend( T item )
	{
		internal.add( 0, item );
	}

	@Override
	public void remove( T item )
	{
		internal.remove( item );
	}

	@Override
	public void removeLast()
	{
		if( internal.size() > 0 )
		{
			internal.remove( internal.size() - 1 );
		}
	}

	@Override
	public void removeFirst()
	{
		if( internal.size() > 0 )
		{
			internal.remove( 0 );
		}
	}

	@Override
	public void removeAll()
	{
		internal.clear();
	}

	@Override
	public T top()
	{
		return last();
	}

	@Override
	public void push( T item )
	{
		append( item );
	}

	@Override
	public T pop()
	{
		T topItem = top();
		remove( topItem );
		return topItem;
	}
}
