package patterns.behavioral.examples.iterator;

/**
 * Interface for iterators
 * 
 * @author Tomek
 *
 * @param <T>
 *                type of iterated elements
 */
public interface Iterator< T >
{
	public void first();

	public void next();

	public boolean isDone();

	public T currentItem();
}
