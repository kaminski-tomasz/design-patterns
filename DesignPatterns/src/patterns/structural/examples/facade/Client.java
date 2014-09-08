package patterns.structural.examples.facade;

public class Client
{
	public static void main( String[] args )
	{
		Compiler compiler = new Compiler();
		compiler.compile( System.in, System.out );
	}
}
