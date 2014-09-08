package patterns.structural.facade;

/**
 * Testing Facade Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Facade facade = new Facade();
		facade.facadeRequest1();
		facade.facadeRequest2();
		facade.facadeRequest3();
	}
}
