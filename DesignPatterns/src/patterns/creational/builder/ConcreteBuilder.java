package patterns.creational.builder;

/**
 * Example of concrete builder.
 * 
 * @author Tomek
 *
 */
public class ConcreteBuilder extends Builder
{
	StringBuilder stringBuilder;

	public ConcreteBuilder()
	{
		stringBuilder = new StringBuilder();
	}

	@Override
	void buildPartA()
	{
		stringBuilder.append( "part A" );
	}

	@Override
	void buildPartB()
	{
		stringBuilder.append( "\npart B" );
	}

	@Override
	void buildPartC()
	{
		stringBuilder.append( "\npart C" );
	}

	public Product getProduct()
	{
		return new Product( stringBuilder.toString() );
	}
}
