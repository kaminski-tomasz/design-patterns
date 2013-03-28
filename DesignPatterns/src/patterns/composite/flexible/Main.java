package patterns.composite.flexible;

import javax.naming.OperationNotSupportedException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IComponent elem = new Composite();
		
		try {
			
			
			elem.add(new LeafA());
			elem.add(new LeafB());

			Composite composite = new Composite();
			composite.add(new LeafA());
			composite.add(new LeafA());
			composite.add(new LeafA());

			elem.add(composite);
			
			elem.doSomething();
			
			
		} catch (OperationNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
