package patterns.structural.adapter.objectadapter;

import patterns.structural.adapter.Adaptee;
import patterns.structural.adapter.Target;

/**
 * Testing Object Adapter pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		/*
		 * Work with Adaptee object
		 */
		Adaptee adaptee = new Adaptee();
		adaptee.specificRequest();

		/*
		 * Initialize adapter
		 */
		Adapter adapter = new Adapter( adaptee );

		/*
		 * Use adapter as it was Target class object
		 */
		Target target = adapter;
		target.request();
	}
}
