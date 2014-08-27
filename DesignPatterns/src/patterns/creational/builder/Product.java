package patterns.creational.builder;

/**
 * Example of product class
 * 
 * @author Tomek
 *
 */
public class Product
{
	private String value;

	public Product( String value )
	{
		this.value = value;
	}

	public String getValue()
	{
		return value;
	}
}
