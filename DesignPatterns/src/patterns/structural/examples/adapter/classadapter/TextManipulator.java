package patterns.structural.examples.adapter.classadapter;

import patterns.structural.examples.adapter.Manipulator;

public class TextManipulator implements Manipulator
{
	private TextShape shape;

	public TextManipulator( TextShape shape )
	{
		this.setShape( shape );
	}

	@Override
	public void manipulate()
	{
		System.out.println( "Manipulating TextShape" );
	}

	public TextShape getShape()
	{
		return shape;
	}

	public void setShape( TextShape shape )
	{
		this.shape = shape;
	}
}
