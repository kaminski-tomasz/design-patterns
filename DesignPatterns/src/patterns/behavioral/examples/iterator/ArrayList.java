package patterns.behavioral.examples.iterator;

/**
 * Concrete list implementation which includes Traversable factory method
 * createIterator()
 * 
 * @author Tomek
 *
 * @param <T>
 */
public class ArrayList< T > 
	extends patterns.behavioral.examples.ArrayList< T > 
	implements List< T >
{
	@Override
	public Iterator< T > createIterator()
	{
		return new ListIterator< T >( this );
	}
}
