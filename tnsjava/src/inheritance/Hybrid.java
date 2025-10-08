package inheritance;


	class A1 {
		public void showA() {
			System.out.println("Root class");
		}
	}
	class B1 extends A1 {
		public void showB() {
			System.out.println(" Child class of A ");
		}
	}

	class B2 extends A1 {
		public void showB1() {
			System.out.println(" Child class of A");
		}
	}

	class C1 extends B2 {
		public void showC() {
			System.out.println(" Child class of B1");
		}
	}

	class D extends C1 {
		public void showD() {
			System.out.println(" Child class of C");
		}
	}

	public class Hybrid{

		public static void main(String[] args) {
			
			System.out.println("Hybrid Example:");
			B1 b = new B1();
			b.showA();
			b.showB();
			
			D d = new D();
			d.showB1();
			d.showC();
			d.showD();
			
		}

	}
