package patterns.behavioral.strategy;

public class ConcreteStrategyB implements Strategy {

	@Override
	public Double operation(Double dataA, Double dataB) {
		return dataA - dataB;
	}

}
