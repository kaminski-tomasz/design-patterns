package patterns.behavioral.observer;

/**
 * Implementation of concrete Observer
 * 
 * @author Tomek
 *
 */
public class ConcreteObserver implements Observer
{
	private ConcreteSubject subject;
	private String name;
	private String state;

	public ConcreteObserver( ConcreteSubject subject, String name )
	{
		this.subject = subject;
		this.name = name;
		this.subject.attach( this );
		this.state = subject.getState();
	}

	@Override
	public void update()
	{
		this.state = subject.getState();
		System.out.println( "ConcreteObserver[" + getName() + "].update(): state = " + state );
	}

	public String getName()
	{
		return name;
	}
}
