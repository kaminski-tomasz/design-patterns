package patterns.behavioral.visitor;

/**
 * Implementation of concrete element
 * 
 * @author Tomek
 *
 */
public class ConcreteElementA implements Element
{
	@Override
	public void accept( Visitor visitor )
	{
		visitor.visitConcreteElementA( this );
	}

	public void operationA()
	{
		System.out.println( "ConcreteElementA.operationA()" );
	}
}
