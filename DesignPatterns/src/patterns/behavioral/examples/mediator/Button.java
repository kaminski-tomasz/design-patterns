package patterns.behavioral.examples.mediator;

public class Button extends Widget
{
	private String text;

	public Button( DialogDirector director )
	{
		super( director );
	}

	public void setText( String text )
	{
		this.text = text;
	}

	public String getText()
	{
		return text;
	}

	@Override
	public void handleMouse( MouseEvent event )
	{
		changed();
	}
}
