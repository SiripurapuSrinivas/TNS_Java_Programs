package tnsjava;

class Key{
	final int a = 30;
	static char ch = 'R';
	
}
public class FinalStatic {

	public static void main(String[] args) {
		
		Key k  = new Key();
		System.out.println("Final word: " + k.a);
		System.out.println("Static word: " +Key.ch);
			
		
	}

}
