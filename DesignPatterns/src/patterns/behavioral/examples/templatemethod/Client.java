package patterns.behavioral.examples.templatemethod;

public class Client
{
	public static void main( String[] args )
	{
		View myView = new MyView();
		myView.display();
	}
}
