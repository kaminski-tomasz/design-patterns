package patterns.creational.examples.singleton.bombed;

import patterns.creational.examples.Wall;

public class BombedWall extends Wall
{
	@Override
	public void enter()
	{
		System.out.print( "BombedWall: " );
		super.enter();
	}
}
