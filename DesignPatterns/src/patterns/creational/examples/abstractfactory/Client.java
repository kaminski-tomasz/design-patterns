package patterns.creational.examples.abstractfactory;

import patterns.creational.examples.Maze;
import patterns.creational.examples.abstractfactory.bombed.BombedMazeFactory;
import patterns.creational.examples.abstractfactory.enchanted.EnchantedMazeFactory;

public class Client
{
	public static void main( String[] args )
	{
		MazeGame mazeGame = new MazeGame();

		/*
		 * Using default factory
		 */
		MazeFactory factory = new MazeFactory();
		Maze maze = mazeGame.createMaze( factory );
		maze.enterTheRoom( 1 );
		
		/*
		 * Using enchanted factory
		 */
		factory = new EnchantedMazeFactory();
		maze = mazeGame.createMaze( factory );
		maze.enterTheRoom( 1 );

		/*
		 * Using bombed maze factory
		 */
		factory = new BombedMazeFactory();
		maze = mazeGame.createMaze( factory );
		maze.enterTheRoom( 1 );
	}
}
