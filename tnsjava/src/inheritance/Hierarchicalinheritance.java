package inheritance;

class Parent1 {
    public void showParent1() {
        System.out.println("Raju is parent");
    }
}

class Son1 extends Parent1 {
    public void showSon() {
        System.out.println("Ramesh is Raju's son");
    }
}

class Daughter1 extends Parent1 {
    public void showDaughter() {
        System.out.println("Ramya is Raju's daughter");
    }
}

public class Hierarchicalinheritance {
    public static void main(String[] args) {
        
        Son1 s = new Son1();
        s.showParent1();      
        s.showSon();

        Daughter1 d = new Daughter1();
        d.showDaughter();
    }
}

