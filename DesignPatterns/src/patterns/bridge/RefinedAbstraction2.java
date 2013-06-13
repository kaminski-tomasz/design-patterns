package patterns.bridge;

public class RefinedAbstraction2 extends Abstraction {

	public RefinedAbstraction2(ImplementorType implType) {
		super(implType);
	}
	
	public void operation2() {
		System.out.println("R2: operationY");
		Implementor impl = getImplementor();
		impl.operationImpl();
		impl.operationImpl();
		impl.operationImpl();
		impl.operationImpl();
	}

}
