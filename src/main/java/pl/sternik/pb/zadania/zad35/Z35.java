package pl.sternik.pb.zadania.zad35;

import java.util.List;

// W tej paczce wykonane są zadania dla Kolekcji
public class Z35 {
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		
		Employee pracownikA = new Employee("A", "A", 5);
		Employee pracownikB = new Employee("A", "A", 2);
		
		shop.addEmployee(pracownikA);
		
		System.out.println("pracownnikA == pracownikA: " + shop.hasEmployee(pracownikA));
		System.out.println("pracownnikA == pracownikB: " + shop.hasEmployee(pracownikB));
		System.out.println("pracownnikA == newPracownik: " + shop.hasEmployee(new Employee("Inne imie", "Inne nazwisko")));
		
		shop.addEmployee(pracownikB);
		
		// Sortowanie listy pracowników po ID
		List<Employee> pracownicy = shop.getSortedEmployeesByID();
	}
}
