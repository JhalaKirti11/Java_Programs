public class IntegerTypeCastingExample {
    public static void main(String[] args) {
        int a;
        a = 2147483647;
        a = a + 1;
        System.out.println("a : " + a);     //  x : -2147483648
    }
}
