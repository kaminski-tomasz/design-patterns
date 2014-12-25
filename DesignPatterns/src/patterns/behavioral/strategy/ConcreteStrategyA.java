package patterns.behavioral.strategy;

/**
 * Concrete Strategy
 * 
 * @author Tomek
 *
 */
public class ConcreteStrategyA implements Strategy
{
	@Override
	public void algorithmInterface( String input )
	{
		System.out.println( "ConcreteStrategyA.algorithmInterface("
				+ input + ")" );
	}
}
