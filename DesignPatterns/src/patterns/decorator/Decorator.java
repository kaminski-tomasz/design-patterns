package patterns.decorator;

public abstract class Decorator implements IComponent {

	private IComponent component;
	
	public Decorator(IComponent component) {
		setComponent(component);
	}

	/** 
	 * @see patterns.decorator.IComponent#operation()
	 */
	public void operation() {
		component.operation();
	}

	public IComponent getComponent() {
		return component;
	}

	public void setComponent(IComponent component) {
		this.component = component;
	}

}
