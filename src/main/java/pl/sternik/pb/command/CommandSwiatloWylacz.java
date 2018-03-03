package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Swiatlo;

public class CommandSwiatloWylacz implements Command{

	@Override
	public void execute() {
		Swiatlo.getInstance().wylacz();
		
	}

	@Override
	public String getOpis() {
		return "Swiatlo wylacz";
	}

}
