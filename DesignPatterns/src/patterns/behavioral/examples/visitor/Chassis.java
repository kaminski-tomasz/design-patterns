package patterns.behavioral.examples.visitor;

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
		return CHASSIS_POWER;
	}

	@Override
	public float netPrice()
	{
		return CHASSIS_NETPRICE;
	}

	@Override
	public float discountPrice()
	{
		return CHASSIS_DISCOUNTPRICE;
	}

	@Override
	public void acceptComposite( EquipmentVisitor visitor )
	{
		visitor.visitChassis( this );
	}
}
