package pl.sternik.pb.command.telewizor;

import pl.sternik.pb.command.Command;
import pl.sternik.pb.telewizor.*;

public class CommandTelewizorWlacz implements Command{

	@Override
	public void execute() {
		Telewizor.getInstance().wlacz();
		
	}

	@Override
	public String getOpis() {
		return "Telewizor wlacz";
	}

}
