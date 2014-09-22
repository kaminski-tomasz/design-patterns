package patterns.behavioral.examples.visitor;

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
		return BUS_POWER;
	}

	@Override
	public float netPrice()
	{
		return BUS_NETPRICE;
	}

	@Override
	public float discountPrice()
	{
		return BUS_DISCOUNTPRICE;
	}
	
	@Override
	public void acceptComposite( EquipmentVisitor visitor )
	{
		visitor.visitBus( this );
	}
}
