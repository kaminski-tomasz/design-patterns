package patterns.composite.parent;

public abstract class Component implements IComponent {

	private IComponent parent;

	/* (non-Javadoc)
	 * @see patterns.composite.parent.IComponent#getParent()
	 */
	@Override
	public IComponent getParent() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see patterns.composite.parent.IComponent#add(patterns.composite.parent.IComponent)
	 */
	@Override
	public boolean add(IComponent component) {
		return false;
	}

	/* (non-Javadoc)
	 * @see patterns.composite.parent.IComponent#remove(patterns.composite.parent.IComponent)
	 */
	@Override
	public boolean remove(IComponent component) {
		return false;
	}

	/* (non-Javadoc)
	 * @see patterns.composite.parent.IComponent#getChildren(int)
	 */
	@Override
	public IComponent getChildren(int i) {
		return null;
	}

	protected void setParent(IComponent parent) {
		this.parent = parent;
	}
}
