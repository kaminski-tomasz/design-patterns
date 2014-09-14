package patterns.behavioral.examples.mediator;

public class Client
{
	public static void main( String[] args )
	{
		FontDialogDirector dialogDirector = new FontDialogDirector();
		dialogDirector.createWidgets();

		FontDialogDirector.pressOk( dialogDirector );
	}
}
