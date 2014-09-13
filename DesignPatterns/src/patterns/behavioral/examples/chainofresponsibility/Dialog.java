package patterns.behavioral.examples.chainofresponsibility;

public class Dialog extends Widget
{
	public Dialog( HelpHandler handler )
	{
		this( handler, Topic.NO_HELP_TOPIC );
	}

	public Dialog( HelpHandler handler, Topic topic )
	{
		super( null );
		setHandler( handler, topic );
	}

	@Override
	public void handleHelp()
	{
		if( hasHelp() )
		{
			System.out.println( "Dialog: handling help request" );
		}
		else
		{
			super.handleHelp();
		}
	}
}
