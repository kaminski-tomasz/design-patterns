package patterns.bridge;

public class ConcreteImplementorA implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("A: operationImpl");
	}

}
