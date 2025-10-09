package Abstraction;

abstract class Abstraction {

	public abstract void show();
	
	public void demo()
	{
		System.out.println("This is method");
	}
}
class Abstract1 extends Abstraction{
	
	public void show()
	{
		System.out.println("This is abstract method");
	}
}
public class Abstraction_class {
	public static void main(String[] args) {
		Abstract1 ab = new Abstract1();
		ab.show();
		ab.demo();

	}

}
