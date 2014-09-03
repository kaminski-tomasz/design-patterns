package patterns.creational.prototype;

/**
 * Concrete prototype implementation
 * 
 * @author Tomek
 *
 */
public class ConcretePrototype1 implements Prototype
{
	private String value;

	public ConcretePrototype1()
	{
	}

	public ConcretePrototype1( String value )
	{
		this.value = value;
	}

	public String getValue()
	{
		return value;
	}
	
	@Override
	public void sayHello()
	{
		System.out.println("ConcretePrototype1: my value is " + getValue());
	}
	
	/**
	 * Clone itself
	 */
	@Override
	public ConcretePrototype1 clone()
	{
		ConcretePrototype1 cloned = new ConcretePrototype1( this.value );
		return cloned;
	}
}
