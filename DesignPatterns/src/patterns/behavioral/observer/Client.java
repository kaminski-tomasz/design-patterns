package patterns.behavioral.observer;

/**
 * Testing the Observer Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	@SuppressWarnings( "unused" )
	public static void main( String[] args )
	{
		ConcreteSubject concreteSubject = new ConcreteSubject( "state1" );

		Observer observer1 = new ConcreteObserver( concreteSubject, "observer1" );
		Observer observer2 = new ConcreteObserver( concreteSubject, "observer2" );

		concreteSubject.setState( "state2" );
		concreteSubject.setState( "state3" );
	}
}
