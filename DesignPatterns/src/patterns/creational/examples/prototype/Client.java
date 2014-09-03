package patterns.creational.examples.prototype;

import patterns.creational.examples.prototype.Maze;

public class Client
{
	public static void main( String[] args )
	{
		MazeGame mazeGame = new MazeGame();

		/*
		 * Using prototype factory with default prototype
		 */
		MazeFactory factory = new MazePrototypeFactory( new Maze(), new Wall(), new Room(), new Door() );
		Maze maze = mazeGame.createMaze( factory );
		maze.enterTheRoom( 1 );

		/*
		 * Using prototype factory with bombed wall
		 */
		factory = new MazePrototypeFactory( new Maze(), new BombedWall(), new Room(), new Door() );
		maze = mazeGame.createMaze( factory );
		maze.enterTheRoom( 1 );
	}
}
