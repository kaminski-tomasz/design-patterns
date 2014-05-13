package patterns.creational.examples.builder;

import patterns.creational.examples.Maze;

public abstract class MazeBuilder
{
	public void buildMaze()
	{
	};

	public void buildRoom( int room )
	{
	};

	public void buildDoor( int roomFrom, int roomTo )
	{
	};

	public Maze getMaze()
	{
		return null;
	}
}
