package patterns.creational.examples.factorymethod.enchanted;

import patterns.creational.examples.Door;
import patterns.creational.examples.Room;

public class DoorNeedingSpell extends Door
{
	public DoorNeedingSpell( Room r1, Room r2 )
	{
		super( r1, r2 );
	}
}
