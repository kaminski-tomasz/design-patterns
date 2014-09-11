package patterns.structural.proxy;

/**
 * Proxy class for real subjects
 * 
 * @author Tomek
 *
 */
public class Proxy implements Subject
{
	private RealSubject realSubject;

	@Override
	public void request()
	{
		getRealSubject().request();
	}

	protected RealSubject getRealSubject()
	{
		if( realSubject == null )
		{
			realSubject = new RealSubject();
		}
		return realSubject;
	}
}
