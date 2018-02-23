package pl.sternik.pb.procobj.objektowo;

public class Prostokat extends Figura{

	private double bokA, bokB;
	
	public double getBokA() {
		return bokA;
	}

	public double getBokB() {
		return bokB;
	}

	public Prostokat(double bokA, double bokB)
	{
		this.bokA = bokA;
		this.bokB = bokB;
	}
	
	@Override
	public double obliczPole() {
		return bokA * bokB;
	}

	@Override
	public double obliczObwod() {
		return (2* bokA) + (2* bokB);
	}

}
