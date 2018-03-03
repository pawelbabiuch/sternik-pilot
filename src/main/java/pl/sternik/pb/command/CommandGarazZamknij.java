package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Garaz;

public class CommandGarazZamknij implements Command{

	@Override
	public void execute() {
		Garaz.getInstance().close();
		
	}

	@Override
	public String getOpis() {
		return "Garaz zamknij";
	}

}
