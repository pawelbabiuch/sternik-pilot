package pl.sternik.pb.command;

import pl.sternik.pb.telewizor.*;

public class CommandTelewizorPoprzedniKanal implements Command{

	@Override
	public void execute() {
		Telewizor.getInstance().poprzedniKanal();
	}

	@Override
	public String getOpis() {
		return "Telewizor poprzedni kanal";
	}

}
