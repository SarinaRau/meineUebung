package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VolkshochschuleModel {

	Volkshochschulkurs volkshochschulkurs;
	
	public Volkshochschulkurs getVolkshochschulkurs() {
		return volkshochschulkurs;
	}

	public void setVolkshochschulkurs(Volkshochschulkurs volkshochschulkurs) {
		this.volkshochschulkurs = volkshochschulkurs;
	}

	public void schreibeVolkshochschulenInCsvDatei()throws IOException {
		
			BufferedWriter aus = new BufferedWriter(new FileWriter("VolkshochschulkurseAusgabe.csv", true));
			aus.write(this.getVolkshochschulkurs().gibVolkshochschuleZurueck(';'));
			aus.close();
   			
		
	}
}
