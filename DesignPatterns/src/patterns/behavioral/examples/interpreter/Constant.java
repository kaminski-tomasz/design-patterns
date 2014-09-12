package patterns.behavioral.examples.interpreter;

public class Constant implements BooleanExp
{
	private boolean value;

	public Constant( boolean value )
	{
		this.value = value;
	}

	@Override
	public boolean evaluate( Context context )
	{
		return value;
	}

	@Override
	public BooleanExp replace( String variable, BooleanExp expression )
	{
		return this.copy();
	}

	@Override
	public BooleanExp copy()
	{
		return new Constant( value );
	}
}
