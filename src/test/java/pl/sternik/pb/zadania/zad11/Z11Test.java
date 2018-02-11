package pl.sternik.pb.zadania.zad11;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Z11Test {

	@Test
	public void testMain() throws Exception {
		
		Stan s = Stan.REALIZOWANE;
		String[] expected = {"REALIZOWANE", "Pilne"};
		String[] actual = Z11.checkOut(s);
		
		assertThat(actual).isEqualTo(expected);
	}

}
