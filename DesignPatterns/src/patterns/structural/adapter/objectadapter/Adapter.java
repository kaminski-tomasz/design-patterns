package patterns.structural.adapter.objectadapter;

import patterns.structural.adapter.Adaptee;
import patterns.structural.adapter.Target;

/**
 * Example of object adapter
 * 
 * @author Tomek
 *
 */
public class Adapter implements Target
{
	private Adaptee adaptee;

	public Adapter( Adaptee adaptee )
	{
		this.adaptee = adaptee;
	}

	@Override
	public void request()
	{
		adaptee.specificRequest();
	}
}
