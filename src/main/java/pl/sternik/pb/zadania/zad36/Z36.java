package pl.sternik.pb.zadania.zad36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Z36 {

	static Scanner s = new Scanner(System.in);
	static Sklep sklep = new Sklep();
	
	public static void main(String[] args) {
		System.out.print("Podaj nazwe pliku: ");
		String fileName = s.next();
		
		if(checkExistingFile(fileName)) readEmployess(fileName);
		else							saveEmployess(fileName);
		
		System.out.println("Koniec");
	}
	
	private static boolean checkExistingFile(String fileName) {
		File file = new File(fileName);
		return file.exists();
	}
	
	private static void saveEmployess(String fileName) {
		System.out.println("Zapisywanie pracowników do pliku");
		
		File file = new File(fileName);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			
			for (Pracownik pracownik : sklep.listaPracownikow) {
				bw.write(pracownik.imie + " " + pracownik.nazwisko);
				bw.newLine();
			}
			
			bw.flush();
			
		}catch(Exception e) {
			System.out.println("Wystąpił błąd przy zapisie do pliku.");
		}
	}
	
	private static void readEmployess(String fileName) {
		System.out.println("Odczytywanie pracowników z pliku");

		sklep.listaPracownikow.clear();
		
		File file = new File(fileName);
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String line = br.readLine();
			while(line != null){
				
				String[] split = line.split(" ");
				
				Pracownik pracownik = new Pracownik(split[0], split[1]);
				sklep.listaPracownikow.add(pracownik);
			
				line = br.readLine();
			}
			
		}catch(Exception e) {
			System.out.println("Wystąpił błąd przy odczycie z pliku.");
		}
	}
}
