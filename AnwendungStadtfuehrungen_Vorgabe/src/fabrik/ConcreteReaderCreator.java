package fabrik;

public class ConcreteReaderCreator extends ReaderCreator {

	@Override
	public ReaderProduct factoryMethod(String typ) {
		if(typ.equals("csv")) {
			return new ConcreteCsvReaderProduct();
		}
		else if(typ.equals("txt")) {
			return new ConcreteTxtReaderProduct();
		}
		else {
			throw new IllegalArgumentException("Unbekannter Dateityp: " + typ);
		}
		
	}

}
