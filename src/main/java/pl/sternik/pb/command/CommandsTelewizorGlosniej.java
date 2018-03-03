package pl.sternik.pb.command;

import pl.sternik.pb.pilot.Telewizor;

public class CommandsTelewizorGlosniej implements Command{

	@Override
	public void execute() {
		Telewizor.getInstance().glosniej();
		
	}

	@Override
	public String getOpis() {
		return "Telewizor glosniej";
	}

}
