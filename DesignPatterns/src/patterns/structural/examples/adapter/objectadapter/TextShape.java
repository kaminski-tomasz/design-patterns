package patterns.structural.examples.adapter.objectadapter;

import patterns.structural.examples.Point;
import patterns.structural.examples.adapter.Manipulator;
import patterns.structural.examples.adapter.Shape;
import patterns.structural.examples.adapter.TextView;

public class TextShape implements Shape
{
	private TextView textView;

	public TextShape( TextView textView )
	{
		this.textView = textView;
	}

	@Override
	public void boundingBox( final Point bottomLeft, final Point topRight )
	{
		Point origin = textView.getOrigin();
		Point extent = textView.getExtent();

		bottomLeft.setX( origin.getX() );
		bottomLeft.setY( origin.getY() );
		topRight.setX( origin.getX() + extent.getX() );
		topRight.setY( origin.getY() + extent.getY() );
	}

	public boolean isEmpty()
	{
		return textView.isEmpty();
	}

	@Override
	public Manipulator createManipulator()
	{
		return new TextManipulator( this );
	}
}
