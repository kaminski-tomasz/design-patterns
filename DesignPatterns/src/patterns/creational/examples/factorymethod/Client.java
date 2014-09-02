package patterns.creational.examples.factorymethod;

import patterns.creational.examples.Maze;
import patterns.creational.examples.factorymethod.bombed.BombedMazeGame;
import patterns.creational.examples.factorymethod.enchanted.EnchantedMazeGame;

public class Client
{
	public static void main( String[] args )
	{
		MazeGame mazeGame = new MazeGame();

		/*
		 * Using standard MazeGame
		 */
		Maze maze = mazeGame.createMaze();
		maze.enterTheRoom( 1 );
		
		/*
		 * Using BombedMazeGame 
		 */
		mazeGame = new BombedMazeGame();
		maze = mazeGame.createMaze();
		maze.enterTheRoom( 1 );
		
		/*
		 * Using EnchantedMazeGame 
		 */
		mazeGame = new EnchantedMazeGame();
		maze = mazeGame.createMaze();
		maze.enterTheRoom( 1 );	
	}
}
