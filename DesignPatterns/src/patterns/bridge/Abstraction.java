package patterns.bridge;

public abstract class Abstraction {

	private Implementor impl;

	public enum ImplementorType {
		IMPL_A, IMPL_B
	}

	public Abstraction(ImplementorType implType) {
		switch (implType) {
		case IMPL_A:
		default:
			impl = new ConcreteImplementorA();
			break;
		case IMPL_B:
			impl = new ConcreteImplementorB();
			break;
		}
	}

	protected Implementor getImplementor() {
		return impl;
	}

	protected void setImplementor(Implementor implementor) {
		this.impl = implementor;
	}

	public void operation() {
		impl.operationImpl();
	}

}
