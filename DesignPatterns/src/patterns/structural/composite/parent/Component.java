package patterns.structural.composite.parent;

/**
 * Interface for components with parent node references
 * 
 * @author tkaminski
 * 
 */
public interface Component
{
	/**
	 * Do some important operation
	 */
	public void operation();

	/**
	 * Get the parent of the component.
	 * 
	 * @return Parent of the component
	 */
	public Component getParent();

	/**
	 * Add the component to the list. Default implementation returns false.
	 * 
	 * @param component
	 *                component that is added.
	 * @return true if component was added successfully.
	 */
	public boolean add( Component component );

	/**
	 * Removes the component from the children list. Default implementation
	 * returns false.
	 * 
	 * @param component
	 *                component that is removed.
	 * @return true if component was removed successfully.
	 */
	public boolean remove( Component component );

	/**
	 * Get the i-th child of the component. Default implementation returns
	 * null.
	 * 
	 * @param i
	 *                the index of the component in the list.
	 * @return component or null if not exists.
	 */
	public Component getChild( int i );
}
