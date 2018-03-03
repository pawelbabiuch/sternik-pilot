package pl.sternik.pb.pilot;

public class GarazOtwarty implements GarazStan{

	@Override
	public void otworz() {
		System.out.println("Garaz jest juz otwarty. Nic nie robie");
		
	}

	@Override
	public void zamknij() {
		System.out.println("Garaz zostal zamkniety");
		
	}

}
