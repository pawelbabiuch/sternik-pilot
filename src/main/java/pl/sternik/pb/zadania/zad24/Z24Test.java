package pl.sternik.pb.zadania.zad24;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Z24Test {

    @Test
    public void testDzieleniePrzez0() {
       int i = 1;
       int j = 0;
       
       String expected = "/ by zero";
       String actual = Z24.podziel(i, j);

       assertThat(actual).contains(expected);
    }
    
    @Test
    public void testDzielenie() {
       int i = 4;
       int j = 2;
       
       String expected = "2";
       String actual = Z24.podziel(i, j);

       assertThat(actual).contains(expected);
    }

	@Test
	public void testDajElement() throws Exception {
		
		int id = 19;
		
		int expected = -1;
		int actual = Z24.dajElement(id);		
		assertThat(actual).isEqualTo(-1);
	}

	@Test
	public void testDajElement2() throws Exception {
		
		int id = 1;
		
		int expected = -1;
		int actual = Z24.dajElement(id);		
		assertThat(actual).isEqualTo(2);
	}

}