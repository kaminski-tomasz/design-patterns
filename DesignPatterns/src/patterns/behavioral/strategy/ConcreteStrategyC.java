package patterns.behavioral.strategy;

/**
 * Concrete Strategy
 * 
 * @author Tomek
 *
 */
public class ConcreteStrategyC implements Strategy
{
	@Override
	public void algorithmInterface( String input )
	{
		System.out.println( "ConcreteStrategyC.algorithmInterface("
				+ input + ")" );
	}
}
