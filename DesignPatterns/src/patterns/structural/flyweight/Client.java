package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Testing the Flyweight Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		FlyweightFactory factory = new FlyweightFactory();

		ConcreteFlyweight concreteFlyweight1 = factory.getFlyweight( 1 );
		ConcreteFlyweight concreteFlyweight2 = factory.getFlyweight( 1 );
		ConcreteFlyweight concreteFlyweight3 = factory.getFlyweight( 2 );
		UnsharedConcreteFlyweight unsharedFlyweight1 = new UnsharedConcreteFlyweight(
				new AllState( "AllState1" ) );
		UnsharedConcreteFlyweight unsharedFlyweight2 = new UnsharedConcreteFlyweight(
				new AllState( "AllState2" ) );

		List< Flyweight > flyweights = new ArrayList< Flyweight >();
		flyweights.add( concreteFlyweight1 );
		flyweights.add( concreteFlyweight2 );
		flyweights.add( concreteFlyweight3 );
		flyweights.add( unsharedFlyweight1 );
		flyweights.add( unsharedFlyweight2 );

		ExtrinsicState context = new ExtrinsicState( "ContextState" );
		for( Flyweight flyweight : flyweights )
		{
			flyweight.operation( context );
		}
	}
}
