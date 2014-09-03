package patterns.creational.examples.prototype;

import patterns.creational.examples.prototype.Wall;

public class BombedWall extends Wall
{
	@Override
	public void enter()
	{
		System.out.print("BombedWall: ");
		super.enter();
	}
	
	@Override
	protected Wall clone()
	{
		/*
		 * All required operations are performed in upper class
		 */
		return super.clone();
	}
}
