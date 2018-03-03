package pl.sternik.pb.command.wentylator;

import pl.sternik.pb.command.Command;
import pl.sternik.pb.wentylator.*;

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
