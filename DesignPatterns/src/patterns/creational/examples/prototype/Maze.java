package patterns.creational.examples.prototype;

import java.util.ArrayList;
import java.util.List;

public class Maze implements Cloneable
{
	private List< Room > roomList = new ArrayList< Room >();

	public void addRoom( Room room )
	{
		roomList.add( room );
	}

	public void enterTheRoom( int roomNumber )
	{
		Room room = roomNo( roomNumber );
		if( room != null )
		{
			room.enter();
		}
	}

	public Room roomNo( int roomNumber )
	{
		for( Room room : roomList )
		{
			if( room.getRoomNumber() == roomNumber )
			{
				return room;
			}
		}
		return null;
	}

	/**
	 * Clone operation
	 */
	@SuppressWarnings( "unchecked" )
	@Override
	protected Maze clone()
	{
		Maze cloned;
		try
		{
			cloned = ( Maze )super.clone();
		} catch( CloneNotSupportedException e )
		{
			cloned = new Maze();
		}
		cloned.roomList = ( List< Room > ) ( ( ( ArrayList< Room > )roomList ).clone() );
		return cloned;
	}
}
