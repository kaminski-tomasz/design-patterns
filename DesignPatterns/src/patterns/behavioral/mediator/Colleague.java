package patterns.behavioral.mediator;

/**
 * Abstract class of cooperative classes of objects
 * 
 * @author Tomek
 *
 */
public abstract class Colleague
{
	private Mediator mediator;

	public Colleague( Mediator mediator )
	{
		this.mediator = mediator;
	}

	/**
	 * Method which notifies mediator about operation
	 */
	protected void notifyMediator()
	{
		mediator.handleOperation( this );
	}

	/**
	 * Operation performed by the object
	 */
	public abstract void operation();
}
