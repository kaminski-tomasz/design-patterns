package patterns.behavioral.visitor;

/**
 * Testing the Visitor Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		Element concreteElementA = new ConcreteElementA();
		Element concreteElementB = new ConcreteElementB();

		Visitor visitor1 = new ConcreteVisitor1();
		concreteElementA.accept( visitor1 );
		concreteElementB.accept( visitor1 );

		Visitor visitor2 = new ConcreteVisitor2();
		concreteElementA.accept( visitor2 );
		concreteElementB.accept( visitor2 );
	}
}
