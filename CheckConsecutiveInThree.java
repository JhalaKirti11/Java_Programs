import java.util.Scanner;

public class CheckConsecutiveInThree {
    public static boolean checkConsecutiveNumber(int x, int y, int z) {
        boolean consecuteNum = true;
        if (x == y - 1 && y == z - 1) {
            return consecuteNum;
        } else {
            consecuteNum = false;
            return consecuteNum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean cons = checkConsecutiveNumber(a, b, c);

        if (cons) {
            System.out.println("These are consecutive numbers.");
        } else {
            System.out.println("These are not consecutive numbers.");
        }
        sc.close();
    }
}
