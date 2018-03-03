package pl.sternik.pb.menu;

import pl.sternik.pb.command.Command;

public interface MenuPilota {

	String getOpis();
	public void wyswietlMenu();
	Command getCommandForKey(String upperCase);
}
