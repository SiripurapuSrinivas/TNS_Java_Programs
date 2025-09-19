package overloadingandoveriding;
public class MethodOverloading {
	public void hello()
	{
		System.out.println("This is 0 parameters");
	}
	public void hello(int a)
	{
		System.out.println("This is single parameter :" +a);
	}
	public void hello(int a,int b)
	{
		System.out.println("This is 2 parameters a: "+a +" b  is : "+b);
	}


	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.hello();
		m.hello(10);
		m.hello(30, 40);
	}
}
	


