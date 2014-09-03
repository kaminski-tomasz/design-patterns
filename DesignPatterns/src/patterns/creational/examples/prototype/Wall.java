package patterns.creational.examples.prototype;

import patterns.creational.examples.MapSite;

public class Wall implements MapSite, Cloneable
{
	@Override
	public void enter()
	{
		System.out.println( "The wall is encountered" );
	}

	/**
	 * Clone operation
	 */
	@Override
	protected Wall clone()
	{
		try
		{
			return ( Wall )super.clone();
		} catch( CloneNotSupportedException e )
		{
			return new Wall();
		}
	}
}
