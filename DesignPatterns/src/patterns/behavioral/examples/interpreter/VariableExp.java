package patterns.behavioral.examples.interpreter;

public class VariableExp implements BooleanExp
{
	private String name;

	public VariableExp( String name )
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public boolean evaluate( Context context )
	{
		return context.lookup( name );
	}

	@Override
	public BooleanExp replace( String variable, BooleanExp expression )
	{
		if( variable != null && variable.equals( name ) )
		{
			return expression.copy();
		}
		else
		{
			return this.copy();
		}
	}

	@Override
	public BooleanExp copy()
	{
		return new VariableExp( name );
	}
}
