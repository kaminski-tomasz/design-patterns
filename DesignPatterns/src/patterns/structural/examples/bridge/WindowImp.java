package patterns.structural.examples.bridge;

import patterns.structural.examples.Point;

public interface WindowImp
{
	public void impTop();

	public void impBottom();

	public void impSetExtent( Point extent );

	public void impSetOrigin( Point origin );

	public void deviceRect( float x, float y, float w, float h );

	public void deviceText( String text, Point at );

	public void deviceBitmap( String text, float x, float y );
}
