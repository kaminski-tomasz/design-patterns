package patterns.creational.examples.factorymethod.bombed;

import patterns.creational.examples.Room;
import patterns.creational.examples.Wall;
import patterns.creational.examples.factorymethod.MazeGame;

public class BombedMazeGame extends MazeGame
{
	@Override
	public Wall makeWall()
	{
		return new BombedWall();
	}

	@Override
	public Room makeRoom( int roomNo )
	{
		return new RoomWithABomb( roomNo );
	}
}
