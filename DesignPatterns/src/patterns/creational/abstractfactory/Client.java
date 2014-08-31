package patterns.creational.abstractfactory;

/**
 * Testing the factory pattern.
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void testFactory( AbstractFactory factory )
	{
		AbstractProductA productA;
		AbstractProductB productB;
		productA = factory.createProductA();
		System.out.println( productA.getADescription() );
		productB = factory.createProductB();
		System.out.println( productB.getBDescription() );
	}

	public static void main( String[] args )
	{
		AbstractFactory factory;

		/* Product family 1 */
		factory = new ConcreteFactory1();
		testFactory( factory );

		/* Product family 2 */
		factory = new ConcreteFactory2();
		testFactory( factory );
	}
}
