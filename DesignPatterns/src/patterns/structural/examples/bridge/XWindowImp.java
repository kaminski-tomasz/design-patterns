package patterns.structural.examples.bridge;

import patterns.structural.examples.Point;

public class XWindowImp implements WindowImp
{
	@Override
	public void impTop()
	{
	}

	@Override
	public void impBottom()
	{
	}

	@Override
	public void impSetExtent( Point extent )
	{
	}

	@Override
	public void impSetOrigin( Point origin )
	{
	}

	@Override
	public void deviceRect( float x, float y, float w, float h )
	{
	}

	@Override
	public void deviceText( String text, Point at )
	{
	}

	@Override
	public void deviceBitmap( String text, float x, float y )
	{
	}
}
