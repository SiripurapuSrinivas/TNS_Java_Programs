package exceptions;

public class NestedTry {
	public static void main(String[] args) {
		try 
		{
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("The Null values are cannot be read");

		}
		finally {
			System.out.println("This is a nested try,executed successfully");
		}
		}
		catch(Exception e) 
		{
		System.out.println("Outer Catch");
	}

}

}
