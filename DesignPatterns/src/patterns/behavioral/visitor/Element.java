package patterns.behavioral.visitor;

/**
 * Element interface
 * 
 * @author Tomek
 *
 */
public interface Element
{
	public void accept( Visitor visitor );
}
