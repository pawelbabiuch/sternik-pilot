package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Pilot;

public class CommandPrzelaczMenu implements Command {

	private Pilot pilot;
	
	public CommandPrzelaczMenu(Pilot pilot) {
		this.pilot = pilot;
	}
	
	@Override
	public void execute() {
		pilot.changeState();

	}

	@Override
	public String getOpis() {
		return "Zmiana trybu pilota";
	}

}
