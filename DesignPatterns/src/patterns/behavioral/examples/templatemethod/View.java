package patterns.behavioral.examples.templatemethod;

public abstract class View
{
	public final void display()
	{
		setFocus();
		doDisplay();
		resetFocus();
	}

	protected void doDisplay()
	{
	}

	private void setFocus()
	{
		System.out.println( "View.setFocus()" );
	}

	private void resetFocus()
	{
		System.out.println( "View.resetFocus()" );
	}
}
