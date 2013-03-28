package patterns.decorator;

public class ConcreteDecoratorA extends Decorator {

	private Object addedState;
	
	public ConcreteDecoratorA(IComponent component) {
		super(component);
	}

	public Object getAddedState() {
		return addedState;
	}

	public void setAddedState(Object addedState) {
		this.addedState = addedState;
	}

}
