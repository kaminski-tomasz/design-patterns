package patterns.structural.examples.composite;

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
		System.out.println( "Adding net price of Floppy Disk: " + FLOPPYDISK_NETPRICE );
		return FLOPPYDISK_NETPRICE;
	}

	@Override
	public float discountPrice()
	{
		return FLOPPYDISK_DISCOUNTPRICE;
	}
}
