package patterns.behavioral.examples.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context
{
	private Map< String, Boolean > values = new HashMap< String, Boolean >();

	public Boolean lookup( String variable )
	{
		return values.get( variable );
	}

	public void assign( VariableExp variable, boolean value )
	{
		System.out.println( "Przypisanie " + variable.getName() + " = " + value );
		values.put( variable.getName(), value );
	}
}
