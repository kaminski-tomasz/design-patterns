package patterns.behavioral.strategy;

/**
 * Context class which runs the strategy
 * 
 * @author Tomek
 * 
 */
public class Context
{
	private Strategy strategy;

	public Context( Strategy strategy )
	{
		setStrategy( strategy );
	}

	/**
	 * Operations performed by the context of the Strategy
	 * 
	 * @param input
	 *                input parameter
	 */
	public void contextInterface( String input )
	{
		System.out.println( "Context with input " + input );
		getStrategy().algorithmInterface( input );
	}

	public Strategy getStrategy()
	{
		return strategy;
	}

	public void setStrategy( Strategy strategy )
	{
		this.strategy = strategy;
	}
}
