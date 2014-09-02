package patterns.creational.examples.builder;

import patterns.creational.examples.Maze;

public class MazeGame
{
	public Maze createMaze( MazeBuilder builder )
	{
		builder.buildMaze();

		builder.buildRoom( 1 );
		builder.buildRoom( 2 );
		builder.buildDoor( 1, 2 );

		return builder.getMaze();
	}

	public Maze createComplexMaze( MazeBuilder builder )
	{
		builder.buildMaze();

		for( int i = 1; i <= 1000; i++ )
		{
			builder.buildRoom( i );
		}

		return builder.getMaze();
	}
}
