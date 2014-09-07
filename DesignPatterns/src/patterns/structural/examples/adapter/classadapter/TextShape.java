package patterns.structural.examples.adapter.classadapter;

import patterns.structural.examples.Point;
import patterns.structural.examples.adapter.Manipulator;
import patterns.structural.examples.adapter.Shape;
import patterns.structural.examples.adapter.TextView;

public class TextShape extends TextView implements Shape
{
	@Override
	public void boundingBox( final Point bottomLeft, final Point topRight )
	{
		Point origin = getOrigin();
		Point extent = getExtent();

		bottomLeft.setX( origin.getX() );
		bottomLeft.setY( origin.getY() );
		topRight.setX( origin.getX() + extent.getX() );
		topRight.setY( origin.getY() + extent.getY() );
	}

	@Override
	public boolean isEmpty()
	{
		return super.isEmpty();
	}

	@Override
	public Manipulator createManipulator()
	{
		return new TextManipulator( this );
	}
}
