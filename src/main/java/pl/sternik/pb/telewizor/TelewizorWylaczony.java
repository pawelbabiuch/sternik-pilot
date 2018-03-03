package pl.sternik.pb.telewizor;

public class TelewizorWylaczony implements TelewizorStan{

	@Override
	public void wlacz() {
		System.out.println("Telewizor zostal wlaczony.");	
	}

	@Override
	public void wylacz() {
		System.out.println("Telewizor jest juz wylaczony. Nic nie robie.");	
	}

	@Override
	public void glosniej() {
		System.out.println("Telewizor jest wylaczony. Nic nie robie.");	
	}

	@Override
	public void ciszej() {
		System.out.println("Telewizor jest wylaczony. Nic nie robie.");	
	}

	@Override
	public void nastepnyKanal() {
		System.out.println("Telewizor jest wylaczony. Nic nie robie.");	
	}

	@Override
	public void poprzedniKanal() {
		System.out.println("Telewizor jest wylaczony. Nic nie robie.");		
	}

}
