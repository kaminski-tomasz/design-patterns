package patterns.composite.parent;

/**
 * Interface for the component.
 * 
 * @author tkaminski
 * 
 */
public interface IComponent {

	/**
	 * Do some important operation
	 */
	public void operation();

	/**
	 * Get the parent of the component.
	 * 
	 * @return Parent of the component
	 */
	public IComponent getParent();

	/**
	 * Add the component to the list. Default implementation returns false.
	 * 
	 * @param component
	 *            component that is added.
	 * @return true if component was added successfully.
	 */
	public boolean add(IComponent component);

	/**
	 * Removes the component from the children list. Default implementation
	 * returns false.
	 * 
	 * @param component
	 *            component that is removed.
	 * @return true if component was removed successfully.
	 */
	public boolean remove(IComponent component);

	/**
	 * Get the i-th children of the component. Default implementation returns
	 * null.
	 * 
	 * @param i
	 *            the index of the component in the list.
	 * @return component or null if not exists.
	 */
	public IComponent getChildren(int i);

}
