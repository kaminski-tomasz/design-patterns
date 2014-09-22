package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that takes care of Mementos of the Originator
 * 
 * @author Tomek
 *
 */
public class Caretaker
{
	private List< Originator.Memento > memento;

	public Caretaker()
	{
		memento = new ArrayList< Originator.Memento >();
	}

	public void save( Originator originator )
	{
		memento.add( originator.createMemento() );
	}

	public void restore( Originator originator )
	{
		if( memento.size() > 0 )
		{
			originator.setMemento( memento.get( memento.size() - 1 ) );
		}
	}
}
