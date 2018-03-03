package pl.sternik.pb.wentylator;

public class WentylatorObroty2 implements WentylatorStan{

	private Wentylator wentylator;
	
	public WentylatorObroty2( Wentylator wentylator) {
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
		System.out.println("Obroty ustawione na 1");
		return wentylator.OBROTY1;	
		
	}

	@Override
	public WentylatorStan obroty2() {
		System.out.println("Nic nie robie");
		return this;	
		
	}

	@Override
	public WentylatorStan obroty3() {
		System.out.println("Obroty ustawione na 3");
		return wentylator.OBROTY3;
		
	}

}
