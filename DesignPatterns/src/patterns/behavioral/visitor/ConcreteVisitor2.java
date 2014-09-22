package patterns.behavioral.visitor;

/**
 * Implementation of concrete visitor
 * 
 * @author Tomek
 *
 */
public class ConcreteVisitor2 implements Visitor
{
	@Override
	public void visitConcreteElementA( ConcreteElementA concreteElementA )
	{
		System.out.println( "ConcreteVisitor2.visitConcreteElementA()" );
		concreteElementA.operationA();
	}

	@Override
	public void visitConcreteElementB( ConcreteElementB concreteElementB )
	{
		System.out.println( "ConcreteVisitor2.visitConcreteElementB()" );
		concreteElementB.operationB();
	}
}
