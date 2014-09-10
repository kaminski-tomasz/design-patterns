package patterns.structural.composite.parent;

/**
 * Abstract implementation of the component
 * 
 * @author Tomek
 *
 */
public abstract class AbstractComponent implements Component
{
	private Component parent;

	@Override
	public Component getParent()
	{
		return parent;
	}

	@Override
	public boolean add( Component component )
	{
		return false;
	}

	@Override
	public boolean remove( Component component )
	{
		return false;
	}

	@Override
	public Component getChild( int i )
	{
		return null;
	}

	protected void setParent( Component parent )
	{
		this.parent = parent;
	}
}
