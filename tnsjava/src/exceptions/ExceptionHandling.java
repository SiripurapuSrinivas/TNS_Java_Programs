package exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("The Null values are cannot be read");

		}
		finally {
			System.out.println("This is a exception");

		}

	}

}
