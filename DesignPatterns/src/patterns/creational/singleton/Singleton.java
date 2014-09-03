package patterns.creational.singleton;

/**
 * Singleton class. There is only one object in memory after the first use of a
 * getInstance() method.
 * 
 * @author Tomek
 *
 */
public class Singleton
{
	private static Singleton instance;
	private String data;

	private Singleton()
	{
	}

	public static Singleton getInstance()
	{
		if( instance == null )
		{
			instance = new Singleton();
		}
		return instance;
	}

	public void operation()
	{
		System.out.println( "My data value is " + getData() );
	}

	public String getData()
	{
		return data;
	}

	public void setData( String data )
	{
		this.data = data;
	}
}
