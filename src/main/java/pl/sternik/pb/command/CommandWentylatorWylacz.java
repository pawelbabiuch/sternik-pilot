package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Wentylator;

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
