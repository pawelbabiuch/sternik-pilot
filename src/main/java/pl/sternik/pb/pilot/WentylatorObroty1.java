package pl.sternik.pb.pilot;

public class WentylatorObroty1 implements WentylatorStan{

	private Wentylator wentylator;
	
	public WentylatorObroty1( Wentylator wentylator) {
		this.wentylator = wentylator;
	}
	
	@Override
	public WentylatorStan wlacz() {
		System.out.println("Nic nie robie");
		return this;
		
	}

	@Override
	public WentylatorStan wylacz() {
		System.out.println("Wentylator zostal wylaczony.");
		return wentylator.WYLACZONY;
		
	}

	@Override
	public WentylatorStan obroty1() {
		System.out.println("Nic nie robie");
		return this;	
	}

	@Override
	public WentylatorStan obroty2() {
		System.out.println("Obroty ustawione na 2");
		return wentylator.OBROTY2;
	}

	@Override
	public WentylatorStan obroty3() {
		System.out.println("Nic nie robie");
		return this;
	}

}
