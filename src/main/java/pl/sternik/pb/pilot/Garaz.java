package pl.sternik.pb.pilot;

public class Garaz {

	private static Garaz instance;
	private Garaz() {}

	private boolean isOpen = false;
	
	public static Garaz getInstance() {
		
		if(instance == null) {
			instance = new Garaz();
		}
		
		return instance;
	}

	public boolean getIsOpen() {
		return isOpen;
	}
	
	public void open() {
		isOpen = true;
		System.out.println("Garaz otwarty");
	}
	
	public void close() {
		isOpen = false;
		System.out.println("Garaz zamkniety");

	}
}
