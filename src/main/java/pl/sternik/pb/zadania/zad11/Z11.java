package pl.sternik.pb.zadania.zad11;

enum Stan {
	NOWE(), OCZEKUJACE(), REALIZOWANE("Pilne"), WYSLANE(), ZWROT("Kontakt!");
	private String stan = "";

	private Stan(String stan) {
		this.stan = stan;
	}

	private Stan() {
	}

	public String getStan() {
		if ("".equals(stan))
			return this.toString();
		else
			return stan;
	}
};

public class Z11 {
	public static void main(String[] args) {
		
		String[] out = new String[2];
		
		for (Stan s : Stan.values()) {
			out = checkOut(s);
		}
	}
	
	public static String[] checkOut(Stan s)
	{
		String[] out = new String[2];
		out[0] = s.name();
		out[1] = s.getStan();
		return out;
	}
}
