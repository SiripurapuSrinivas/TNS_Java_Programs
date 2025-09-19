package tnsjava;

public class TypeConvertions {

	public static void main(String[] args) {
		int a = 10;
		float inp = a;
		byte exp = (byte)a;
		System.out.println("Implicit conversion: " + inp);
		System.out.println("Explicit conversion: " + exp);
	}

}