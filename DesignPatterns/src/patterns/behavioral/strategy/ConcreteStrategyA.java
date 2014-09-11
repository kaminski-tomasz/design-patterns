package patterns.behavioral.strategy;

public class ConcreteStrategyA implements Strategy {

	@Override
	public Double operation(Double dataA, Double dataB) {
		return dataA + dataB;
	}

}
