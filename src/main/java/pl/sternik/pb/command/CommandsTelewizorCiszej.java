package pl.sternik.pb.command;

import pl.sternik.pb.telewizor.*;

public class CommandsTelewizorCiszej implements Command{

	@Override
	public void execute() {
		Telewizor.getInstance().ciszej();
	}

	@Override
	public String getOpis() {
		return "Telewizor ciszej";
	}

}
