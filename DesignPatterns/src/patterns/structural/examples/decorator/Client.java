package patterns.structural.examples.decorator;

public class Client
{
	public static void main( String[] args )
	{
		Window window = new Window();

		window.addComponent( 
			new BorderDecorator( 
				new ScrollDecorator( 
					new TextView() ), 30 ) );
		
		window.addComponent( 
			new ScrollDecorator( 
				new TextView() ) );

		window.draw();
	}
}
