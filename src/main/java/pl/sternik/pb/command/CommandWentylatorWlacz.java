package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Wentylator;

public class CommandWentylatorWlacz implements Command{

	@Override
	public void execute() {
		Wentylator.getInstance().wlacz();
	}

	@Override
	public String getOpis() {
		return "Wentylator wlacz";
	}

}
