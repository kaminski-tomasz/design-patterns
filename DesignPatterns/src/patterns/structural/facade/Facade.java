package patterns.structural.facade;

/**
 * Facade of the subsystem classes
 * 
 * @author Tomek
 *
 */
public class Facade
{
	public void facadeRequest1()
	{
		SubSystemClass1 object = new SubSystemClass1();
		object.request1();
	}

	public void facadeRequest2()
	{
		SubSystemClass2 object = new SubSystemClass2();
		object.request2();
	}

	public void facadeRequest3()
	{
		SubSystemClass3 object = new SubSystemClass3();
		object.setPrivateField( new SubSystemClass2() );
		object.request3();
	}
}
