package pl.sternik.pb.zadania.zad35;

public class Person implements Comparable {

	private static int counter = 0;
	
	private int id;
	public int getId() {
		return id;
	}

	private String imie;
	private String nazwisko;

	public String getImie() {
		return imie;
	}
	
	public String getNaziwsko() {
		return nazwisko;
	}
	
	public Person(String imie, String nazwisko) {
		this.id = counter++;
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	public Person(String imie, String nazwisko, int id) {
		
		counter = id;
		this.id = counter++;
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object arg0) {

		Person person = (Person)arg0;
		return this.nazwisko.compareTo(person.nazwisko);
	}

}
