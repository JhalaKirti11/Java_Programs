@FunctionalInterface
interface LambInterface {
    int sum(int i, int j);

    default void subs(int i, int j) {
        System.out.println(i - j);
    }

    default int mul(int i, int j) {
        return i * j;
    }
}

public class LambdaExpression02 {
    public static void main(String[] marg) {

// in single statement case :
        System.out.println("Single statement lambda expression");
        LambInterface obj = (i, j) -> i + j; // this will work in single statement only;

        int result = obj.sum(5, 9);
        System.out.println("sum is: " + result);

// in multiple statement case :
        LambInterface obj2 = (i, j) -> {
            System.out.println("Multi statement lambda expression:");
            System.out.println("return the sum of i & j ");
            if (i > j) {
                System.out.println(i + " is greater than " + j);
            } else {
                System.out.println("j is: " + j);
            }
            return i + j;
        };

        int result2 = obj2.sum(7, 4);
        System.out.println("sum is " + result2);
    }
}
