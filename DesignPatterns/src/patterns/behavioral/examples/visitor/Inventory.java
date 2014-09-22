package patterns.behavioral.examples.visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Inventory
{
	private Map< Class< ? extends Equipment >, Float > inventoryPrice = 
			new HashMap< Class< ? extends Equipment >, Float >();

	public void accumulate( Equipment equipment )
	{
		float currentPrice = 0.0f;
		if( inventoryPrice.containsKey( equipment.getClass() ) )
		{
			currentPrice += inventoryPrice.get( equipment.getClass() );
		}
		currentPrice += equipment.netPrice();
		inventoryPrice.put( equipment.getClass(), currentPrice );
	}

	@Override
	public String toString()
	{
		StringBuilder retVal = new StringBuilder();
		for( Entry< Class< ? extends Equipment >, Float > entry : inventoryPrice.entrySet() )
		{
			retVal.append( "\t" + entry.getKey().getSimpleName() );
			retVal.append( " total price: " );
			retVal.append( entry.getValue() );
			retVal.append( "\n" );
		}
		return retVal.toString();
	}
}
