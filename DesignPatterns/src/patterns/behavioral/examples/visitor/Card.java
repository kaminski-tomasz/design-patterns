package patterns.behavioral.examples.visitor;

public class Card extends Equipment
{
	private static final int CARD_POWER = 35;
	private static final float CARD_NETPRICE = 303;
	private static final float CARD_DISCOUNTPRICE = 129.99f;

	public Card( String name )
	{
		super( name );
	}

	@Override
	public int power()
	{
		return CARD_POWER;
	}

	@Override
	public float netPrice()
	{
		return CARD_NETPRICE;
	}

	@Override
	public float discountPrice()
	{
		return CARD_DISCOUNTPRICE;
	}
	
	@Override
	public void accept( EquipmentVisitor visitor )
	{
		visitor.visitCard( this );
	}
}
