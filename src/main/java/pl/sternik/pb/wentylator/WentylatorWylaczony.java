package pl.sternik.pb.wentylator;

public class WentylatorWylaczony implements WentylatorStan{

	private Wentylator wentylator;
	
	public WentylatorWylaczony( Wentylator wentylator) {
		this.wentylator = wentylator;
	}
	
	@Override
	public WentylatorStan wlacz() {
		System.out.println("Wentylator zostal wlaczony. Obroty 1");
		return wentylator.OBROTY1;
	}

	@Override
	public WentylatorStan wylacz() {
		System.out.println("Nic nie robie.");
		return this;
		
	}

	@Override
	public WentylatorStan obroty1() {
		System.out.println("Ustawiam obroty 1");
		return wentylator.OBROTY1;
	}

	@Override
	public WentylatorStan obroty2() {
		System.out.println("Nic nie robie.");
		return this;
	}

	@Override
	public WentylatorStan obroty3() {
		System.out.println("Nic nie robie.");
		return this;
	}

}
