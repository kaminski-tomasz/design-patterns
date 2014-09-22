package patterns.behavioral.examples.visitor;

public class Client
{
	public static void main( String[] args )
	{
		Cabinet cabinet = new Cabinet( "Cabinet for PC" );
		Chassis chassis = new Chassis( "Chassis for PC" );

		cabinet.add( chassis );
		Bus bus = new Bus( "Bus MCA" );
		bus.add( new Card( "Token Ring Card 16Mbps" ) );
		bus.add( new Card( "Token Ring Card 16Mbps" ) );
		bus.add( new Card( "Token Ring Card 16Mbps" ) );

		chassis.add( bus );
		chassis.add( new FloppyDisk( "Floppy Disk Drive 3,5\"" ) );
		chassis.add( new FloppyDisk( "Floppy Disk Drive 3,5\"" ) );

		PricingVisitor pricingVisitor = new PricingVisitor();
		cabinet.accept( pricingVisitor );
		System.out.println( "Total price: " + pricingVisitor.getTotalPrice() );

		InventoryVisitor inventoryVisitor = new InventoryVisitor();
		cabinet.accept( inventoryVisitor );

		System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
		System.out.println( "Inventory of " + cabinet.getName() );
		System.out.println( "---------------------------------" );
		System.out.println( inventoryVisitor.getInventory() );
	}
}
