package patterns.behavioral.examples.command;

import java.util.ArrayList;
import java.util.List;

public class Menu
{
	private List< MenuItem > menuItems = new ArrayList< MenuItem >();

	public void addMenuItem( MenuItem menuItem )
	{
		menuItems.add( menuItem );
	}
}
