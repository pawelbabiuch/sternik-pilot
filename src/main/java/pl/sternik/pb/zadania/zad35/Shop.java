package pl.sternik.pb.zadania.zad35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

public class Shop {

	List<Employee> pracownicy = new ArrayList();
	Map<Article, Integer> produkty = new HashMap<Article, Integer>();
	
	public Shop() {
		produkty.put(new Article(0, "Mleko", "Karton pleka", 5.35), 15);
		produkty.put(new Article(1, "Woda", "Butelka wody", 1.15), 3);
		produkty.put(new Article(2, "Maslo", "Kostka masla", 5.95), 1);
		produkty.put(new Article(3, "Chleb", "Bochenek chleba", 2.35), 11);
		produkty.put(new Article(4, "Papryka", "1kg", 13.5), 21);
	}
	
	public void addEmployee(Employee employee) {
		pracownicy.add(employee);
	}
	
	public boolean hasEmployee(Employee employee) {
		return pracownicy.contains(employee);
	}
	
	public void addArticle(Article article, int amount) {
		produkty.put(article, amount);
	}
	
	@SuppressWarnings("finally")
	public int getArticleQuantity(Article article) {
		
		int amount = -1;
		
		try {
			if(!produkty.containsKey(article)) throw new Exception("Nie ma podanego produktu o takiej nazwie");
			
			amount = produkty.get(article);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			return amount;
		}
	}
	
	public List<Employee> getSortedEmployeesByID(){
		
		// Pozwoliłem sobie zastować prostą lambdę,
		// dzięki której w prosty sposób możemy posortować pracowników po ich ID
		Collections.sort(pracownicy, (p1, p2) -> p1.getId() - p2.getId());
		return pracownicy;
	}
}
