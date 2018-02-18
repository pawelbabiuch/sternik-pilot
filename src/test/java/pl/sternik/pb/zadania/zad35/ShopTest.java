package pl.sternik.pb.zadania.zad35;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import pl.sternik.pb.zadania.zad35.*;


public class ShopTest {

	
	@Test
	public void testHasEmployee() {
		
		Shop shop = new Shop();
		
		Employee e = new Employee("A", "A");
		shop.addEmployee(e);
		
		boolean has = shop.hasEmployee(e);
		
		assertThat(has).isEqualTo(true);
		
	}

	@Test
	public void testNotHasEmployee() {
		
		Shop shop = new Shop();
		
		Employee e = new Employee("A", "A");
		shop.addEmployee(new Employee("B", "B"));
		
		// Pracownicy mają różne imiona, więc nie znajduje podanego pracownika
		boolean has = shop.hasEmployee(e);
		
		assertThat(has).isEqualTo(false);
		
	}
	
	@Test
	public void testGetArticleQuantity() {
		
		Shop shop = new Shop();
		Article article = new Article(1, "Woda", "Butelka wody", 1.15);
		
		int expected = 3;
		int actual = shop.getArticleQuantity(article);
		
		assertThat(actual).isEqualTo(expected);
	}
}
