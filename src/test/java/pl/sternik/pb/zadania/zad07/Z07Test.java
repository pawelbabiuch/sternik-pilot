package pl.sternik.pb.zadania.zad07;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Z07Test {

	@Test
	public void testZnajdzPodzielna() throws Exception {
        int[] tablica = { 5, 4, 3, 4, 6, 6, 9, 1, 9 };
        int dzielnik = 0;
        //int dzielnik = 5;
        
        int excepted = -1;
      //  int excepted = 0;
        int actual = Z07.znajdzPodzielna(tablica, dzielnik);
        
        assertThat(actual).isEqualTo(excepted);
	}

}
