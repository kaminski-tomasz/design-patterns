package patterns.creational.examples;

public class MazeGame
{
	public Maze createMaze()
	{
		Maze maze = new Maze( );
		Room r1 = new Room( 0 );
		Room r2 = new Room( 1 );
		Door door = new Door( r1, r2 );
		
		maze.addRoom( r1 );
		maze.addRoom( r2 );
		
		r1.setSide( Direction.NORTH, new Wall( ) );
		r1.setSide( Direction.EAST, door );
		r1.setSide( Direction.SOUTH, new Wall( ) );
		r1.setSide( Direction.WEST, new Wall( ) );
		
		r2.setSide( Direction.NORTH, new Wall( ) );
		r2.setSide( Direction.EAST, new Wall( ) );
		r2.setSide( Direction.SOUTH, new Wall( ) );
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
