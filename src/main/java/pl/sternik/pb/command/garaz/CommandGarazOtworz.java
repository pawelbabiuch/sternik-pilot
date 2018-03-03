package pl.sternik.pb.command.garaz;

import pl.sternik.pb.command.Command;
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
