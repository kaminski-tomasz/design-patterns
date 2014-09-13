package patterns.behavioral.examples.iterator;

/**
 * List extended by Traversable interface
 * 
 * @author Tomek
 *
 * @param <T>
 */
public interface List< T > extends 
	patterns.behavioral.examples.List< T >, 
	Traversable< T >
{
}
