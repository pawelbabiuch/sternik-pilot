package pl.sternik.pb.swiatlo;

public class SwiatloWlaczone implements SwiatloStan{

	@Override
	public void wlacz() {
		System.out.println("Swiatlo jest juz wlaczone. Nic nie robie");
	}

	@Override
	public void wylacz() {
		System.out.println("Swiatlo zostalo wylaczone");	
	}
}
