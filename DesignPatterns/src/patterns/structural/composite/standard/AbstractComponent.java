package patterns.structural.composite.standard;

import javax.naming.OperationNotSupportedException;

/**
 * Abstract component with default implementation of common methods
 * 
 * @author Tomek
 *
 */
public abstract class AbstractComponent implements Component
{
	@Override
	public boolean add( Component component ) 
			throws OperationNotSupportedException
	{
		throw new OperationNotSupportedException();
	}

	@Override
	public boolean remove( Component component ) 
			throws OperationNotSupportedException
	{
		throw new OperationNotSupportedException();
	}

	@Override
	public Component getChild( int i ) 
			throws OperationNotSupportedException
	{
		throw new OperationNotSupportedException();
	}
}
