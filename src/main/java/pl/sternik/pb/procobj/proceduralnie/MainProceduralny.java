package pl.sternik.pb.procobj.proceduralnie;

public class MainProceduralny {

	public static void main(String[] args) {
		Prostokat p = new Prostokat(2, 4);
		System.out.print("Prostokąt pole i obwód: ");
		System.out.print(ObliczaniePola.obliczPole(p) + "  ");
		System.out.println(ObliczanieObwodu.obliczObwod(p));

		Kwadrat k = new Kwadrat(2);
		System.out.print("Kwadrat pole i obwód: ");
		System.out.print(ObliczaniePola.obliczPole(k) + "  ");
		System.out.println(ObliczanieObwodu.obliczObwod(k));

		Kolo ko = new Kolo(4);
		System.out.print("Koło pole i obwód: ");
		System.out.print(ObliczaniePola.obliczPole(ko)+ "  ");
		System.out.println(ObliczanieObwodu.obliczObwod(ko));
	}

}
