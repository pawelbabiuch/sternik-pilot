package pl.sternik.pb.zadania.zad07;

import java.util.Scanner;

public class Z07 {

    public static void main(String[] args) {
        int[] tablica = { 5, 4, 3, 4, 6, 6, 9, 1, 9 };
        Scanner input = new Scanner(System.in);

        Z07 z07 = new Z07();

        z07.findWithScanner(tablica, input);

        input.close();
    }

    int findWithScanner(int[] tablica, Scanner input) {
        System.out.print("Podaj liczbę X: ");
        int x = input.nextInt();
        x = (int) x;

        int tmp = znajdzPodzielnaWhile(tablica, x);

        if (tmp > -1) {
            System.out.println("Liczba " + tablica[tmp] + " jest podzielna przez " + x + " i znajduje się na pozycji " + tmp);
        } else {
            System.out.println("Brak liczby podzielnej");
        }
        return tmp;
    }

    public static int znajdzPodzielna(int[] tablica, int dzielnik) {
    	
    	if(dzielnik != 0)
    	{
            for (int i = 0; i < tablica.length; i++) {
                if (tablica[i] % dzielnik == 0) {
                    return i;
                }
            }
    	}
    	
        return -1;
    }

    public int znajdzPodzielnaWhile(int[] tablica, int dzielnik) {
    	
    	if(dzielnik == 0) return -1;
    	
        int i = 0;
        while (i < tablica.length && tablica[i] % dzielnik != 0) {
            i++;
        }
        if (i < tablica.length)
            return i;
        else
            return -1;
    }
}
