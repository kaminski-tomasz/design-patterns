package patterns.structural.examples.decorator;

public class BorderDecorator extends Decorator
{
	private int width;

	public BorderDecorator( VisualComponent component, int borderWidth )
	{
		super( component );
		this.width = borderWidth;
	}

	@Override
	public void draw()
	{
		super.draw();
		drawBorder( width );
	}

	private void drawBorder( int w )
	{
		System.out.println( "Drawing border with width=" + w );
	}
}
