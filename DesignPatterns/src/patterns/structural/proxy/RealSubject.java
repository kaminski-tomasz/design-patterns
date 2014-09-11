package patterns.structural.proxy;

/**
 * Concrete subject
 * 
 * @author Tomek
 *
 */
public class RealSubject implements Subject
{
	@Override
	public void request()
	{
		System.out.println( "RealSubject.request()" );
	}
}
