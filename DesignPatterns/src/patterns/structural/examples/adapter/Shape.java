package patterns.structural.examples.adapter;

import patterns.structural.examples.Point;

public interface Shape
{
	public void boundingBox( Point bottomLeft, Point topRight );

	public Manipulator createManipulator();
}
