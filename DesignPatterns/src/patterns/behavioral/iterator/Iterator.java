package patterns.behavioral.iterator;

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
	/**
	 * Sets iterator on first element in collection
	 */
	public void first();

	/**
	 * Moves iterator to the next element
	 */
	public void next();

	/**
	 * Tests whether the whole collection was iterated
	 * 
	 * @return
	 */
	public boolean isDone();

	/**
	 * Returns the current item
	 * 
	 * @return an item the iterator is pointing to
	 */
	public T currentItem();
}
