package patterns.creational.factorymethod;

/**
 * Testing Factory Method pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Creator creator = new ConreteCreator();
		creator.anOperation();
	}
}
