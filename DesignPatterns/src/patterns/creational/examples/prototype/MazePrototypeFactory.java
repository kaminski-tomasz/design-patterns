package patterns.creational.examples.prototype;

public class MazePrototypeFactory extends MazeFactory
{
	private Maze mazePrototype;
	private Wall wallPrototype;
	private Room roomPrototype;
	private Door doorPrototype;

	public MazePrototypeFactory( Maze mazePrototype, Wall wallPrototype, Room roomPrototype, Door doorPrototype )
	{
		this.mazePrototype = mazePrototype;
		this.wallPrototype = wallPrototype;
		this.roomPrototype = roomPrototype;
		this.doorPrototype = doorPrototype;
	}

	@Override
	public Maze makeMaze()
	{
		return mazePrototype.clone();
	}

	@Override
	public Wall makeWall()
	{
		return wallPrototype.clone();
	}

	@Override
	public Room makeRoom( int num )
	{
		Room newRoom = roomPrototype.clone();
		newRoom.initialize( num );
		return newRoom;
	}

	@Override
	public Door makeDoor( Room r1, Room r2 )
	{
		Door door = doorPrototype.clone();
		door.initialize( r1, r2 );
		return door;
	}
}
