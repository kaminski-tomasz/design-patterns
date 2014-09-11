package patterns.structural.examples.proxy;

public class Client
{
	public static void main( String[] args )
	{
		TextDocument document = new TextDocument();
		document.insert( new ImageProxy( "anImageFile" ) );
	}
}
