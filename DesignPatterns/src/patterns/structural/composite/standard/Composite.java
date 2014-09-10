package patterns.structural.composite.standard;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class implementation
 * 
 * @author Tomek
 *
 */
public class Composite extends AbstractComponent
{
	List< Component > list = new ArrayList< Component >();

	@Override
	public void operation()
	{
		for( Component component : list )
		{
			component.operation();
		}
	}

	@Override
	public boolean add( Component component )
	{
		return list.add( component );
	}

	@Override
	public boolean remove( Component component )
	{
		return list.remove( component );
	}

	@Override
	public Component getChild( int i )
	{
		return list.get( i );
	}
}
