package patterns.bridge;

import patterns.bridge.Abstraction.ImplementorType;

public class Client {

	public static void main(String[] args) {
		Abstraction abs1 = new RefinedAbstraction1(
				ImplementorType.IMPL_A);
		abs1.operation();
		((RefinedAbstraction1) abs1).operation1();
		Abstraction abs2 = new RefinedAbstraction2(
				ImplementorType.IMPL_B);
		abs2.operation();
		((RefinedAbstraction2) abs2).operation2();
	}

}
