package patterns.behavioral.templatemethod;

/**
 * Testing the Template Method Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		AbstractClass obj = new ConcreteClass();
		obj.templateMethod();
	}
}
