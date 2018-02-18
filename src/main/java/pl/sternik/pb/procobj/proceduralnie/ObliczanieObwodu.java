package pl.sternik.pb.procobj.proceduralnie;

public class ObliczanieObwodu {

	public static double obliczObwod(Kwadrat k) {
		return 4 * k.getBokKwadratu();
	}
	
	public static double obliczObwod(Prostokat p) {
		return (2* p.getBokA()) + (2* p.getBokB());
	}
	
	public static double obliczObwod(Kolo k) {
		return 2 * Math.PI * k.getObwod();
	}
}
