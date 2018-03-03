package pl.sternik.pb.command;

import pl.sternik.pb.swiatlo.*;

public class CommandSwatloWlacz implements Command{

	@Override
	public void execute() {
		Swiatlo.getInstance().wlacz();
		
	}

	@Override
	public String getOpis() {
		return "Swiatlo wlacz";
	}

}
