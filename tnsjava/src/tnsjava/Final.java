package tnsjava;

class Keys{
	
	public final void show()
	{
		System.out.println("Hello");
	}
}
class Key1 extends Keys{
	public void display()
	{
		System.out.println("Hey man");
	}
	
}
public class Final {

	public static void main(String[] args) {
		
		Keys k = new Keys();
        k.show();
        
        Key1 k1 = new Key1();
        k1.show();     // inherited from parent
        k1.display();  // child’s own method

	}

}