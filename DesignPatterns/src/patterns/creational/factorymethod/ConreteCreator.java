package patterns.creational.factorymethod;

/**
 * Implementation of concrete creator
 * 
 * @author Tomek
 *
 */
public class ConreteCreator extends Creator
{
	@Override
	public Product FactoryMethod()
	{
		return new ConcreteProduct( "ConreteProductValue" );
	}
}
