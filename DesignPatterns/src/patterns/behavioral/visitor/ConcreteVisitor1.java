package patterns.behavioral.visitor;

/**
 * Implementation of concrete visitor
 * 
 * @author Tomek
 *
 */
public class ConcreteVisitor1 implements Visitor
{
	@Override
	public void visitConcreteElementA( ConcreteElementA concreteElementA )
	{
		System.out.println( "ConcreteVisitor1.visitConcreteElementA()" );
		concreteElementA.operationA();
	}

	@Override
	public void visitConcreteElementB( ConcreteElementB concreteElementB )
	{
		System.out.println( "ConcreteVisitor1.visitConcreteElementB()" );
		concreteElementB.operationB();
	}
}
