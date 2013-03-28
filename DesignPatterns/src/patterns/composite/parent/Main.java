package patterns.composite.parent;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IComponent myComponent = new Composite();
		myComponent.add(new LeafA());
		myComponent.add(new LeafB());

		IComponent nestedComponent = new Composite();
		nestedComponent.add(new LeafA());
		nestedComponent.add(new LeafA());
		nestedComponent.add(new LeafA());

		myComponent.add(nestedComponent);
		myComponent.operation();
	}

}
