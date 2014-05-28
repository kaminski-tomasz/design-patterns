package patterns.creational.examples.builder;

import patterns.creational.examples.Direction;
import patterns.creational.examples.Door;
import patterns.creational.examples.Maze;
import patterns.creational.examples.Room;
import patterns.creational.examples.Wall;

public class StandardMazeBuilder extends MazeBuilder
{
	private Maze currentMaze = null;

	@Override
	public void buildMaze()
	{
		currentMaze = new Maze();
	}

	@Override
	public Maze getMaze()
	{
		return currentMaze;
	}

	@Override
	public void buildRoom( int n )
	{
		if( currentMaze != null && currentMaze.roomNo( n ) != null )
		{
			Room room = new Room( n );
			currentMaze.addRoom( room );

			room.setSide( Direction.NORTH, new Wall() );
			room.setSide( Direction.SOUTH, new Wall() );
			room.setSide( Direction.EAST, new Wall() );
			room.setSide( Direction.WEST, new Wall() );
		}
	}

	@Override
	public void buildDoor( int roomFrom, int roomTo )
	{
		Room r1 = currentMaze.roomNo( roomFrom );
		Room r2 = currentMaze.roomNo( roomTo );
		Door d = new Door( r1, r2 );

		r1.setSide( commonWall( r1, r2 ), d );
		r2.setSide( commonWall( r2, r1 ), d );
	}

	private Direction commonWall( Room r1, Room r2 )
	{
		if( r2.getRoomNumber() == r1.getRoomNumber() + 1 )
		{
			return Direction.EAST;
		}
		if( r1.getRoomNumber() == r2.getRoomNumber() + 1 )
		{
			return Direction.WEST;
		}
		if( r2.getRoomNumber() > r1.getRoomNumber() )
		{
			return Direction.SOUTH;
		}
		if( r1.getRoomNumber() > r2.getRoomNumber() )
		{
			return Direction.NORTH;
		}
		return null;
	}

}
