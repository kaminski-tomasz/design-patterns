package patterns.behavioral.mediator;

/**
 * Implementation of concrete mediator
 * 
 * @author Tomek
 *
 */
public class ConcreteMediator implements Mediator
{
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;

	public ConcreteMediator()
	{
		colleague1 = new ConcreteColleague1( this );
		colleague2 = new ConcreteColleague2( this );
	}

	@Override
	public void handleOperation( Colleague colleague )
	{
		if( colleague == colleague1 )
		{
			System.out.println( "Handling colleague1.operation()" );
		}
		else if( colleague == colleague2 )
		{
			System.out.println( "Handling colleague2.operation()" );
		}
	}

	/**
	 * Testing the Mediator Pattern
	 * 
	 * @param args
	 */
	public static void main( String[] args )
	{
		ConcreteMediator mediator = new ConcreteMediator();
		ConcreteColleague1 colleague = mediator.colleague1;
		colleague.operation();
	}
}
