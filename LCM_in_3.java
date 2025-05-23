import java.util.Scanner;

public class LCM_in_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int n = num;
        int qua = 3;
        if (n % qua == 0) {
            while (n > 0 || n % qua != 0) {
                // int r = n%qua;
                System.out.print(qua + " * ");
                n /= 3;
            }
        } else {
            System.out.print("1");
        }
        n /= 3;

        sc.close();
    }
}
