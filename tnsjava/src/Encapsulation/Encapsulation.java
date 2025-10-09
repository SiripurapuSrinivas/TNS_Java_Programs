package Encapsulation;

class Encapse {

	String color = "blue";
	int seats = 4;
	String company = "TATA";
	
	public void start()
	{
		System.out.println("The car has started");
	}
	 void stop()
	{
		 int b=20;
		System.out.println("The car has stopped");
	}
	

}
public class Encapsulation {
	public static void main(String[] args) {
		
		Encapse ob = new Encapse();
		System.out.println(ob.color);
		System.out.println(ob.seats);
		System.out.println(ob.company);
		
		ob.start();
		ob.stop();

	}

}

