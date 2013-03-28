package patterns.strategy;

/**
 * Context class which runs the strategy
 * 
 * @author tkaminski
 * 
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		setStrategy(strategy);
	}

	/**
	 * Do something important
	 * 
	 * @param input
	 *            input parameter
	 */
	public void doSomething(Double input) {
		Double a = input;
		Double b = input;
		System.out.println("Operation 1: " + strategy.operation(a, a));
		System.out.println("Operation 2: " + strategy.operation(a, b));
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Context context = new Context(new Strategy() {
			@Override
			public Double operation(Double dataA, Double dataB) {
				return dataA + dataB;
			}
		});

		// test addition
		context.doSomething(1.0);
		context.doSomething(2.0);

		// change strategy
		context.setStrategy(new ConcreteStrategyA());
	}

}
