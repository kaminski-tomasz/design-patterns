package patterns.structural.composite.parent;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite of components with parent references
 * 
 * @author Tomek
 *
 */
public class Composite extends AbstractComponent
{
	private List< Component > componentList = new ArrayList< Component >();

	@Override
	public void operation()
	{
		for( Component component : componentList )
		{
			component.operation();
		}
	}

	@Override
	public boolean add( Component component )
	{
		if( component instanceof AbstractComponent )
		{
			( ( AbstractComponent )component ).setParent( this );
		}
		return componentList.add( component );
	}

	@Override
	public boolean remove( Component component )
	{
		if( component instanceof AbstractComponent )
		{
			( ( AbstractComponent )component ).setParent( null );
		}
		return componentList.remove( component );
	}

	@Override
	public Component getChild( int i )
	{
		return componentList.get( i );
	}
}
