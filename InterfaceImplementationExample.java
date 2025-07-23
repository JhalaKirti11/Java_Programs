interface walkable {
    void walk();
}

interface swimable {
    void walk(int a);
    void swim();
}

class Duck implements walkable, swimable {
    public void walk(int c) {
        System.out.println("23");
    }

    public void walk() {
        System.out.println("walk");
    }

    public void swim() {
        System.out.println("swim");
    }
}

public class InterfaceImplementationExample {
    public static void main(String[] ae) {
        Duck ob = new Duck();
        ob.swim();
        ob.walk();
    }
}
