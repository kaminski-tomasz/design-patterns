package patterns.behavioral.templatemethod;

/**
 * Subclass of AbstractClass which implements primitive operations for Template
 * Method
 * 
 * @author Tomek
 *
 */
public class ConcreteClass extends AbstractClass
{
	@Override
	protected void primitiveOperation1()
	{
		System.out.println( "ConcreteClass.primitiveOperation1()" );
	}

	@Override
	protected void primitiveOperation2()
	{
		System.out.println( "ConcreteClass.primitiveOperation2()" );
	}
}
