package collections;
// Array list implementing from comparable interface

import java.util.ArrayList;
import java.util.Collections;

class Comp implements Comparable<Comp> {
	private String brand;
	private int price;
	private int ram;
	
	public String getBrand() {
	return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
		}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam() {
		this.ram = ram;
	}

	//@Over ride
	public String toString() {
		return "Comp [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
    }
	
	public Comp(String brand, int price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	public int compareTo(Comp o)
	{
		if(this.getPrice() > o.getPrice())
		{
			return 1;
		}else {
			return -1;
		}
	}
}

public class ComparableInterface {
	public static void main(String args[]) {
		ArrayList<Comp> li = new ArrayList<Comp>();
		li.add(new Comp("dell", 40400, 16));
		li.add(new Comp("hp", 40700, 18));
		li.add(new Comp("asus", 40600, 32));
		
		Collections.sort(li);
		for(Comp l : li)
		{
			System.out.println(l);
		}
	}
}
