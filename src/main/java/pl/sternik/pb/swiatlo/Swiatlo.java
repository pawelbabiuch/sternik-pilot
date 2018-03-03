package pl.sternik.pb.pilot;

public class Swiatlo {

	private static Swiatlo instance;
	private SwiatloStan wlaczone = new SwiatloWlaczone();
	private SwiatloStan wylaczone = new SwiatloWylaczone();
	private Swiatlo() {}
	
	private SwiatloStan stan = wylaczone;

	
	public static Swiatlo getInstance() {
		
		if(instance == null)
			instance = new Swiatlo();
		
		return instance;
	}

	public void wlacz() {
		stan.wlacz();
		stan = wlaczone;
	}
	
	public void wylacz() {
		stan.wylacz();
		stan = wylaczone;
	}
}
