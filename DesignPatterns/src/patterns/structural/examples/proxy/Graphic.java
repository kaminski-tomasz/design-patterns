package patterns.structural.examples.proxy;

import java.io.InputStream;
import java.io.OutputStream;

import patterns.structural.examples.Point;

public interface Graphic
{
	public void draw( Point at );

	public void handleMouse( Event event );

	public Point getExtent();

	public void load( InputStream inputStream );

	public void save( OutputStream outputStream );
}
