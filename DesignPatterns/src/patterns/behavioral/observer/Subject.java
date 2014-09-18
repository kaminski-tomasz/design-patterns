package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract subject class. It manages a list of observers which observe the
 * subject
 * 
 * @author Tomek
 *
 */
public abstract class Subject
{
	List< Observer > observers = new ArrayList< Observer >();

	public void attach( Observer observer )
	{
		observers.add( observer );
	}

	public void detach( Observer observer )
	{
		observers.remove( observer );
	}

	public void notifyObservers()
	{
		for( Observer observer : observers )
		{
			observer.update();
		}
	}
}
