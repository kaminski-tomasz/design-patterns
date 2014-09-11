package patterns.structural.bridge;

/**
 * Refined abstraction implementation
 * 
 * @author Tomek
 *
 */
public class RefinedAbstraction1 extends Abstraction
{
	public RefinedAbstraction1( ImplementorType implType )
	{
		super( implType );
	}

	public void operation1()
	{
		System.out.println( "RefinedAbstraction1.operation1()" );
		Implementor impl = getImplementor();
		impl.operationImpl();
		impl.operationImpl();
	}
}
