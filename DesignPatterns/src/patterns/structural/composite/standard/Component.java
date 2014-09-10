package patterns.structural.composite.standard;

import javax.naming.OperationNotSupportedException;

/**
 * Interface for component classes
 * 
 * @author Tomek
 *
 */
public interface Component
{
	/**
	 * Do some important operation
	 */
	public void operation();

	/**
	 * Add the component to the list. Default implementation throws
	 * OperationNotSupportedException.
	 * 
	 * @param component
	 *                component that is added.
	 * @return true if component was added successfully.
	 */
	public boolean add( Component component ) 
			throws OperationNotSupportedException;

	/**
	 * Removes the component from the children list. Default implementation
	 * throws OperationNotSupportedException.
	 * 
	 * @param component
	 *                component that is removed.
	 * @return true if component was removed successfully.
	 */
	public boolean remove( Component component ) 
			throws OperationNotSupportedException;

	/**
	 * Get the i-th children of the component. Default implementation throws
	 * OperationNotSupportedException.
	 * 
	 * @param i
	 *                the index of the component in the list.
	 * @return component or null if not exists.
	 */
	public Component getChild( int i ) 
			throws OperationNotSupportedException;
}
