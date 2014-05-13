package patterns.creational.examples;

import java.util.ArrayList;
import java.util.List;

public class Maze
{
	private List< Room > roomList = new ArrayList< Room >( );

	public void addRoom( Room room )
	{
		roomList.add( room );
	}

	public void enterTheRoom( int roomNumber )
	{
		Room room = roomNo( roomNumber );
		if( room != null )
		{
			room.enter( );
		}
	}

	public Room roomNo( int roomNumber )
	{
		for( Room room : roomList )
		{
			if( room.getRoomNumber( ) == roomNumber )
			{
				return room;
			}
		}
		return null;
	}
}
