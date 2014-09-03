package patterns.creational.examples.prototype;

import patterns.creational.examples.prototype.Door;
import patterns.creational.examples.prototype.Maze;
import patterns.creational.examples.prototype.Room;
import patterns.creational.examples.prototype.Wall;

public class MazeFactory
{
	public Maze makeMaze()
	{
		return new Maze();
	}

	public Wall makeWall()
	{
		return new Wall();
	}

	public Room makeRoom( int num )
	{
		return new Room( num );
	}

	public Door makeDoor( Room r1, Room r2 )
	{
		return new Door( r1, r2 );
	}
}
