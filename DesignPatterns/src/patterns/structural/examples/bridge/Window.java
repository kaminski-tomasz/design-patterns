package patterns.structural.examples.bridge;

import java.util.List;

import patterns.structural.examples.Point;

public class Window
{
	private View contents;
	private WindowImp imp;

	public Window( View contents )
	{
		this.contents = contents;
	}

	/*
	 * ¯¹dania obs³ugiwane przez okna
	 */
	public void drawContents()
	{
	}

	public void open()
	{
	}

	public void close()
	{
	}

	public void iconify()
	{
	}

	public void deiconify()
	{
	}

	/*
	 * ¯¹dania przekazywane do implementacji
	 */
	public void setOrigin( Point at )
	{
		WindowImp imp = getWindowImp();
		if( imp != null )
		{
			imp.impSetOrigin( at );
		}
	}

	public void setExtent( Point extent )
	{
		WindowImp imp = getWindowImp();
		if( imp != null )
		{
			imp.impSetExtent( extent );
		}
	}

	public void raise()
	{
	}

	public void lower()
	{
	}

	public void drawLine( Point point1, Point point2 )
	{
	}

	public void drawRect( Point point1, Point point2 )
	{
		WindowImp imp = getWindowImp();
		if( imp != null )
		{
			imp.deviceRect( point1.getX(), point1.getY(), point2.getX(), point2.getY() );
		}
	}

	public void drawPolygon( List< Point > pointList, int n )
	{
	}

	public void drawText( String text, Point at )
	{
		WindowImp imp = getWindowImp();
		if( imp != null )
		{
			imp.deviceText( text, at );
		}
	}

	/*
	 * Metody chronione
	 */
	protected WindowImp getWindowImp()
	{
		if( imp == null )
		{
			imp = WindowSystemFactory.getInstance().makeWindowImp();
		}
		return imp;
	}

	protected View getView()
	{
		return this.contents;
	}
}
