package pl.sternik.pb.command;

import pl.sternik.pb.pilot.SprzetyFasada;

public class CommandTrybKanapowy implements Command{

	@Override
	public void execute() {
		SprzetyFasada.wlaczTrybKanapowy();
	}

	@Override
	public String getOpis() {
		return "Wlacz tryb kanapowy";
	}

}
