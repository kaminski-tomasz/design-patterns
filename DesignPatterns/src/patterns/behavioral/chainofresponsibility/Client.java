package patterns.behavioral.chainofresponsibility;

/**
 * Testing the Chain of Responsibility Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Handler handler1 = new ConcreteHandler1( null );
		Handler handler2 = new ConcreteHandler2( handler1 );

		handler1.handleRequest();
		handler2.handleRequest();
	}
}
