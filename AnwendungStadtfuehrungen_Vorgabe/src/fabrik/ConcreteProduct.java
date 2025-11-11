package fabrik;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Volkshochschulkurs;



public class ConcreteProduct extends Product {
	BufferedWriter aus;
	@Override
	public void fuegeInDateiHinzu(Volkshochschulkurs kurs) throws IOException {
		aus = new BufferedWriter(new FileWriter("VolkshochschulkurseAusgabe.csv", true));
		aus.write(kurs.gibVolkshochschuleZurueck(';'));
		//aus.close();
		
	}

	@Override
	public void schliesseDatei() throws IOException {
		aus.close();
		
	}
	

		
}
