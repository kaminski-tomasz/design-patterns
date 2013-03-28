package patterns.composite.flexible;

import javax.naming.OperationNotSupportedException;

public class LeafA implements IComponent {

	@Override
	public void doSomething() {
		System.out.println("LeafA.doSomething()");
	}

	@Override
	public boolean add(IComponent component) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public boolean remove(IComponent component) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public IComponent getChild(int i) throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}
}
