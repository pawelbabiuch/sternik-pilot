package pl.sternik.pb.procobj.proceduralnie;

public class ObliczaniePola {
	public static double obliczPole(Kwadrat k) {
		return k.getBokKwadratu() * k.getBokKwadratu();
	}
	
	public static double obliczPole(Prostokat p) {
		return p.getBokA() * p.getBokB();
	}
	
	public static double obliczPole(Kolo k) {
		return Math.PI * Math.pow(k.getObwod(), 2);
	}
}
