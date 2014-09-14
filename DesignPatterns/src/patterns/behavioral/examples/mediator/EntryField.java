package patterns.behavioral.examples.mediator;

public class EntryField extends Widget
{
	private String value;

	public EntryField( DialogDirector director )
	{
		super( director );
	}

	public String getText()
	{
		return value;
	}

	public void setText( String value )
	{
		this.value = value;
	}

	@Override
	public void handleMouse( MouseEvent event )
	{
		super.handleMouse( event );
	}
}
