package pl.sternik.pb.zadania.zad05;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Z05Test {

	@Test
	public void dummyTest() {
		assertThat(1).isEqualTo(1);
	}
	
	@Test
	public void testZrobPetleFor() throws Exception {
		String[] tablica = { "1", "2", "3", "4" };
		String expected = "For\n1234";
		
		String actual = Z05.zrobPetleFor(tablica);
		
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testZrobPetleWhile() throws Exception {
		String[] tablica = { "1", "2", "3", "4" };
		String expected = "While\n1234";
		
		String actual = Z05.zrobPetleWhile(tablica);
		
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testZrobPetleForEach() throws Exception {
		String[] tablica = { "1", "2", "3", "4" };
		String expected = "FOREach\n1234";
		
		String actual = Z05.zrobPetleForEach(tablica);
		
		assertThat(actual).isEqualTo(expected);	}

}
