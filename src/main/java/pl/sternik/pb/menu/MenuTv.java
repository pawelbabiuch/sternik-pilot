package pl.sternik.pb.menu;

import java.util.Map;
import java.util.TreeMap;

import pl.sternik.pb.command.*;
import pl.sternik.pb.command.telewizor.*;
import pl.sternik.pb.pilot.Pilot;

public class MenuTv implements MenuPilota {
	
	private Map<String, Command> przyciski = new TreeMap<String, Command>();
	private Pilot pilot;
	
	public MenuTv(Pilot pilot) {
		this.pilot = pilot;
		przyciski.put("Z", new CommandZakoncz());
		przyciski.put("0", new CommandPrzelaczMenu(pilot));
		przyciski.put("1", new CommandTelewizorWlacz());
		przyciski.put("2", new CommandTelewizorWylacz());
		przyciski.put("3", new CommandsTelewizorCiszej());
		przyciski.put("4", new CommandsTelewizorGlosniej());
		przyciski.put("5", new CommandTelewizorNastepnyKanal());
		przyciski.put("6", new CommandTelewizorPoprzedniKanal());
		przyciski.put("7", new CommandTrybKanapowy());
		przyciski.put("8", new CommandWylaczWszystko());
	}
	
	@Override
    public String getOpis() {
        return "Menu TV";
    }

	@Override
	public Command getCommandForKey(String command) {
		return przyciski.get(command);
	}
	
	@Override
	public void wyswietlMenu() {
		System.out.println("------>Menu TV<------");
		for (Map.Entry<String, Command> entry : przyciski.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue().getOpis());
		}
	}
}
