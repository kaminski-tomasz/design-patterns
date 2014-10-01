package patterns.behavioral.state;

/**
 * State interface for different behaviors of Context
 * 
 * @author Tomek
 *
 */
public interface State
{
	/**
	 * Method called by the Context
	 */
	public void handle();
}
