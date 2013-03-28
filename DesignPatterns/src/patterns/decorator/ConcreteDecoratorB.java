package patterns.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(IComponent component) {
		super(component);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.decorator.Decorator#operation()
	 */
	@Override
	public void operation() {
		super.operation();
		addedBehaviour();
	}

	public void addedBehaviour() {
		System.out.println("ConcreteDecoratorB.addedBehaviour()");
	}

}
