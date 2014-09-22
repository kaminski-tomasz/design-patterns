package patterns.behavioral.examples.visitor;

public class InventoryVisitor extends EquipmentVisitor
{
	private Inventory inventory;

	public InventoryVisitor()
	{
		this.inventory = new Inventory();
	}
	
	public Inventory getInventory()
	{
		return inventory;
	}
	
	@Override
	public void visitBus( Bus bus )
	{
		inventory.accumulate( bus );
	}
	
	@Override
	public void visitCabinet( Cabinet cabinet )
	{
		inventory.accumulate( cabinet );
	}
	
	@Override
	public void visitCard( Card card )
	{
		inventory.accumulate( card );
	}
	
	@Override
	public void visitChassis( Chassis chassis )
	{
		inventory.accumulate( chassis );
	}
	
	@Override
	public void visitFloppyDisk( FloppyDisk floppyDisk )
	{
		inventory.accumulate( floppyDisk );
	}
}
