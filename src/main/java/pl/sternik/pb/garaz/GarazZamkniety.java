package pl.sternik.pb.garaz;

public class GarazZamkniety implements GarazStan{

	@Override
	public void otworz() {
		System.out.println("Garaz zostal otwarty.");
	}

	@Override
	public void zamknij() {
		System.out.println("Garaz jest juz zamkniety. Nic nie robie");
	}

}
