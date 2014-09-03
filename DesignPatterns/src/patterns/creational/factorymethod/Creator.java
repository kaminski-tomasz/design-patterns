package patterns.creational.factorymethod;

/**
 * Creator class with declaration of factory method. Other way is to create
 * default factory method.
 * 
 * @author Tomek
 *
 */
public abstract class Creator
{
	/**
	 * Declaration of factory method
	 * 
	 * @return null
	 */
	public abstract Product FactoryMethod();

	/**
	 * Sample operation which uses the FactoryMethod to create the product
	 * object
	 */
	public void anOperation()
	{
		System.out.println( "Creating the product" );
		Product product = FactoryMethod();
		System.out.println( "The product value is " + product.getValue() );
	}
}
