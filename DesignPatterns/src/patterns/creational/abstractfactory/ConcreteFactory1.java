package patterns.creational.abstractfactory;

public class ConcreteFactory1 implements IAbstractFactory {

	@Override
	public IProductA createProductA() {
		return new IProductA1();
	}

	@Override
	public IProductB createProductB() {
		return new ProductB1();
	}

}
