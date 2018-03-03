package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Wentylator;

public class CommandWentylatorObroty2 implements Command{

	@Override
	public void execute() {
		Wentylator.getInstance().obroty2();
	}

	@Override
	public String getOpis() {
		return "Wentylator, obroty: 2";
	}

}