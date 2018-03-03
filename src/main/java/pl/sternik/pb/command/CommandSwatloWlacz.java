package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Swiatlo;

public class CommandSwatloWlacz implements Command{

	@Override
	public void execute() {
		Swiatlo.getInstance().changeState(true);
		
	}

	@Override
	public String getOpis() {
		return "Swiatlo wlacz";
	}

}
