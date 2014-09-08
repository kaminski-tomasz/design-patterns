package patterns.structural.examples.facade;

import java.io.InputStream;

public class Scanner
{
	@SuppressWarnings( "unused" )
	private InputStream inputStream;

	public Scanner( InputStream input )
	{
		this.inputStream = input;
	}

	public Token scan()
	{
		System.out.println( "Scan the inputStream" );
		return new Token();
	}
}
