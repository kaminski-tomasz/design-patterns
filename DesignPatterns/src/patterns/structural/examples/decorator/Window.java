package patterns.structural.examples.decorator;

import java.util.ArrayList;
import java.util.List;

public class Window
{
	private List< VisualComponent > contents;

	public Window()
	{
		contents = new ArrayList< VisualComponent >();
	}

	public void addComponent( VisualComponent component )
	{
		this.contents.add( component );
	}

	public void draw()
	{
		for( int i = 0; i < contents.size(); i++ )
		{
			System.out.println( "*** Component " + ( i + 1 ) + " ***" );
			contents.get( i ).draw();
		}
	}
}
