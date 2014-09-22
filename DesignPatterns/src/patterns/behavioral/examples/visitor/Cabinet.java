package patterns.behavioral.examples.visitor;

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
		return CABINET_POWER;
	}

	@Override
	public float netPrice()
	{
		return CABINET_NETPRICE;
	}

	@Override
	public float discountPrice()
	{
		return CABINET_DISCOUNTPRICE;
	}

	@Override
	public void acceptComposite( EquipmentVisitor visitor )
	{
		visitor.visitCabinet( this );
	}
}
