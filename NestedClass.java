public class NestedClass {
    {
        System.out.println("Outer class instance block");
        // printed 2nd
    }

    NestedClass() {
        System.out.println("Outer class constructor");
        // printed 3rd
    }

    static {
        System.out.println("Outer class static block");
        // printed 1st
    }

    class inner {
        inner() {
            System.out.println("Inner class constructor");
            // printed 5th (last)
        }

        {
            System.out.println("Inner class instance block");
            // printed 4th
        }
    }

    public static void main(String[] args) {
        NestedClass o = new NestedClass();
        NestedClass.inner i = o.new inner();
    }
}
