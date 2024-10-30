/*
Enter the no. of lines/rows: 5
    *****
      ***
       **
      ***
    *****
 */
import java.util.Scanner;
public class StarPattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines/rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                } else if (i <= n / 2 + 1 && j <= i) {
                    System.out.print(" ");
                } else if (i >= n / 2 + 1 && j <= n - i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
