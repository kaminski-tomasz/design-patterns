package patterns.creational.abstractfactory;

/**
 * Example of concrete factory
 * 
 * @author Tomek
 *
 */
public class ConcreteFactory2 implements AbstractFactory
{
	@Override
	public AbstractProductA createProductA()
	{
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB()
	{
		return new ProductB2();
	}
}
