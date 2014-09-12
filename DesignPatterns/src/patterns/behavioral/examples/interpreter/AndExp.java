package patterns.behavioral.examples.interpreter;

public class AndExp implements BooleanExp
{
	private BooleanExp operand1;
	private BooleanExp operand2;

	public AndExp( BooleanExp operand1, BooleanExp operand2 )
	{
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public boolean evaluate( Context context )
	{
		return operand1.evaluate( context ) && operand2.evaluate( context );
	}

	@Override
	public BooleanExp replace( String variable, BooleanExp expression )
	{
		return new AndExp( operand1.replace( variable, expression ), 
				   operand2.replace( variable, expression ) );
	}

	@Override
	public BooleanExp copy()
	{
		return new AndExp( operand1.copy(), operand2.copy() );
	}
}
