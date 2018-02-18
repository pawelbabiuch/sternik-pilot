package pl.sternik.pb.zadania.zad36;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pracownik implements Serializable {

	private static final long serialVersionUID = 1L;
	public String imie, nazwisko;
	public transient Address adres = new Address();

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public Pracownik() {}
	public Pracownik(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	private void writeObject(ObjectOutputStream o) {
		try {
			o.defaultWriteObject();
			o.writeObject(adres.getAddress());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void readObject(ObjectInputStream i) {
		try {
			i.defaultReadObject();
			adres = new Address((String)i.readObject());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
