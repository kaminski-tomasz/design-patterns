package patterns.structural.bridge;

import patterns.structural.bridge.Abstraction.ImplementorType;

/**
 * Testing the Bridge Pattern
 * 
 * @author Tomek
 *
 */
public class Client
{
	public static void main( String[] args )
	{
		RefinedAbstraction1 abstraction1 = new RefinedAbstraction1( ImplementorType.IMPL_A );
		abstraction1.operation();
		abstraction1.operation1();

		RefinedAbstraction2 abstraction2 = new RefinedAbstraction2( ImplementorType.IMPL_A );
		abstraction2.operation();
		abstraction2.operation2();

		Abstraction abstraction3 = new RefinedAbstraction2( ImplementorType.IMPL_B );
		abstraction3.operation();
	}
}
