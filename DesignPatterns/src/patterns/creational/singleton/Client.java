package patterns.creational.singleton;

/**
 * Testing the Singleton pattern.
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Singleton object = Singleton.getInstance();
		object.setData( "value1" );
		object.operation();

		Singleton anotherObject = Singleton.getInstance();
		anotherObject.setData( "value2" );
		anotherObject.operation();

		System.out.println( "Objects are equal: " + object.equals( anotherObject ) );
	}
}
