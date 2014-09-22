package patterns.behavioral.examples.visitor;

public class FloppyDisk extends Equipment
{
	private static final int FLOPPYDISK_POWER = 50;
	private static final int FLOPPYDISK_NETPRICE = 100;
	private static final int FLOPPYDISK_DISCOUNTPRICE = 70;

	public FloppyDisk( String name )
	{
		super( name );
	}

	@Override
	public int power()
	{
		return FLOPPYDISK_POWER;
	}

	@Override
	public float netPrice()
	{
		return FLOPPYDISK_NETPRICE;
	}

	@Override
	public float discountPrice()
	{
		return FLOPPYDISK_DISCOUNTPRICE;
	}

	@Override
	public void accept( EquipmentVisitor visitor )
	{
		visitor.visitFloppyDisk( this );
	}
}
