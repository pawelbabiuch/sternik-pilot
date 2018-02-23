package pl.sternik.pb.zadania.zad05;
// CTRL+u - nowy test, CTRL + j - odpala testy, CTRL + r - przełącza pomiędzy testy
public class Z05 {

	public static void main(String[] args) {
		String[] tablica = { "1", "2", "3", "4" };

		String tmp = zrobPetleFor(tablica);
		// System.out.println(tmp);

		tmp = zrobPetleForEach(tablica);
		// System.out.println(tmp);

		tmp = zrobPetleWhile(tablica);
		// System.out.println(tmp);

	}

	static String zrobPetleFor(String[] tablica) {
		int i;
		String tmp = "For\n";
		for (i = 0; i <= tablica.length - 1; i++) {
		//	System.out.println(tablica[i]);
			tmp += tablica[i];
		}
		return tmp;
	}

	static String zrobPetleWhile(String[] tablica) {
		int i;
		i = 0;
		String tmp = "While\n";
		while (i <= tablica.length - 1) {
		//	System.out.println(tablica[i]);
			tmp += tablica[i];
			i++;
		}
		return tmp;
	}

	static String zrobPetleForEach(String[] tablica) {
		String tmp = "";
		tmp = tmp + "FOREach\n";
		for (String string : tablica) {
			tmp += string;
		}

		return tmp;
	}
}
