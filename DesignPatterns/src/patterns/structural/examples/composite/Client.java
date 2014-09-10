package patterns.structural.examples.composite;

public class Client
{
	public static void main( String[] args )
	{
		Cabinet cabinet = new Cabinet( "Cabinet for PC" );
		Chassis chassis = new Chassis( "Chassis for PC" );

		cabinet.add( chassis );
		Bus bus = new Bus( "Bus MCA" );
		bus.add( new Card( "Token Ring Card 16Mbps" ) );

		chassis.add( bus );
		chassis.add( new FloppyDisk( "Floppy Disk Drive 3,5\"" ) );

		System.out.println( "Total net price: " + cabinet.netPrice() );
	}
}
