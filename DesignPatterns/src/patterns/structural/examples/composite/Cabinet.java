package patterns.structural.examples.composite;

public class Cabinet extends CompositeEquipment
{
	private static final int CABINET_POWER = 15;
	private static final float CABINET_NETPRICE = 15;
	private static final float CABINET_DISCOUNTPRICE = 12;

	public Cabinet( String name )
	{
		super( name );
	}

	@Override
	public int power()
	{
		return super.power() + CABINET_POWER;
	}

	@Override
	public float netPrice()
	{
		System.out.println( "Adding net price of Cabinet: " + CABINET_NETPRICE );
		return super.netPrice() + CABINET_NETPRICE;
	}

	@Override
	public float discountPrice()
	{
		return super.discountPrice() + CABINET_DISCOUNTPRICE;
	}
}
