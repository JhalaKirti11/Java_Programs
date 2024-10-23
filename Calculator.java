import java.util.Scanner;
public class Calculator {
    public static int addition(int x, int y) {
        int c = x + y;
        return c;
    }

    public static int substraction(int x, int y) {
        int s = x - y;
        return s;
    }

    public static int multiplication(int x, int y) {
        int m = x * y;
        return m;
    }

    public static int division(int x, int y) {
        int d = x / y;
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a: ");
            int a = sc.nextInt();
        System.out.print("Enter a number b: ");
            int b = sc.nextInt();
        System.out.print("Addition of a and b is: ");
            int add = addition(a, b);
        System.out.println(add);
        System.out.print("Substraction of a and b is: ");
            int subs = substraction(a, b);
        System.out.println(subs);
        System.out.print("Multiplication of a and b is: ");
            int mult = multiplication(a, b);
        System.out.println(mult);
        System.out.print("Division of a and b is: ");
            int div = division(a, b);
        System.out.println(div);
            sc.close();
    }
}
