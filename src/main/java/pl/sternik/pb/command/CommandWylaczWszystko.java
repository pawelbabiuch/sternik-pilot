package pl.sternik.pb.command;

import pl.sternik.pb.pilot.SprzetyFasada;

public class CommandWylaczWszystko implements Command{

	@Override
	public void execute() {
		SprzetyFasada.wylaczWszystko();
	}

	@Override
	public String getOpis() {
		return "Wylacz wszystko";
	}

}
