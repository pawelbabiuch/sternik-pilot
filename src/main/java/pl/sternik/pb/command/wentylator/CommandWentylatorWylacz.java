package pl.sternik.pb.command.wentylator;

import pl.sternik.pb.command.Command;
import pl.sternik.pb.wentylator.*;

public class CommandWentylatorWylacz implements Command{

	@Override
	public void execute() {
		Wentylator.getInstance().wylacz();
	}

	@Override
	public String getOpis() {
		return "Wentylator wylacz";
	}

}
