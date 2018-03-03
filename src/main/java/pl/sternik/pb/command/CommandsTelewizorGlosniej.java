package pl.sternik.pb.command;

import pl.sternik.pb.telewizor.*;

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
