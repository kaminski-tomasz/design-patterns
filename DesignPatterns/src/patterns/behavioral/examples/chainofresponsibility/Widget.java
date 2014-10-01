package patterns.behavioral.examples.chainofresponsibility;

public class Widget extends HelpHandler
{
	@SuppressWarnings( "unused" )
	private Widget parent;

	protected Widget( Widget parent )
	{
		this( parent, Topic.NO_HELP_TOPIC );
	}

	protected Widget( Widget parent, Topic topic )
	{
		super( parent, topic );
		this.parent = parent;
	}
}
