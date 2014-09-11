package patterns.structural.examples.proxy;

import java.io.InputStream;
import java.io.OutputStream;

import patterns.structural.examples.Point;

public class ImageProxy implements Graphic
{
	private String fileName;
	private Point extent;
	private Image image;

	public ImageProxy( String fileName )
	{
		this.fileName = fileName;
		this.extent = Point.ZERO;
		this.image = null;
	}

	public Image getImage()
	{
		if( image == null )
		{
			image = new Image( fileName );
		}
		return image;
	}

	@Override
	public Point getExtent()
	{
		if( extent == Point.ZERO )
		{
			extent = getImage().getExtent();
		}
		return extent;
	}

	@Override
	public void draw( Point at )
	{
		getImage().draw( at );
	}

	@Override
	public void handleMouse( Event event )
	{
		getImage().handleMouse( event );
	}

	@Override
	public void load( InputStream inputStream )
	{
		System.out.println( "Load extent and fileName from inputStream" );
	}

	@Override
	public void save( OutputStream outputStream )
	{
		System.out.println( "Save extent and fileName to outputStream" );
	}

}
