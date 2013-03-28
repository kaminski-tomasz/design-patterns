package patterns.composite.flexible;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

	List<IComponent> list = new ArrayList<IComponent>();
	
	@Override
	public void doSomething() {
		for (IComponent elem : list) {
			elem.doSomething();
		}
	}

	@Override
	public boolean add(IComponent component) {
		return list.add(component);
	}

	@Override
	public boolean remove(IComponent component) {
		return list.remove(component);
	}

	@Override
	public IComponent getChild(int i) {
		return list.get(i);
	}

}
