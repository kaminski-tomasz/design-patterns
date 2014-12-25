package patterns.behavioral.examples.strategy;

public class Client
{
	public static void main( String[] args )
	{
		Composition quick = new Composition( new SimpleCompositor() );
		Composition slick = new Composition( new TeXCompositor() );
		Composition iconic = new Composition( new ArrayCompositor() );

		quick.repair();
		slick.repair();
		iconic.repair();
	}
}
