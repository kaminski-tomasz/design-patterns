package patterns.behavioral.visitor;

/**
 * Visitor interface
 * 
 * @author Tomek
 *
 */
public interface Visitor
{
	public void visitConcreteElementA( ConcreteElementA concreteElementA );

	public void visitConcreteElementB( ConcreteElementB concreteElementB );
}
