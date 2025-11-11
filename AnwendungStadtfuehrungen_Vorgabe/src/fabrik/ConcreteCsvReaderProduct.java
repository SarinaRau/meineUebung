package fabrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import business.Volkshochschulkurs;

public class ConcreteCsvReaderProduct extends ReaderProduct {
	

	@Override
	public Volkshochschulkurs[] leseAusDatei() throws IOException {
		
		BufferedReader ein = new BufferedReader(new FileReader("Volkshochschulkurs.csv"));
        String zeile;
        Volkshochschulkurs[] kurse = new Volkshochschulkurs[100];
        int anzahl = 0;

        while ((zeile = ein.readLine()) != null) {
            String[] daten = zeile.split(";");
            String kursname = daten[0];
            int kursbeitrag = Integer.parseInt(daten[1]);
            String wochentag = daten[2];
            float startuhrzeit = Float.parseFloat(daten[3]);
            String[] vorkenntnisse = daten[4].split(",");

            kurse[anzahl] = new Volkshochschulkurs(kursname, kursbeitrag, wochentag, startuhrzeit, vorkenntnisse);
            anzahl++;
        }

        ein.close();

        Volkshochschulkurs[] ergebnis = new Volkshochschulkurs[anzahl];
        
        return ergebnis;
    }
	

	

}
