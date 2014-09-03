package patterns.creational.examples.abstractfactory;

import patterns.creational.examples.Direction;
import patterns.creational.examples.Door;
import patterns.creational.examples.Maze;
import patterns.creational.examples.Room;

public class MazeGame
{
	public Maze createMaze( MazeFactory factory )
	{
		Maze maze = factory.makeMaze();
		Room r1 = factory.makeRoom( 1 );
		Room r2 = factory.makeRoom( 2 );
		Door door = factory.makeDoor( r1, r2 );

		maze.addRoom( r1 );
		maze.addRoom( r2 );

		r1.setSide( Direction.NORTH, factory.makeWall() );
		r1.setSide( Direction.EAST, door );
		r1.setSide( Direction.SOUTH, factory.makeWall() );
		r1.setSide( Direction.WEST, factory.makeWall() );

		r2.setSide( Direction.NORTH, factory.makeWall() );
		r2.setSide( Direction.EAST, factory.makeWall() );
		r2.setSide( Direction.SOUTH, factory.makeWall() );
		r2.setSide( Direction.WEST, door );

		return maze;
	}
}
