class parent {
    String name = "Riya";

    String typeName() {
        System.out.println(name);
        return name;
    }
}

class child extends parent {
    String ident() {
        return "child";
    }
}

public class ExceptionTest01 {

    public static void main(String[] args) {
        try {
            parent p = new child();
            child c = (child) p;
            c.ident();
            c.typeName();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
