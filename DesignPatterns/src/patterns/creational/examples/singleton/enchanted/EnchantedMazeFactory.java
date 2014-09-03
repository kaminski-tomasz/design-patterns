package patterns.creational.examples.singleton.enchanted;

import patterns.creational.examples.Door;
import patterns.creational.examples.Room;
import patterns.creational.examples.singleton.MazeFactory;

public class EnchantedMazeFactory extends MazeFactory
{
	@Override
	public Room makeRoom( int num )
	{
		return new EnchantedRoom( num, castSpell() );
	}

	@Override
	public Door makeDoor( Room r1, Room r2 )
	{
		return new DoorNeedingSpell( r1, r2 );
	}

	protected Spell castSpell()
	{
		return new Spell();
	}
}
