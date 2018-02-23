package pl.sternik.pb.zadania.zad32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Z32 {

	static String[] tab = {"Slowo 1", "Cos 2", "Iles 3", "Aaa 4", "Bcd 5"};
	
	public static void main(String[] args) {
		
		String[] tab2 = tab.clone();
		System.out.println(wypiszTablice(tab2));
		
		wypiszTabliceSort(tab);
		
		listowanie(new String[]{"Slowo 1", "Cos 2", "Iles 3", "Aaa 4", "Bcd 5"});
	}
	
	static String wypiszTablice(String[] tab) {
		String s = "";
		
		for (int i = 0; i < tab.length; i++) {
			s += tab[i] + " ";
		}
		
		return s.trim();
	}
	
	static void wypiszTabliceSort(String[] tab) {
		Arrays.sort(tab);
		
		for (String string : tab) {
			System.out.println(string);
		}
	}
	
	static void listowanie(String[] tab)
	{
		List<String> list = Arrays.asList(tab);
		Collections.sort(list);
		
		System.out.println("Wyswietlenie listy dla For:");
		for (int i = 0; i < tab.length; i++) {
			String string = tab[i];
			System.out.println(string);
		}
		
		System.out.println("Wyswietlenie listy dla For-each:");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("Wyswietlenie listy dla iteratora:");
		for(Iterator i = list.iterator(); i.hasNext();) {
			String s = (String)i.next();
			System.out.println(s);
		}
	}

}
