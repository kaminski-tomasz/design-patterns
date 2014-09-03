package patterns.creational.examples.singleton;

import patterns.creational.examples.Door;
import patterns.creational.examples.Maze;
import patterns.creational.examples.Room;
import patterns.creational.examples.Wall;
import patterns.creational.examples.singleton.bombed.BombedMazeFactory;
import patterns.creational.examples.singleton.enchanted.EnchantedMazeFactory;

public class MazeFactory
{
	private static final String MAZESTYLE = "MAZESTYLE";
	private static MazeFactory instance = null;

	protected MazeFactory()
	{
	};

	public static MazeFactory getInstance()
	{
		if( instance == null )
		{
			String mazeStyle = System.getenv( MAZESTYLE );
			if (mazeStyle == null) {
				instance = new MazeFactory();
			}
			else if( mazeStyle.toLowerCase().equals( "bombed" ) )
			{
				instance = new BombedMazeFactory();
			}
			else if( mazeStyle.toLowerCase().equals( "enchanted" ) )
			{
				instance = new EnchantedMazeFactory();
			}
			else {
				instance = new MazeFactory();
			}
		}
		return instance;
	}

	public Maze makeMaze()
	{
		return new Maze();
	}

	public Wall makeWall()
	{
		return new Wall();
	}

	public Room makeRoom( int num )
	{
		return new Room( num );
	}

	public Door makeDoor( Room r1, Room r2 )
	{
		return new Door( r1, r2 );
	}
}
