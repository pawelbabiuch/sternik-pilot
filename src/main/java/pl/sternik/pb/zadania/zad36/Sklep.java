package pl.sternik.pb.zadania.zad36;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sklep implements Serializable {

	public List<Pracownik> listaPracownikow;
	
	public Sklep() {
		listaPracownikow = new ArrayList();
		
		listaPracownikow.add(new Pracownik("Adam", "Bdamoswki"));
		listaPracownikow.add(new Pracownik("Bdam", "Hdamoswki"));
		listaPracownikow.add(new Pracownik("Ddam", "Edamoswki"));
		listaPracownikow.add(new Pracownik("Gdam", "Hdamoswki"));
		listaPracownikow.add(new Pracownik("Adam", "Ddamoswki"));
		listaPracownikow.add(new Pracownik("Gdam", "Adamoswki"));
		listaPracownikow.add(new Pracownik("Wdam", "Gdamoswki"));
		listaPracownikow.add(new Pracownik("Hdam", "Gdamoswki"));

	}
}
