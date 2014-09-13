package patterns.behavioral.examples.chainofresponsibility;

public class HelpHandler
{
	private HelpHandler successor;
	private Topic topic;

	public HelpHandler( HelpHandler successor )
	{
		this( successor, Topic.NO_HELP_TOPIC );
	}

	public HelpHandler( HelpHandler successor, Topic topic )
	{
		this.successor = successor;
		this.topic = topic;
	}

	public void setHandler( HelpHandler handler, Topic topic )
	{
		this.successor = handler;
		this.topic = topic;
	}

	public boolean hasHelp()
	{
		return topic != Topic.NO_HELP_TOPIC;
	}

	public void handleHelp()
	{
		if( successor != null )
		{
			successor.handleHelp();
		}
	}
}
