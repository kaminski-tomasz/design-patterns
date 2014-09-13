package patterns.behavioral.examples.chainofresponsibility;

public class Button extends Widget
{
	public Button( Widget parent )
	{
		this( parent, Topic.NO_HELP_TOPIC );
	}

	public Button( Widget parent, Topic topic )
	{
		super( parent, topic );
	}

	@Override
	public void handleHelp()
	{
		if( hasHelp() )
		{
			System.out.println( "Button: handling help request " );
		}
		else
		{
			super.handleHelp();
		}
	}
}
