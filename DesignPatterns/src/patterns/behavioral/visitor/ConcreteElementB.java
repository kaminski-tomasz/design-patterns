package patterns.behavioral.visitor;

/**
 * Implementation of concrete element
 * 
 * @author Tomek
 *
 */
public class ConcreteElementB implements Element
{
	@Override
	public void accept( Visitor visitor )
	{
		visitor.visitConcreteElementB( this );
	}

	public void operationB()
	{
		System.out.println( "ConcreteElementB.operationB()" );
	}
}
