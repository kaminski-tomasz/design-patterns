package patterns.structural.adapter.classadapter;

import patterns.structural.adapter.Adaptee;
import patterns.structural.adapter.Target;

/**
 * Example of class adapter
 * 
 * @author Tomek
 *
 */
public class Adapter extends Adaptee implements Target
{
	@Override
	public void request()
	{
		super.specificRequest();
	}
}
