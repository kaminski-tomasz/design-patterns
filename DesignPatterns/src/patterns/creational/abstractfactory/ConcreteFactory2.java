package patterns.creational.abstractfactory;

public class ConcreteFactory2 implements IAbstractFactory {

	@Override
	public IProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public IProductB createProductB() {
		return new ProductB2();
	}

}
