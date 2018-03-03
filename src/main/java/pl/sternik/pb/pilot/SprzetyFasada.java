package pl.sternik.pb.pilot;

import pl.sternik.pb.swiatlo.Swiatlo;
import pl.sternik.pb.telewizor.Telewizor;
import pl.sternik.pb.wentylator.Wentylator;

public abstract class SprzetyFasada {

	public static void wylaczWszystko() {
		Swiatlo.getInstance().wylacz();
		Telewizor.getInstance().wylacz();
		Wentylator.getInstance().wylacz();
	}
	
	public static void wlaczTrybKanapowy() {
		Swiatlo.getInstance().wylacz();
		Telewizor.getInstance().wlacz();
		Wentylator.getInstance().wlacz();
	}
}
