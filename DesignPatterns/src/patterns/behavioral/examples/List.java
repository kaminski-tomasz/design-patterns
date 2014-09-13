package patterns.behavioral.examples;

/**
 * Interface for abstract lists
 * 
 * @author Tomek
 *
 * @param <T>
 */
public interface List< T >
{
	public long count();

	public T get( long index );

	public T first();

	public T last();

	public boolean includes( T item );

	public void append( T item );

	public void prepend( T item );

	public void remove( T item );

	public void removeLast();

	public void removeFirst();

	public void removeAll();

	public T top();

	public void push( T item );

	public T pop();
}
