package pl.sternik.pb.zadania.zad35;

import java.io.FileNotFoundException;
import java.util.Date;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import org.mockito.cglib.core.Local;

// Jest to uproszczona wersja Article dla zadania 35
public class Article {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	private static Scanner s = new Scanner(System.in);
	
    private int id;
    private String name;
    private String description;
    private double price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
    }
    
    public Article(int id, String name, String description, double price) {
        try{
            this.id = id;
            this.name = name;
            this.description = description;
            this.price = price;
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}