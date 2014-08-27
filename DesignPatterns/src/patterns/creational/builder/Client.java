package patterns.creational.builder;

/**
 * Testing the builder pattern.
 * 
 * @author Tomek
 *
 */
public class Client
{

	public static void main( String[] args )
	{
		Director director = new Director();

		ConcreteBuilder builder = new ConcreteBuilder();
		director.setBuilder( builder );
		director.construct();

		Product product = builder.getProduct();
		System.out.println( "The product is:\n" + product.getValue() );
	}

}
