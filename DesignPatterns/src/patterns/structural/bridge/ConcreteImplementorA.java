package patterns.structural.bridge;

/**
 * Concrete implementor A
 * 
 * @author Tomek
 *
 */
public class ConcreteImplementorA implements Implementor
{
	@Override
	public void operationImpl()
	{
		System.out.println( "ConcreteImplementorA.operationImpl" );
	}
}
