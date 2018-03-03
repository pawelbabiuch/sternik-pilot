package pl.sternik.pb.pilot;

public class Telewizor {

	private static Telewizor instance;
	private Telewizor() {}
	
	private boolean isOn = false;
	private int channelID = 1;
	private int volumePercent = 10;
	
	public boolean isOn() {
		return isOn;
	}

	public int getChannelID() {
		return channelID;
	}

	public int getVolumePercent() {
		return volumePercent;
	}

	public static Telewizor getInstance() {
		
		if(instance == null) {
			instance = new Telewizor();
		}
		
		return instance;
	}

	public void wlacz() {
		isOn = true;
		System.out.println("Telewizor wlaczony");
	}
	
	public void wylacz() {
		isOn = false;
		System.out.println("Telewizor wylaczony");

	}

	public void glosniej() {

		if(isOn == false) {
			System.err.println("TV wylaczony. Brak zmiany");
			return;
		}
		
		if((volumePercent += 10) > 100)
			volumePercent = 100;
		
		System.out.println("Telewizor glosnosc: " + volumePercent + "%");
	}
	
	public void ciszej() {
		
		if(isOn == false) {
			System.err.println("TV wylaczony. Brak zmiany");
			return;
		}
		
		if((volumePercent -= 10) < 0)
			volumePercent = 0;
		
		System.out.println("Telewizor glosnosc: " + volumePercent + "%");
	}

	public void nastepnyKanal() {
		
		if(isOn == false) {
			System.err.println("TV wylaczony. Brak zmiany");
			return;
		}
		
		channelID++;
		System.out.println("Telewizor kanal: " + channelID);
	}
	
	public void poprzedniKanal() {
		
		if(isOn == false) {
			System.err.println("TV wylaczony. Brak zmiany");
			return;
		}
		
		if((channelID -= 1) < 1)
			channelID = 1;
		
		System.out.println("Telewizor kanal: " + channelID);
	}
}
