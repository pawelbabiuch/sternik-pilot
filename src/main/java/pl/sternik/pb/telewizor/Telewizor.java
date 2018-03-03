package pl.sternik.pb.telewizor;

public class Telewizor {

	private static Telewizor instance;
	public final TelewizorStan WLACZONY = new TelewizorWlaczony();
	public final TelewizorStan WYLACZONY = new TelewizorWylaczony();
	
	public final byte MAX_CHANEL = 10;
	public final byte MAX_VOLUME = 10;
	
	public byte currentChanel = 1;
	public byte currentVolume = 5;
	
	private Telewizor() {}
	
	public TelewizorStan stan = WYLACZONY;
	
	
	public static Telewizor getInstance() {
		
		if(instance == null) {
			instance = new Telewizor();
		}
		
		return instance;
	}

	public void wlacz() {
		stan = stan.wlacz();
	}
	
	public void wylacz() {
		stan = stan.wylacz();
	}

	public void glosniej() {
		stan = stan.glosniej();
	}
	
	public void ciszej() {
		stan = stan.ciszej();
	}

	public void nastepnyKanal() {
		stan = stan.nastepnyKanal();
	}
	
	public void poprzedniKanal() {
		stan = stan.poprzedniKanal();
	}
}
