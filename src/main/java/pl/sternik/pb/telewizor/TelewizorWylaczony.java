package pl.sternik.pb.telewizor;

public class TelewizorWylaczony implements TelewizorStan{

	
	@Override
	public TelewizorStan wlacz() {
		System.out.println("Telewizor zostal wlaczony.");	
		return Telewizor.getInstance().WLACZONY;
	}

	@Override
	public TelewizorStan wylacz() {
		System.out.println("Telewizor jest juz wylaczony. Nic nie robie.");
		return this;
	}

	@Override
	public TelewizorStan glosniej() {
		System.out.println("Telewizor jest wylaczony. Nic nie robie.");
		return this;
	}

	@Override
	public TelewizorStan ciszej() {
		System.out.println("Telewizor jest wylaczony. Nic nie robie.");	
		return this;
	}

	@Override
	public TelewizorStan nastepnyKanal() {
		System.out.println("Telewizor jest wylaczony. Nic nie robie.");	
		return this;
	}

	@Override
	public TelewizorStan poprzedniKanal() {
		System.out.println("Telewizor jest wylaczony. Nic nie robie.");		
		return this;
	}

}
