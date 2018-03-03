package pl.sternik.pb.command;

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
