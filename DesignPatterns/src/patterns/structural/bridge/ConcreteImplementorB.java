package patterns.structural.bridge;

/**
 * Concrete implementor B
 * 
 * @author Tomek
 *
 */
public class ConcreteImplementorB implements Implementor
{
	@Override
	public void operationImpl()
	{
		System.out.println( "ConcreteImplementorB.operationImpl" );
	}
}
