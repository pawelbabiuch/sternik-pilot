package pl.sternik.pb.command.wentylator;

import pl.sternik.pb.command.Command;
import pl.sternik.pb.wentylator.*;

public class CommandWentylatorObroty1 implements Command{

	@Override
	public void execute() {
		Wentylator.getInstance().obroty1();
	}

	@Override
	public String getOpis() {
		return "Wentylator, obroty: 1";
	}

}
