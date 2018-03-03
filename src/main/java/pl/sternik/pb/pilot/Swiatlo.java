package pl.sternik.pb.pilot;

public class Swiatlo {

	private static Swiatlo instance;
	private Swiatlo() {}
	
	private boolean isTurnOn = false;
	
	public boolean getTurnOn() {
		return isTurnOn;
	}
	
	public static Swiatlo getInstance() {
		
		if(instance == null)
			instance = new Swiatlo();
		
		return instance;
	}

	public void changeState(boolean isOn) {
		isTurnOn = isOn;
		System.out.println("Stan swiatla: " + getTurnOn());
	}
}
