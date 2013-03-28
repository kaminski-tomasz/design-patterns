package patterns.decorator;

public class ConcreteComponent implements IComponent {

	@Override
	public void operation() {
		System.out.println("ConcreteComponent.operation()");
	}

}
