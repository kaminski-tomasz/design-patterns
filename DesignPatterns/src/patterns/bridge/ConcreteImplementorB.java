package patterns.bridge;

public class ConcreteImplementorB implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("B: operationImpl");
	}

}
