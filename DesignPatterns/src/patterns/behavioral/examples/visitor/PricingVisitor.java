package patterns.behavioral.examples.visitor;

public class PricingVisitor extends EquipmentVisitor
{
	private float total;

	public PricingVisitor()
	{
		total = 0.0f;
	}

	public float getTotalPrice()
	{
		return total;
	}

	@Override
	public void visitFloppyDisk( FloppyDisk floppyDisk )
	{
		total += floppyDisk.netPrice();
	}

	@Override
	public void visitChassis( Chassis chassis )
	{
		total += chassis.discountPrice();
	}

	@Override
	public void visitBus( Bus bus )
	{
		total += bus.discountPrice();
	}

	@Override
	public void visitCabinet( Cabinet cabinet )
	{
		total += cabinet.discountPrice();
	}

	@Override
	public void visitCard( Card card )
	{
		total += card.netPrice();
	}
}
