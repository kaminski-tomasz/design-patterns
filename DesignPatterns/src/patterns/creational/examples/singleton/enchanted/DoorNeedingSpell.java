package patterns.creational.examples.singleton.enchanted;

import patterns.creational.examples.Door;
import patterns.creational.examples.Room;

public class DoorNeedingSpell extends Door
{
	public DoorNeedingSpell( Room r1, Room r2 )
	{
		super( r1, r2 );
	}

	@Override
	public void enter()
	{
		System.out.print( "DoorNeedingSpell: " );
		super.enter();
	}
}
