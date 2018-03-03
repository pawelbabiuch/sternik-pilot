package pl.sternik.pb.command.garaz;

import pl.sternik.pb.command.Command;
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
