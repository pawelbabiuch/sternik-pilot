package pl.sternik.pb.command.telewizor;

import pl.sternik.pb.command.Command;
import pl.sternik.pb.telewizor.*;

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
