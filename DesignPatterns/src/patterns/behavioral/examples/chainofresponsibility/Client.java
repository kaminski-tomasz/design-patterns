package patterns.behavioral.examples.chainofresponsibility;

public class Client
{
	public static void main( String[] args )
	{
		Application application = new Application( Topic.APPLICATION_TOPIC );
		Dialog dialog = new Dialog( application, Topic.PRINT_TOPIC );
		Button button = new Button( dialog, Topic.PAPER_ORIENTATION_TOPIC );
		Button button2 = new Button( dialog );

		application.handleHelp();
		button.handleHelp();
		button2.handleHelp();
		dialog.handleHelp();
	}
}
