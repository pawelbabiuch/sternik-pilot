package pl.sternik.pb.command.wentylator;

import pl.sternik.pb.command.Command;
import pl.sternik.pb.wentylator.*;

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
