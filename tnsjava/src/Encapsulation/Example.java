package Encapsulation;

import java.util.ArrayList;
import java.util.LinkedList;

class Prg1 {

	protected String color = "Black";
	int seats = 6;
	String company = "Benz";
	
	public void start()
	{
		int a=10;
		System.out.println("The car has started");
	}
	void stop()
	{
		System.out.println("The car has stopped");
	}

}
class Hello extends Prg1{
	
	void show()
	{
		System.out.println(color);
	}
}
public class Example {
public static void main(String[] args) {
		
		Prg1 obj = new Prg1();
		System.out.println(obj.color);
		System.out.println(obj.seats);
		System.out.println(obj.company);
		obj.start();
		obj.stop();
		
		ArrayList li = new ArrayList();
		li.add("Hii");
		

	}


}
