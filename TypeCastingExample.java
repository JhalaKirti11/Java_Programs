public class TypeCastingExample {
    public static void main(String[] args) {
        byte x = 123;
        x = x + 4;
        System.out.println("x : " + x);
        //Output => Type mismatch: cannot convert from int to byte
    }
}
