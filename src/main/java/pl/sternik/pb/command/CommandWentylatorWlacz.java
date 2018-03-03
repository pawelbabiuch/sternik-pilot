package pl.sternik.pb.command;

import pl.sternik.pb.wentylator.*;

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
