package patterns.composite.flexible;

import javax.naming.OperationNotSupportedException;

public interface IComponent {

	public void doSomething();

	public boolean add(IComponent component)
			throws OperationNotSupportedException;

	public boolean remove(IComponent component)
			throws OperationNotSupportedException;

	public IComponent getChild(int i) 
			throws OperationNotSupportedException;

}
