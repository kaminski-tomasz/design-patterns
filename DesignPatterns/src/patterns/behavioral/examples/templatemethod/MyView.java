package patterns.behavioral.examples.templatemethod;

public class MyView extends View
{
	@Override
	protected void doDisplay()
	{
		System.out.println( "MyView.doDisplay()" );
	}
}
