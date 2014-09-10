package patterns.structural.examples.composite;

public class Chassis extends CompositeEquipment
{
	private static final int CHASSIS_POWER = 5;
	private static final float CHASSIS_NETPRICE = 30;
	private static final float CHASSIS_DISCOUNTPRICE = 20;

	protected Chassis( String name )
	{
		super( name );
	}

	@Override
	public int power()
	{
		return super.power() + CHASSIS_POWER;
	}

	@Override
	public float netPrice()
	{
		System.out.println( "Adding net price of Chassis: " + CHASSIS_NETPRICE );
		return super.netPrice() + CHASSIS_NETPRICE;
	}

	@Override
	public float discountPrice()
	{
		return super.discountPrice() + CHASSIS_DISCOUNTPRICE;
	}
}
