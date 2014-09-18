package patterns.behavioral.observer;

import patterns.behavioral.observer.Subject;

/**
 * Implementation of concrete Subject
 * 
 * @author Tomek
 *
 */
public class ConcreteSubject extends Subject
{
	private String state;

	public ConcreteSubject( String state )
	{
		this.state = state;
	}

	public void setState( String newState )
	{
		this.state = newState;
		notifyObservers();
	}

	public String getState()
	{
		return state;
	}
}
