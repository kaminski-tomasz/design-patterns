package patterns.creational.examples.prototype;

import patterns.creational.examples.Direction;
import patterns.creational.examples.MapSite;

public class Room implements MapSite, Cloneable
{
	private MapSite[] sides = new MapSite[4];;
	private int roomNumber;

	public Room()
	{
	}

	public Room( int roomNo )
	{
		initialize( roomNo );
	}

	public void initialize( int roomNo )
	{
		this.setRoomNumber( roomNo );
	}

	public MapSite getSide( Direction direction )
	{
		return sides[direction.ordinal()];
	}

	public void setSide( Direction direction, MapSite site )
	{
		sides[direction.ordinal()] = site;
	}

	@Override
	public void enter()
	{
		System.out.println( "Entering the room " + getRoomNumber() );
		for( MapSite side : sides )
		{
			side.enter();
		}
	}

	public int getRoomNumber()
	{
		return roomNumber;
	}

	private void setRoomNumber( int roomNumber )
	{
		this.roomNumber = roomNumber;
	}

	/**
	 * Clone operation
	 */
	@Override
	protected Room clone()
	{
		try
		{
			Room cloned = ( Room )super.clone();
			cloned.sides = this.sides.clone();
			return cloned;
		} catch( CloneNotSupportedException e )
		{
			return new Room( this.roomNumber );
		}
	}
}
