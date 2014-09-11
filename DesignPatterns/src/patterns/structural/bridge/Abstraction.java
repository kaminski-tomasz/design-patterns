package patterns.structural.bridge;

/**
 * Abstraction of the Bridge
 * 
 * @author Tomek
 *
 */
public abstract class Abstraction
{
	private Implementor implementor;

	public enum ImplementorType
	{
		IMPL_A, IMPL_B
	}

	public Abstraction( ImplementorType implType )
	{
		switch( implType )
		{
			case IMPL_A:
			default:
				implementor = new ConcreteImplementorA();
				break;
			case IMPL_B:
				implementor = new ConcreteImplementorB();
				break;
		}
	}

	protected Implementor getImplementor()
	{
		return implementor;
	}

	protected void setImplementor( Implementor implementor )
	{
		this.implementor = implementor;
	}

	public void operation()
	{
		System.out.println( "Abstraction.operation" );
		implementor.operationImpl();
	}
}
