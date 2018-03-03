package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Garaz;

public class CommandGarazOtworz implements Command{

	@Override
	public void execute() {
		Garaz.getInstance().otworz();
		
	}

	@Override
	public String getOpis() {
		return "Garaz otworz";
	}

}
