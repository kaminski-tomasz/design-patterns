package patterns.structural.examples.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeEquipment extends Equipment
{
	private List< Equipment > equipmentList;

	protected CompositeEquipment( String name )
	{
		super( name );
		equipmentList = new ArrayList< Equipment >();
	}

	@Override
	public int power()
	{
		int power = 0;
		for( Equipment equipment : this )
		{
			power += equipment.power();
		}
		return power;
	}

	@Override
	public float netPrice()
	{
		float netPrice = 0.0f;
		for( Equipment equipment : this )
		{
			netPrice += equipment.netPrice();
		}
		return netPrice;
	}

	@Override
	public float discountPrice()
	{
		float discountPrice = 0.0f;
		for( Equipment equipment : this )
		{
			discountPrice += equipment.discountPrice();
		}
		return discountPrice;
	}

	@Override
	public void add( Equipment equipment )
	{
		equipmentList.add( equipment );
	}

	@Override
	public void remove( Equipment equipment )
	{
		equipmentList.remove( equipment );
	}

	@Override
	public Iterator< Equipment > iterator()
	{
		return equipmentList.iterator();
	}
}
