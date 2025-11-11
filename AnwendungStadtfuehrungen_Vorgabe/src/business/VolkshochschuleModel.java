package business;


import java.io.IOException;

import fabrik.ConcreteCreator;
import fabrik.Creator;
import fabrik.Product;
import fabrik.ReaderCreator;
import fabrik.ReaderProduct;
import fabrik.ConcreteReaderCreator;

public class VolkshochschuleModel {

	Volkshochschulkurs volkshochschulkurs;
	private Volkshochschulkurs[] kurse= new Volkshochschulkurs[100];
	private int anzahlKurse;
	
	public int getAnzahlKurse() {
        return anzahlKurse;
    }

    public void setAnzahlKurse(int anzahlKurse) {
        this.anzahlKurse = anzahlKurse;
    }
	
	public Volkshochschulkurs getVolkshochschulkurs() {
		return volkshochschulkurs;
	}

	public void setVolkshochschulkurs(Volkshochschulkurs volkshochschulkurs) {
		this.volkshochschulkurs = volkshochschulkurs;
	}
	
	

	public void schreibeVolkshochschulenInCsvDatei()throws IOException {
		
			Creator writer=new ConcreteCreator();
			Product product= writer.factoryMethod();
			product.fuegeInDateiHinzu(volkshochschulkurs);
			product.schliesseDatei();
   			
		
	}
	
	public void leseAusCsvDatei() throws IOException {
        ReaderCreator readerCreator = new ConcreteReaderCreator();
        ReaderProduct reader = readerCreator.factoryMethod("csv");

        Volkshochschulkurs[] geleseneKurse = reader.leseAusDatei();

        this.anzahlKurse = geleseneKurse.length;
        for (int i = 0; i < anzahlKurse; i++) {
            this.kurse[i] = geleseneKurse[i];
        }

        if (anzahlKurse > 0) {
            this.volkshochschulkurs = kurse[0];
        }
    }
	
	public void leseAusTxtDatei() throws IOException {
        ReaderCreator readerCreator = new ConcreteReaderCreator();
        ReaderProduct reader = readerCreator.factoryMethod("txt");

        Volkshochschulkurs[] geleseneKurse = reader.leseAusDatei();

        this.anzahlKurse = geleseneKurse.length;
        for (int i = 0; i < anzahlKurse; i++) {
            this.kurse[i] = geleseneKurse[i];
        }

        if (anzahlKurse > 0) {
            this.volkshochschulkurs = kurse[0];
        }
    }
}
