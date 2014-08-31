package patterns.creational.examples;

public class Door implements MapSite
{
	private Room room1;
	private Room room2;
	private boolean open;

	public Door()
	{
	}

	public Door( Room room1, Room room2 )
	{
		this.room1 = room1;
		this.room2 = room2;
	}

	public Room otherSideFrom( Room room )
	{
		if( room != null )
		{
			if( room.equals( room1 ) )
			{
				return room2;
			}
			if( room.equals( room2 ) )
			{
				return room1;
			}
		}
		return null;
	}

	@Override
	public void enter()
	{
		System.out.println( "The door is encountered" );
	}

	public boolean isOpen()
	{
		return open;
	}

	public void setOpen( boolean open )
	{
		this.open = open;
	}
}
