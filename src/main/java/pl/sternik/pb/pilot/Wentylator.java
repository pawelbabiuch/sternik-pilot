package pl.sternik.pb.pilot;

public class Wentylator {

	private static Wentylator instance;
	private Wentylator() {}
	
	private byte obroty = 0; // 0 = wylaczony, 1-3 = sila obrotow
	
	public byte getObroty() {
		return obroty;
	}
	
	public boolean getIsOn() {
		return (obroty == 0)? false : true;
	}

	public static Wentylator getInstance() {
		
		if(instance == null) {
			instance = new Wentylator();
		}
		
		return instance;
	}
	
	public void wlacz() {	
		obroty1();
		System.out.println("Wentylator wlaczony: " + getIsOn());
	}
	
	public void wylacz() {
		
		if(obroty > 1) obroty1();
		
		obroty = 0;
		System.out.println("Wentylator wlaczony: " + getIsOn());
	}
	
	public void obroty1() {
		
		if(obroty > 2) obroty2();
		
		obroty = 1;
		System.out.println("Wentylator, obroty: " + obroty);
	}
	
	public void obroty2() {
		
		if(obroty < 1) obroty1();
		
		obroty = 2;
		System.out.println("Wentylator, obroty: " + obroty);
		
	}
	
	public void obroty3() {
		
		if(obroty < 2) obroty2();
		
		obroty = 3;
		System.out.println("Wentylator, obroty: " + obroty);
		
	}
}
