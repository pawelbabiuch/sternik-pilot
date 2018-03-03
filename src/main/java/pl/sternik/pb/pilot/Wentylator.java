package pl.sternik.pb.pilot;

public class Wentylator {

	private static Wentylator instance;
	
	public final WentylatorStan WYLACZONY = new WentylatorWylaczony(this);
	public final WentylatorStan OBROTY1 = new WentylatorObroty1(this);
	public final WentylatorStan OBROTY2 = new WentylatorObroty2(this);
	public final WentylatorStan OBROTY3 = new WentylatorObroty3(this);
	
	private WentylatorStan stan = WYLACZONY;
	
	private Wentylator() {}

	public static Wentylator getInstance() {
		
		if(instance == null) {
			instance = new Wentylator();
		}
		
		return instance;
	}
	
	public void wlacz() {	
		stan = stan.wlacz();
	}
	
	public void wylacz() {
		stan = stan.wylacz();
	}
	
	public void obroty1() {
		stan = stan.obroty1();
	}
	
	public void obroty2() {
		stan = stan.obroty2();
	}
	
	public void obroty3() {
		stan = stan.obroty3();
	}
}
