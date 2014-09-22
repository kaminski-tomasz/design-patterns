package patterns.behavioral.memento;

/**
 * Testing the Memento Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Caretaker caretaker = new Caretaker();

		Originator originator = new Originator();
		System.out.println( originator );
		caretaker.save( originator );

		originator.changeState();
		System.out.println( originator );

		caretaker.restore( originator );
		System.out.println( originator );
	}
}
