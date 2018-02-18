package pl.sternik.pb.zadania.zad36;

import java.io.Serializable;

public class Address implements Serializable {
	public String miasto, ulica;
	public int numerDomu;
	
	public String getAddress() {
		return String.format("%s.%s.%s", miasto, ulica, numerDomu);
	}
	
	public Address() {
		this.miasto = "";
		this.ulica = "";
		this.numerDomu = -1;
	}
	
	public  Address(String add) {
		String[] address = add.split(".");
		
		this.miasto = address[0];
		this.ulica = address[1];
		this.numerDomu = Integer.parseInt(address[2]);
	}
}
