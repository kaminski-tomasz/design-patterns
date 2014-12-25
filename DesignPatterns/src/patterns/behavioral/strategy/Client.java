package patterns.behavioral.strategy;

/**
 * Testing the Strategy pattern.
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		// create context
		Context context = new Context( new ConcreteStrategyA() );

		// run strategy
		context.contextInterface( "Text1" );
		context.contextInterface( "Text2" );

		// change strategy
		context.setStrategy( new ConcreteStrategyB() );
		// run strategy
		context.contextInterface( "Text3" );
		context.contextInterface( "Text4" );

		// change strategy
		context.setStrategy( new ConcreteStrategyB() );
		// run strategy
		context.contextInterface( "Text5" );
		context.contextInterface( "Text6" );
	}
}
