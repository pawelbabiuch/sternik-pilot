package pl.sternik.pb.zadania.zad10;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Z10Test {

	@Test
	public void testLicz() throws Exception {
		int[] l1 = {1,2,6,3,5};
		int[] l2 = {2,1,2,2,5};
		char[] znak = {'+', '-', '/', '*', 'x'};
		int[] out = {3, 1, 3, 6, 10};
		
		for (int i = 0; i < out.length; i++) {
			int wynik = Z10.licz(l1[i], l2[i], znak[i]);
			assertThat(wynik).isEqualTo(out[i]);
		}
	}
	
	@Test
	public void testDziel0() throws Exception {
		int[] l1 = {-1,200,-26};
		int[] l2 = {0,0,0};
		char[] znak = {'/', '/', '/'};
		int out = Integer.MIN_VALUE;
		
		for (int i = 0; i < l1.length; i++) {
			int wynik = Z10.licz(l1[i], l2[i], znak[i]);
			assertThat(wynik).isEqualTo(out);
		}
	}
}
