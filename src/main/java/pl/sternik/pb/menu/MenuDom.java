package pl.sternik.pb.menu;

import java.util.Map;
import java.util.TreeMap;

import pl.sternik.pb.command.*;
import pl.sternik.pb.command.garaz.*;
import pl.sternik.pb.command.swiatlo.*;
import pl.sternik.pb.command.wentylator.*;
import pl.sternik.pb.pilot.Pilot;

public class MenuDom  implements MenuPilota{

	private Map<String, Command> przyciski = new TreeMap<String, Command>();
	private Pilot pilot;
	
	public MenuDom(Pilot pilot) {
		this.pilot = pilot;
        przyciski.put("1", new CommandSwatloWlacz());
        przyciski.put("2", new CommandSwiatloWylacz());
        przyciski.put("3", new CommandGarazOtworz());
        przyciski.put("4", new CommandGarazZamknij());
        przyciski.put("5", new CommandWentylatorWlacz());
        przyciski.put("6", new CommandWentylatorObroty1());
        przyciski.put("7", new CommandWentylatorObroty2());
        przyciski.put("8", new CommandWentylatorObroty3());
        przyciski.put("9", new CommandWentylatorWylacz());
        przyciski.put("0", new CommandPrzelaczMenu(pilot));
    //    przyciski.put("0", new CommandPusty());
        przyciski.put("Z", new CommandZakoncz());
	}
	
	@Override
	public String getOpis() {
		return "Menu Dom";
	}

	@Override
	public void wyswietlMenu() {
		System.out.println("------>Menu Dom<------");
		for (Map.Entry<String, Command> entry : przyciski.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue().getOpis());
		}
		
	}

	@Override
	public Command getCommandForKey(String command) {
		return przyciski.get(command);
	}

}
