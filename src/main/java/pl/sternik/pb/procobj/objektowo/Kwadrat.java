package pl.sternik.pb.procobj.objektowo;

public class Kwadrat extends Figura{
	private double bokKwadratu;

	public Kwadrat(double bokKwadratu) {
		this.bokKwadratu = bokKwadratu;
	}
	
	public double getBokKwadratu() {
		return bokKwadratu;
	}


	@Override
	public double obliczPole() {
		return Math.pow(bokKwadratu, 2);
	}

	@Override
	public double obliczObwod() {
		return 4 * bokKwadratu;
	}
}
