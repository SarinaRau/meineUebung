package fabrik;

public class ConcreteCreator extends Creator {

	@Override
	public ConcreteProduct factoryMethod() {
		
		return new ConcreteProduct();
	}
	
	

}
