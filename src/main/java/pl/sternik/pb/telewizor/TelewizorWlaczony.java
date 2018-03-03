package pl.sternik.pb.telewizor;

public class TelewizorWlaczony implements TelewizorStan{

	@Override
	public void wlacz() {
		System.out.println("Telewizor jest juz wlaczony. Nic nie robie.");
	}

	@Override
	public void wylacz() {
		System.out.println("Telewizor zostal wylaczony.");
		
	}

	@Override
	public void glosniej() {
		System.out.println("Telewizor: Zwiekszono glosnosc");
		
	}

	@Override
	public void ciszej() {
		System.out.println("Telewizor: Zmniejszono glosnosc");
	}

	@Override
	public void nastepnyKanal() {
		System.out.println("Telewizor: Nastepny kanal");
		
	}

	@Override
	public void poprzedniKanal() {
		System.out.println("Telewizor: Poprzedni kanal");
		
	}

}
