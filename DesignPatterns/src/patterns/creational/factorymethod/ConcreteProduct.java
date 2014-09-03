package patterns.creational.factorymethod;

/**
 * Concrete product
 * 
 * @author Tomek
 *
 */
public class ConcreteProduct implements Product
{
	private String value;

	public ConcreteProduct()
	{
	}

	public ConcreteProduct( String value )
	{
		setValue( value );
	}

	@Override
	public String getValue()
	{
		return value;
	}

	@Override
	public void setValue( String value )
	{
		this.value = value;
	}
}
