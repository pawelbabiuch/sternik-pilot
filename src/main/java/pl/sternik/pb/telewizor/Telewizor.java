package pl.sternik.pb.telewizor;

public class Telewizor {

	private static Telewizor instance;
	private final TelewizorStan wlaczony = new TelewizorWlaczony();
	private final TelewizorStan wylaczony = new TelewizorWylaczony();
	private Telewizor() {}
	
	private TelewizorStan stan = wylaczony;
	private int channelID = 1;
	private int volumePercent = 10;
	
	public static Telewizor getInstance() {
		
		if(instance == null) {
			instance = new Telewizor();
		}
		
		return instance;
	}

	public void wlacz() {
		stan.wlacz();
		stan = wlaczony;
	}
	
	public void wylacz() {
		stan.wylacz();
		stan = wylaczony;
	}

	public void glosniej() {
		
		if((volumePercent += 10) > 100)
			volumePercent = 100;
		
		stan.glosniej();
	}
	
	public void ciszej() {
	
		if((volumePercent -= 10) < 0)
			volumePercent = 0;
		
		stan.ciszej();
	}

	public void nastepnyKanal() {

		channelID++;
		stan.nastepnyKanal();
	}
	
	public void poprzedniKanal() {
		
		if((channelID -= 1) < 1)
			channelID = 1;
		
		stan.poprzedniKanal();
	}
}
