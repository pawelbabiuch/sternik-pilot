package pl.sternik.pb.command;

import pl.sternik.pb.telewizor.*;

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
