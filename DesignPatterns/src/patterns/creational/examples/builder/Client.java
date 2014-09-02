package patterns.creational.examples.builder;

import patterns.creational.examples.Maze;

public class Client
{
	public static void main( String[] args )
	{
		MazeGame mazeGame = new MazeGame();

		/*
		 * Standard builder 
		 */
		StandardMazeBuilder mazeBuilder = new StandardMazeBuilder();
		mazeGame.createMaze( mazeBuilder );
		Maze maze = mazeBuilder.getMaze();
		maze.enterTheRoom( 1 );

		/*
		 * Counting builder
		 */
		CountingMazeBuilder countingBuilder = new CountingMazeBuilder();
		mazeGame.createMaze( countingBuilder );
		System.out.println( "Number of rooms: " + countingBuilder.getRooms()
				+ ", number of doors: " + countingBuilder.getDoors() );
	}
}
