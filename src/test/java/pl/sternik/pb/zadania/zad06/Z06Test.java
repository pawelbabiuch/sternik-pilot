package pl.sternik.pb.zadania.zad06;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Z06Test {

	//@Test
	public void testName() throws Exception {
		assertThat(1).isEqualTo(1);
	}

	@Test
	public void testFindMax() throws Exception {
		int[][] values = { { 3, 8, 16 }, { 1, 22, 28, 24 }, { 3 }, { 41, 42 } };
		int expected = 42;
		int actual = Z06.findMax(values);
		
		assertThat(actual).isEqualTo(expected);
		
	}

	@Test
	public void testFindMin() throws Exception {
		int[][] values = { { 3, 8, 16 }, { 1, 22, 28, 24 }, { 3 }, { 41, 42 } };
		int expected = 1;
		int actual = Z06.findMin(values);
		
		assertThat(actual).isEqualTo(expected);
	}

}
