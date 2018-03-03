package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Wentylator;

public class CommandWentylatorObroty3 implements Command{

	@Override
	public void execute() {
		Wentylator.getInstance().obroty3();
	}

	@Override
	public String getOpis() {
		return "Wentylator, obroty: 3";
	}

}
