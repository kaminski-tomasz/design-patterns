package patterns.behavioral.examples.mediator;

public abstract class Widget
{
	private DialogDirector director;

	public Widget( DialogDirector director )
	{
		this.director = director;
	}

	public void changed()
	{
		if( director != null )
		{
			director.widgetChanged( this );
		}
	}

	public void handleMouse( MouseEvent event )
	{
		System.out.println( "Widget: handling mouse event" );
	}
}
