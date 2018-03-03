package pl.sternik.pb.swiatlo;

public class SwiatloWylaczone implements SwiatloStan {

	@Override
	public void wlacz() {
		System.out.println("Swiatlo zostalo wlaczone");	
	}

	@Override
	public void wylacz() {
		System.out.println("Swiatlo jest juz wylaczone. Nic nie robie");
	}

}
