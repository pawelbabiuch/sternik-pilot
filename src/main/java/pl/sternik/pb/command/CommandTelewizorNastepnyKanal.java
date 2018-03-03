package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Telewizor;

public class CommandTelewizorNastepnyKanal implements Command{

	@Override
	public void execute() {
		Telewizor.getInstance().nastepnyKanal();
	}

	@Override
	public String getOpis() {
		return "Telewizor nastepny kanal";
	}

	
}
