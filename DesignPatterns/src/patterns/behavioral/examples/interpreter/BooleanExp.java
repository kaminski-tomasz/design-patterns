package patterns.behavioral.examples.interpreter;

public interface BooleanExp
{
	public boolean evaluate( Context context );

	public BooleanExp replace( String variable, BooleanExp expression );

	public BooleanExp copy();
}
