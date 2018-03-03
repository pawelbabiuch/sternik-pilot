package pl.sternik.pb.command;

import pl.sternik.pb.garaz.*;

public class CommandGarazZamknij implements Command{

	@Override
	public void execute() {
		Garaz.getInstance().zamknij();
		
	}

	@Override
	public String getOpis() {
		return "Garaz zamknij";
	}

}
