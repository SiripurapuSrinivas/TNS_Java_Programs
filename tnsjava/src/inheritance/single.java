package inheritance;

class A {
    public void show() {
        System.out.println("This is Base class");
    }
}

class B extends A {
    public void display() {
        System.out.println("This is Derived class");
    }
}

public class single {
    public static void main(String[] args) {
        B b = new B();
        b.show();     // From base class
        b.display();  // From derived class
    }
} 