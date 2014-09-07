package patterns.structural.decorator;

/**
 * Testing Decorator pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Component component = new ConcreteComponent();
		System.out.println( "***** ConcreteComponent *****" );
		component.operation();

		System.out.println( "***** ConcreteDecoratorB *****" );
		component = new ConcreteDecoratorB( component );
		component.operation();

		System.out.println( "***** ConcreteDecoratorA *****" );
		component = new ConcreteDecoratorA( component );
		String newState = "ConcreteDecoratorA.addedState";
		( ( ConcreteDecoratorA )component ).setAddedState( newState );
		System.out.println( ( ( ConcreteDecoratorA )component ).getAddedState() );
		component.operation();
	}
}
