package pl.sternik.pb.zadania.zad32;

import java.util.ArrayList;
import java.util.Arrays;
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
	//	List<String> list = ArrayList(tab);
	}

}
