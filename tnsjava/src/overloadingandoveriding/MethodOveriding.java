package overloadingandoveriding;

class Remo{
    public void remo()
    {
	System.out.println("This is parent class");
    }
}
class Overiding extends Remo{
    public void remo()
   {
	System.out.println("This is child class");
   }
}

public class MethodOveriding {
	public static void main(String[] args) {

		
		Overiding o = new Overiding();
		o.remo();
		
	}
}