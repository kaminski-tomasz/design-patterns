package patterns.behavioral.interpreter;

/**
 * Declaration of interface for all abstract syntax tree nodes
 * 
 * @author Tomek
 *
 */
public interface AbstractExpression
{
	public void interpret( Context context );
}
