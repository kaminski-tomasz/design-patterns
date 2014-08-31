package patterns.creational.abstractfactory;

/**
 * Interface of the abstract factory
 * 
 * @author Tomek
 *
 */
public interface AbstractFactory
{
	public AbstractProductA createProductA();

	public AbstractProductB createProductB();
}
