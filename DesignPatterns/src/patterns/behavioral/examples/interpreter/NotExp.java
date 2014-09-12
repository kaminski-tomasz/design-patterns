package patterns.behavioral.examples.interpreter;

public class NotExp implements BooleanExp
{
	private BooleanExp operand;

	public NotExp( BooleanExp operand )
	{
		this.operand = operand;
	}

	@Override
	public boolean evaluate( Context context )
	{
		return !operand.evaluate( context );
	}

	@Override
	public BooleanExp replace( String variable, BooleanExp expression )
	{
		return new NotExp( operand.replace( variable, expression ) );
	}

	@Override
	public BooleanExp copy()
	{
		return new NotExp( operand.copy() );
	}
}
