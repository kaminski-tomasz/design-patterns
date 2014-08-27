package patterns.creational.examples.builder;

import patterns.creational.examples.Maze;

public class CountingMazeBuilder extends MazeBuilder
{
	private int doors;
	private int rooms;

	@Override
	public void buildMaze()
	{
		doors = rooms = 0;
	}

	@Override
	public Maze getMaze()
	{
		return null;
	}

	@Override
	public void buildRoom( int n )
	{
		rooms++;
	}

	@Override
	public void buildDoor( int roomFrom, int roomTo )
	{
		doors++;
	}

	public int getDoors()
	{
		return doors;
	}

	public int getRooms()
	{
		return rooms;
	}
}
