package patterns.creational.prototype;

/**
 * Testing the Prototype pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	private Prototype prototype;

	/**
	 * Do something with cloned object
	 */
	public void operation()
	{
		Prototype p = ( Prototype )prototype.clone();
		p.sayHello();
	}

	public void setPrototype( Prototype prototype )
	{
		this.prototype = prototype;
	}

	public static void main( String[] args )
	{
		Client client = new Client();

		client.setPrototype( new ConcretePrototype1("someValue1") );
		client.operation();
		client.operation();

		client.setPrototype( new ConcretePrototype2("someValue2") );
		client.operation();
		client.operation();
		client.operation();
	}
}
