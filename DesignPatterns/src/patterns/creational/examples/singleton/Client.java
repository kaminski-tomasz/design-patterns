package patterns.creational.examples.singleton;

import patterns.creational.examples.Maze;

public class Client
{
	public static void main( String[] args )
	{
		MazeGame mazeGame = new MazeGame();

		/*
		 * Using singleton factory
		 */
		Maze maze = mazeGame.createMaze( MazeFactory.getInstance() );
		maze.enterTheRoom( 1 );
	}
}
