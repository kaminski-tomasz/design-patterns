package patterns.behavioral.strategy;

/**
 * Concrete Strategy
 * 
 * @author Tomek
 *
 */
public class ConcreteStrategyB implements Strategy
{
	@Override
	public void algorithmInterface( String input )
	{
		System.out.println( "ConcreteStrategyB.algorithmInterface("
				+ input + ")" );
	}
}
