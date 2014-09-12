package patterns.behavioral.interpreter;

/**
 * Testing the Interpreter Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		TerminalExpression terminal = new TerminalExpression( "terminalValue" );
		AbstractExpression expression = 
				new NonTerminalExpression( 
						new NonTerminalExpression( terminal ) );
		Context context = new Context( "ContextValue" );
		expression.interpret( context );
	}
}
