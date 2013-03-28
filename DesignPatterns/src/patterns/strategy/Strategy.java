package patterns.strategy;

/**
 * Interface for the strategy
 * @author tkaminski
 *
 */
public interface Strategy {

	/**
	 * Perform very important operation.
	 * @param dataA
	 * @param dataB
	 * @return
	 */
	public Double operation(Double dataA, Double dataB);
	
}
