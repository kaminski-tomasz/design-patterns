package patterns.creational.examples;

public class Wall implements MapSite
{
	@Override
	public void enter()
	{
		System.out.println( "The wall is encountered" );
	}
}
