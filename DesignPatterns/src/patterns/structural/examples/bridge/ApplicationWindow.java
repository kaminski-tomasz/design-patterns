package patterns.structural.examples.bridge;

public class ApplicationWindow extends Window
{
	public ApplicationWindow( View contents )
	{
		super( contents );
	}

	@Override
	public void drawContents()
	{
		getView().drawOn( this );
	}
}
