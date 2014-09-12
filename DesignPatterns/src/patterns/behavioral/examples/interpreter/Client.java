package patterns.behavioral.examples.interpreter;

public class Client
{
	public static void main( String[] args )
	{
		BooleanExp expression;
		Context context = new Context();

		VariableExp x = new VariableExp( "X" );
		VariableExp y = new VariableExp( "Y" );

		expression = new OrExp( new AndExp( new Constant( true ), x ), new AndExp( y, new NotExp( x ) ) );

		context.assign( x, false );
		context.assign( y, true );

		boolean result = expression.evaluate( context );
		System.out.println( "Wynik ((true and x) or (y and (not x))) = " + result );

		VariableExp z = new VariableExp( "Z" );
		NotExp notZ = new NotExp( z );

		BooleanExp replacement = expression.replace( "Y", notZ );

		context.assign( z, true );
		result = replacement.evaluate( context );
		System.out.println( "Wynik ((true and x) or ((not z) and (not x))) = " + result );
	}
}
