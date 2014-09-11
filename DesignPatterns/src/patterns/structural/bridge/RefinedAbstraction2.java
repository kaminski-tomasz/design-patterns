package patterns.structural.bridge;

/**
 * Refined abstraction implementation
 * 
 * @author Tomek
 *
 */
public class RefinedAbstraction2 extends Abstraction
{
	public RefinedAbstraction2( ImplementorType implType )
	{
		super( implType );
	}

	public void operation2()
	{
		System.out.println( "RefinedAbstraction2.operation2()" );
		Implementor impl = getImplementor();
		impl.operationImpl();
		impl.operationImpl();
		impl.operationImpl();
		impl.operationImpl();
	}
}
