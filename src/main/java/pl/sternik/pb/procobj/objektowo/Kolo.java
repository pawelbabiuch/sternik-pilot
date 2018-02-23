package pl.sternik.pb.procobj.objektowo;

public class Kolo extends Figura{

	private double obwod;
	
	public double getObwod() {
		return obwod;
	}
	
	public Kolo(double obwod) {
		this.obwod = obwod;
	}

	@Override
	public double obliczPole() {
		return Math.PI * Math.pow(obwod, 2);
	}

	@Override
	public double obliczObwod() {
		return 2 * Math.PI * obwod;
	}

}
