package patterns.creational.examples.prototype;

import patterns.creational.examples.MapSite;

public class Door implements MapSite, Cloneable
{
	private Room room1;
	private Room room2;
	private boolean open;

	public Door()
	{
	}

	public Door( Room room1, Room room2 )
	{
		initialize( room1, room2 );
	}

	public Door( Door other )
	{
		room1 = other.room1;
		room2 = other.room2;
	}

	public void initialize( Room room1, Room room2 )
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
	
	/**
	 * Clone operation
	 */
	@Override
	protected Door clone()
	{
		try
		{
			return ( Door )super.clone();
		} catch( CloneNotSupportedException e )
		{
			return new Door(this);
		}
	}
}
