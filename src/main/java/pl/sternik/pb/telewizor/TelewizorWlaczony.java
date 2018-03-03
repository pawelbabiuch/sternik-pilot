package pl.sternik.pb.telewizor;

public class TelewizorWlaczony implements TelewizorStan{
	
	@Override
	public TelewizorStan wlacz() {
		System.out.println("Telewizor jest juz wlaczony. Nic nie robie.");
		return this;
	}

	@Override
	public TelewizorStan wylacz() {
		System.out.println("Telewizor zostal wylaczony.");
		return Telewizor.getInstance().WYLACZONY;	
	}

	@Override
	public TelewizorStan glosniej() {
		
		if(Telewizor.getInstance().currentVolume < Telewizor.getInstance().MAX_VOLUME)
			Telewizor.getInstance().currentVolume++;
		
		System.out.println("Telewizor: Zwiekszono glosnosc: " + Telewizor.getInstance().currentVolume);	
		return this;	
	}

	@Override
	public TelewizorStan ciszej() {
		
		if(Telewizor.getInstance().currentVolume > 0)
			Telewizor.getInstance().currentVolume--;
		
		System.out.println("Telewizor: Zmniejszono glosnosc: " + Telewizor.getInstance().currentVolume);
		return this;
	}

	@Override
	public TelewizorStan nastepnyKanal() {
		
		if(++Telewizor.getInstance().currentChanel > Telewizor.getInstance().MAX_CHANEL)
			Telewizor.getInstance().currentChanel = 1;
		
		System.out.println("Telewizor zmieniono na kanal: " + Telewizor.getInstance().currentChanel);
		return this;		
	}

	@Override
	public TelewizorStan poprzedniKanal() {
		
		if(--Telewizor.getInstance().currentChanel < 1)
			Telewizor.getInstance().currentChanel = Telewizor.getInstance().MAX_CHANEL;
		
		System.out.println("Telewizor zmieniono na kanal: " + Telewizor.getInstance().currentChanel);
		return this;
	}

}
