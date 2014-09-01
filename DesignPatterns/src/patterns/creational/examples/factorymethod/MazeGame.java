package patterns.creational.examples.factorymethod;

import patterns.creational.examples.Direction;
import patterns.creational.examples.Door;
import patterns.creational.examples.Maze;
import patterns.creational.examples.Room;
import patterns.creational.examples.Wall;

public class MazeGame
{
	
	/*
	 * Factory methods
	 */
	public Maze makeMaze()
	{
		return new Maze();
	}

	public Room makeRoom( int n )
	{
		return new Room( n );
	}

	public Wall makeWall()
	{
		return new Wall();
	}

	public Door makeDoor( Room room1, Room room2 )
	{
		return new Door( room1, room2 );
	}
	
	/*
	 * Creating maze
	 */
	public Maze createMaze()
	{
		Maze maze = makeMaze();
		Room r1 = makeRoom( 1 );
		Room r2 = makeRoom( 2 );
		Door door = makeDoor( r1, r2 );
		
		maze.addRoom( r1 );
		maze.addRoom( r2 );
		
		r1.setSide( Direction.NORTH, makeWall( ) );
		r1.setSide( Direction.EAST, door );
		r1.setSide( Direction.SOUTH, makeWall( ) );
		r1.setSide( Direction.WEST, makeWall( ) );
		
		r2.setSide( Direction.NORTH, makeWall( ) );
		r2.setSide( Direction.EAST, makeWall( ) );
		r2.setSide( Direction.SOUTH, makeWall( ) );
		r2.setSide( Direction.WEST, door );
		
		return maze;
	}
	
	public static void main( String[] args )
	{
		MazeGame mazeGame = new MazeGame( );
		
		Maze maze = mazeGame.createMaze( );
		
		maze.enterTheRoom( 0 );
	}
}
