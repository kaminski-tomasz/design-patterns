package patterns.behavioral.state;

/**
 * Testing the State Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Context context = new Context();

		context.changeState( new ConcreteStateA() );
		context.request();

		context.changeState( new ConcreteStateB() );
		context.request();
	}
}
