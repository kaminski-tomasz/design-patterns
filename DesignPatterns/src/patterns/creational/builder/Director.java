package patterns.creational.builder;

/**
 * Director class. Manages building the product.
 * 
 * @author Tomek
 *
 */
public class Director
{
	private Builder builder;

	public void construct()
	{
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
	}

	public Builder getBuilder()
	{
		return builder;
	}

	public void setBuilder( Builder builder )
	{
		this.builder = builder;
	}

}
