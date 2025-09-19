package inheritance;
class Grandparent {
	public void showGrandparent() {
			System.out.println("Raju is grandparent");
	
}
}
class Parent extends Grandparent {
	public void showParent() {
		System.out.println("Ramesh is son");
}
}
class Child extends Parent {
	public void showChild() {
		System.out.println("Rajesh is child");
}
}
public class multilevel {

	public static void main(String[] args) {
		Grandparent g = new Parent();
		g.showGrandparent();
		
		Parent p = new Parent();
		p.showParent();
		
		Child c = new Child();
		c.showChild();
		
	}

} 
