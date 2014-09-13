package patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of concrete aggregate
 * 
 * @author Tomek
 *
 * @param <T>
 */
public class ConcreteAggregate< T > implements Aggregate< T >
{
	private List< T > list;

	public ConcreteAggregate()
	{
		this.list = new ArrayList< T >();
	}

	public T get( int index )
	{
		return list.get( index );
	}

	public int size()
	{
		return list.size();
	}

	public void append( T item )
	{
		list.add( item );
	}

	@Override
	public Iterator< T > createIterator()
	{
		return new ConcreteIterator< T >( this );
	}
}
