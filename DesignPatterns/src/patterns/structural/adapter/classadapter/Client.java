package patterns.structural.adapter.classadapter;

import patterns.structural.adapter.Adaptee;
import patterns.structural.adapter.Target;

/**
 * Testing Class Adapter pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Adapter adapter = new Adapter();
		/*
		 * Work with adapter as it was adapted object
		 */
		Adaptee adaptee = adapter;
		adaptee.specificRequest();

		/*
		 * Use adapter as a Target class object
		 */
		Target target = adapter;
		target.request();
	}
}
