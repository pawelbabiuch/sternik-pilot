package pl.sternik.pb.pilot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import pl.sternik.pb.command.*;

public class Pilot {

	private Map<String, Command> przyciski = new HashMap<>();
	private boolean state = true;
	
	public Pilot() {
			changeState();
    }
	
	public static void main(String[] args) {
			
		Pilot pilot = new Pilot();
        boolean czyDalej = true;
        String wybranyNr = null;
		
        do {
            System.out.println("");

            pilot.wyswietlMenu();
            System.out.print("Wybierz opcję: ");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                wybranyNr = br.readLine();
                System.out.println("");
                pilot.kliknijPrzyciskNr(wybranyNr);
                czyDalej = czyWcisnietoZnakWyjscia(wybranyNr);
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Błędny wybór, spróbuj ponownie");
            }

        } while (czyDalej);
	}
	
	public void changeState() {
		
		przyciski.clear();
		
		if(state) {
			state = false;
	        przyciski.put("1", new CommandSwatloWlacz());
	        przyciski.put("2", new CommandSwiatloWylacz());
	        przyciski.put("3", new CommandGarazOtworz());
	        przyciski.put("4", new CommandGarazZamknij());
	        przyciski.put("5", new CommandWentylatorWlacz());
	        przyciski.put("6", new CommandWentylatorObroty1());
	        przyciski.put("7", new CommandWentylatorObroty2());
	        przyciski.put("8", new CommandWentylatorObroty3());
	        przyciski.put("9", new CommandWentylatorWylacz());
	        przyciski.put("0", new CommandPrzelaczMenu(this));
	    //    przyciski.put("0", new CommandPusty());
	        przyciski.put("Z", new CommandZakoncz());
		}
		else{
			state = true;
			przyciski.put("Z", new CommandZakoncz());
			przyciski.put("0", new CommandPrzelaczMenu(this));
			przyciski.put("1", new CommandTelewizorWlacz());
			przyciski.put("2", new CommandTelewizorWylacz());
			przyciski.put("3", new CommandsTelewizorCiszej());
			przyciski.put("4", new CommandsTelewizorGlosniej());
			przyciski.put("5", new CommandTelewizorNastepnyKanal());
			przyciski.put("6", new CommandTelewizorPoprzedniKanal());
			przyciski.put("7", new CommandTrybKanapowy());
			przyciski.put("8", new CommandWylaczWszystko());
		}
	}
	
    public void kliknijPrzyciskNr(String numer) {
        Command command = getCommandForKey(numer.toUpperCase());
        System.out.println("Kliknięto: " + numer);
        command.execute();
    }
    
    private Command getCommandForKey(String upperCase) {
        return przyciski.get(upperCase);
    }
    
    private static boolean czyWcisnietoZnakWyjscia(String znak) {
        return !(znak.toUpperCase().equals("Z"));
    }
    
    private void wyswietlMenu() {
        System.out.println("------>Menu Pilota<------");
        for (Map.Entry<String, Command> entry : przyciski.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getOpis());
        }
    }
}
