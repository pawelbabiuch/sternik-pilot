package pl.sternik.pb.zadania.zad09;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Z09Test {

	@Test
	public void testZamien() throws Exception {

        int[][] tablica = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 1, 2 }, { 3, 4, 5 } };
        int w1 = 1, w2 = 2;
        
        int[][] expected = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 }, { 1, 1, 2 }, { 3, 4, 5 } };
        int[][] actual = Z09.zamien(w1, w2, tablica);
        
        assertThat(actual).isEqualTo(expected);
	}
}
