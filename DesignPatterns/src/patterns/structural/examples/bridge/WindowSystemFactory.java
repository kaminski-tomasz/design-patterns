package patterns.structural.examples.bridge;

public class WindowSystemFactory
{
	private static WindowSystemFactory instance = null;

	private WindowSystemFactory()
	{
	}

	public WindowImp makeWindowImp()
	{
		return new XWindowImp();
	}

	public static WindowSystemFactory getInstance()
	{
		if( instance == null )
		{
			instance = new WindowSystemFactory();
		}
		return instance;
	}
}
