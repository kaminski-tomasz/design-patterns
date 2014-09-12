package patterns.behavioral.interpreter;

/**
 * Terminal expression
 * 
 * @author Tomek
 *
 */
public class TerminalExpression implements AbstractExpression
{
	private String value;

	public TerminalExpression( String value )
	{
		this.value = value;
	}

	@Override
	public void interpret( Context context )
	{
		System.out.println( "TerminalExpression[" + value + "].interpret(" + context + ")" );
	}
}
