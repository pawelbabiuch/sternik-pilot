package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Telewizor;

public class CommandTelewizorWylacz implements Command {

	@Override
	public void execute() {
		Telewizor.getInstance().wylacz();
		
	}

	@Override
	public String getOpis() {
		return "Telewizor wylacz";
	}

}
