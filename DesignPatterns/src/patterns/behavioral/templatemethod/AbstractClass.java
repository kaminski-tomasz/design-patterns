package patterns.behavioral.templatemethod;

/**
 * Abstract class which implements template method and primitive operations
 * called by it
 * 
 * @author Tomek
 *
 */
public abstract class AbstractClass
{
	/**
	 * Template method - general algorithm
	 */
	public final void templateMethod()
	{
		System.out.println( "AbstractClass.templateMethod(): beginning" );
		primitiveOperation1();
		primitiveOperation2();
		System.out.println( "AbstractClass.templateMethod(): finishing" );
	}

	/**
	 * Abstract operation which *must* to be overridden (implemented)
	 */
	protected abstract void primitiveOperation1();

	/**
	 * Default operation which *can* be overridden
	 */
	protected void primitiveOperation2()
	{
	}
}
