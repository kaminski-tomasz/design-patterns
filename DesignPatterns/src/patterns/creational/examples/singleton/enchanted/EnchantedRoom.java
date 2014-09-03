package patterns.creational.examples.singleton.enchanted;

import patterns.creational.examples.Room;

public class EnchantedRoom extends Room
{
	public EnchantedRoom( int roomNo, Spell spell )
	{
		super( roomNo );
	}
	
	@Override
	public void enter()
	{
		System.out.print("EnchantedRoom: ");
		super.enter();
	}
}
