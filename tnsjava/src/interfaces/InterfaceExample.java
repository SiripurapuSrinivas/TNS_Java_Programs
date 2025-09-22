package interfaces;

interface phone {
	void call();
	
	void sms();
}
class jio implements phone {
	
	public void call() {
		System.out.println("Jio calls are acceptable");
	}
	
	public void sms()
	{
		System.out.println("Jio sms are acceptable");
	}
	
}
class samsung implements phone{
	public void call() {
		System.out.println("Samsung calls are acceptable");
	}
	
	public void sms()
	{
		System.out.println("Samsung sms are acceptable");
	}
}
public interface InterfaceExample {
	public static void main(String[] args) {
		jio j = new jio();
		j.call();
		j.sms();
		
		samsung sm = new samsung();
		sm.call();
		sm.sms();

	}

}

