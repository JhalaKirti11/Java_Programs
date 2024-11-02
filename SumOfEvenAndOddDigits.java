import java.util.Scanner;
public class SumOfEvenAndOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        int i = 0;
        while (n > 0) {
            i = n % 10;
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddSum = oddSum + i;
            }
            n = n / 10;
        }
        System.out.println("Sum of even digits " + evenSum + " & Sum of odd digits: " + oddSum);
        sc.close();
    }
}
