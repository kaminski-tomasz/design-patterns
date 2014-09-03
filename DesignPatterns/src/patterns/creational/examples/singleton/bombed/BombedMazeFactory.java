package patterns.creational.examples.singleton.bombed;

import patterns.creational.examples.Room;
import patterns.creational.examples.Wall;
import patterns.creational.examples.singleton.MazeFactory;

public class BombedMazeFactory extends MazeFactory
{
	@Override
	public Wall makeWall()
	{
		return new BombedWall();
	}

	@Override
	public Room makeRoom( int num )
	{
		return new RoomWithABomb( num );
	}
}
