package patterns.behavioral.examples.iterator;

/**
 * Interface for traversable aggregates
 * 
 * @author Tomek
 * @param <T>
 *                type of items in traversed aggregate
 *
 */
public interface Traversable< T >
{
	public Iterator< T > createIterator();
}
