package patterns.behavioral.iterator;

/**
 * Interface for collections which aggregates items of specified type
 * 
 * @author Tomek
 *
 * @param <T>
 *                type of aggregated elements
 */
public interface Aggregate< T >
{
	/**
	 * Creates iterator for present collection
	 * 
	 * @return iterator
	 */
	public Iterator< T > createIterator();
}
