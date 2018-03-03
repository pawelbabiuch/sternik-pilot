package pl.sternik.pb.garaz;

public class Garaz {

	private static Garaz instance;
	private GarazStan otwarty = new GarazOtwarty();
	private GarazStan zamkniety = new GarazZamkniety();
	private Garaz() {}

	private GarazStan stan = zamkniety;
	
	public static Garaz getInstance() {
		
		if(instance == null) {
			instance = new Garaz();
		}
		
		return instance;
	}

	
	public void otworz() {
		stan.otworz();
		stan = otwarty;
	}
	
	public void zamknij() {
		stan.zamknij();
		stan = zamkniety;
	}
}
