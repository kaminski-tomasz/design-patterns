package patterns.decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IComponent component = new ConcreteComponent();
		System.out.println("***** ConcreteComponent *****");
		component.operation();
		
		System.out.println("***** ConcreteDecoratorB *****");
		component = new ConcreteDecoratorB(component);
		component.operation();
		
		System.out.println("***** ConcreteDecoratorA *****");
		component = new ConcreteDecoratorA(component);
		((ConcreteDecoratorA) component).setAddedState("ConcreteDecoratorA.addedState");
		System.out.println((String)((ConcreteDecoratorA) component).getAddedState());
		component.operation();
		
	}

}
