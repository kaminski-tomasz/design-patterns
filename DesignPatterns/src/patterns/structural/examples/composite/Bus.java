package patterns.structural.examples.composite;

public class Bus extends CompositeEquipment
{
	private static final int BUS_POWER = 20;
	private static final float BUS_NETPRICE = 55;
	private static final float BUS_DISCOUNTPRICE = 29.99f;

	protected Bus( String name )
	{
		super( name );
	}

	@Override
	public int power()
	{
		return super.power() + BUS_POWER;
	}

	@Override
	public float netPrice()
	{
		System.out.println( "Adding net price of Bus: " + BUS_NETPRICE );
		return super.netPrice() + BUS_NETPRICE;
	}

	@Override
	public float discountPrice()
	{
		return super.discountPrice() + BUS_DISCOUNTPRICE;
	}
}
