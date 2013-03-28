package patterns.composite.parent;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<IComponent> componentList = new ArrayList<IComponent>();

	@Override
	public void operation() {
		System.out.println("Operations in Composite:");
		for (IComponent component : componentList) {
			component.operation();
		}
	}

	@Override
	public boolean add(IComponent component) {
		if (component instanceof Component) {
			((Component) component).setParent(this);
		}
		return componentList.add(component);
	}

	@Override
	public boolean remove(IComponent component) {
		if (component instanceof Component) {
			((Component) component).setParent(null);
		}
		return componentList.remove(component);
	}

	@Override
	public IComponent getChildren(int i) {
		return componentList.get(i);
	}

}
