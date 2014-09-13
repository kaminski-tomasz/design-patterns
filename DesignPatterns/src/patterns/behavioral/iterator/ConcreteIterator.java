package patterns.behavioral.iterator;

/**
 * Implementation of concrete iterator
 * 
 * @author Tomek
 *
 * @param <T>
 */
public class ConcreteIterator< T > implements Iterator< T >
{
	private ConcreteAggregate< T > aggregate;
	private int current = 0;

	public ConcreteIterator( ConcreteAggregate< T > concreteAggregate )
	{
		this.aggregate = concreteAggregate;
	}

	@Override
	public void first()
	{
		current = 0;
	}

	@Override
	public void next()
	{
		current++;
	}

	@Override
	public boolean isDone()
	{
		return current >= aggregate.size();
	}

	@Override
	public T currentItem()
	{
		if( isDone() )
		{
			throw new IndexOutOfBoundsException();
		}
		return aggregate.get( current );
	}
}
