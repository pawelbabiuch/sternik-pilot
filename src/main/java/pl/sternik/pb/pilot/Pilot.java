package pl.sternik.pb.pilot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import pl.sternik.pb.command.*;
import pl.sternik.pb.menu.MenuDom;
import pl.sternik.pb.menu.MenuPilota;
import pl.sternik.pb.menu.MenuTv;

public class Pilot {

	public final MenuPilota MENU_DOMOWE = new MenuDom(this);
	public final MenuPilota MENU_TV = new MenuTv(this);
	
	MenuPilota stan = MENU_DOMOWE;
	
	
	public Pilot() {
		System.out.println("-----> Rozpoczęcie pracy pilota");
		stan = MENU_DOMOWE;
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
	
	private void wyswietlMenu() {
		stan.wyswietlMenu();
	}
	
	public void przelaczMenu() {
		if (stan == MENU_DOMOWE) {
			stan = MENU_TV;
		} else {
			stan = MENU_DOMOWE;
		}
	}
	
    public void kliknijPrzyciskNr(String numer) {
        Command command = stan.getCommandForKey(numer.toUpperCase());
        System.out.println("Kliknięto: " + numer);
        command.execute();
    }
     
    private static boolean czyWcisnietoZnakWyjscia(String znak) {
        return !(znak.toUpperCase().equals("Z"));
    }

}
