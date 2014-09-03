package patterns.creational.prototype;

/**
 * Concrete prototype implementation with clone operation
 * 
 * @author Tomek
 *
 */
public class ConcretePrototype2 implements Prototype
{
	private String value;

	public ConcretePrototype2()
	{
	}

	public ConcretePrototype2( String value )
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
		System.out.println("ConcretePrototype2: my value is " + getValue());
	}
	
	/**
	 * Clone itself
	 */
	@Override
	public ConcretePrototype2 clone()
	{
		ConcretePrototype2 cloned = new ConcretePrototype2( this.value );
		return cloned;
	}
}
