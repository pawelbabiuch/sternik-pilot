package pl.sternik.pb.zadania.zad37;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Z37 {

	static double[] randomNumbers = new double[10];
	
	public static void main(String[] args) {
		String fileName = "randomNumbers.txt";
		
		saveToFile(fileName);
		readFromFile(fileName);
	}
	
	static void saveToFile(String fileName) {
		losujLiczby();
		
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))){
		
			for (int i = 0; i < randomNumbers.length; i++) {
				out.writeDouble(randomNumbers[i]);
				out.writeChar('\n');
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void readFromFile(String fileName) {
		randomNumbers = new double[10];
		
		try (DataInputStream in = new DataInputStream(new FileInputStream(fileName))){
			
			for (int i = 0; i < randomNumbers.length; i++) {
				randomNumbers[i] = in.readDouble();
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		wypiszLiczby();
	}

	static void wypiszLiczby() {
		for (int i = 0; i < randomNumbers.length; i++) {
			System.err.println(randomNumbers[i]);
		}
	}
	
	static void losujLiczby() {
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = Math.random() * 10;
		}
	}
}
