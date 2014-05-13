package patterns.creational.abstractfactory;

public class Client {

	public static void testFactory(IAbstractFactory factory) {
		IProductA productA;
		IProductB productB;
		productA = factory.createProductA();
		System.out.println(productA.getADescription());
		productB = factory.createProductB();
		System.out.println(productB.getBDescription());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IAbstractFactory factory;
		
		/* Product family 1 */
		factory = new ConcreteFactory1();
		testFactory(factory);
		
		/* Product family 2 */
		factory = new ConcreteFactory2();
		testFactory(factory);
	}

}
