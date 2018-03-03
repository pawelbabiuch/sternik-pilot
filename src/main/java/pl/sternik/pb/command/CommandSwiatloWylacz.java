package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Swiatlo;

public class CommandSwiatloWylacz implements Command{

	@Override
	public void execute() {
		Swiatlo.getInstance().changeState(false);
		
	}

	@Override
	public String getOpis() {
		return "Swiatlo wylacz";
	}

}
