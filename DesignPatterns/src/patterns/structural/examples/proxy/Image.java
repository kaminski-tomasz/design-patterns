package patterns.structural.examples.proxy;

import java.io.InputStream;
import java.io.OutputStream;

import patterns.structural.examples.Point;

public class Image implements Graphic
{
	private String fileName;
	private Point extent;

	public Image( String file )
	{
		this.fileName = file;
		load( System.in );
	}

	@Override
	public void draw( Point at )
	{
		System.out.println( "Drawing " + fileName + " at " + at );
	}

	@Override
	public void handleMouse( Event event )
	{
		System.out.println( "Handling mouse event in " + fileName );
	}

	@Override
	public Point getExtent()
	{
		return extent;
	}

	@Override
	public void load( InputStream inputStream )
	{
		System.out.println( "Loading whole image " + fileName + " from inpuStream" );
		extent = new Point( 400, 500 );
	}

	@Override
	public void save( OutputStream outputStream )
	{
		System.out.println( "Saving whole image " + fileName + " to outpuStream" );
	}
}
