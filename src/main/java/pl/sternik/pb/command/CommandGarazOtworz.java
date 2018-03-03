package pl.sternik.pb.command;

import pl.sternik.pb.garaz.*;

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
