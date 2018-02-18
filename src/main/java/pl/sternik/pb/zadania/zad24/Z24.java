package pl.sternik.pb.zadania.zad24;

public class Z24 {
		
	public static void main(String[] args) {
	
		System.out.println(podziel(1,0));
		dajElement(19);

	}

	@SuppressWarnings("finally")
	public static String podziel(int i, int j) {
		String msg = "";
		
		try {
			msg = (i / j) + "";

		}catch(ArithmeticException e) {
			msg = e.getMessage(); 
		}finally {
			return msg;
		}

	}

	public static int dajElement(int i) {
		
		int[] tab = { 1, 2, 3, 4, 5, 6 };
		int id = -1;
		
		try {
			System.out.println(tab[i]);
			id = tab[i];
		} catch (Exception e) {
			System.out.println("Brak indeksu");	
		}finally {
			return id;
		}
	}

}
