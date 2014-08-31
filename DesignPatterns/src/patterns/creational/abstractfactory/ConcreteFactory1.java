package patterns.creational.abstractfactory;

/**
 * Example of concrete factory
 * 
 * @author Tomek
 *
 */
public class ConcreteFactory1 implements AbstractFactory
{
	@Override
	public AbstractProductA createProductA()
	{
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB()
	{
		return new ProductB1();
	}
}
