package patterns.behavioral.mediator;

/**
 * Mediator interface
 * 
 * @author Tomek
 *
 */
public interface Mediator
{
	/**
	 * Operation performed by colleague object in order to make interaction
	 * with other colleagues
	 * 
	 * @param colleague
	 */
	public void handleOperation( Colleague colleague );
}
