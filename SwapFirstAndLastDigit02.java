//  swap 1st and last digits of a no.  Approach 2:

import java.util.Scanner;

public class SwapFirstAndLastDigit02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
		    int x = sc.nextInt();
			    System.out.print(x + " -> ");
			    int sign = Integer.signum(x);
			    x *= sign;  // invert negative number if necessary

			    int last = x % 10;
			    int n = x / 10;
			    int s = 0;       // sum for the digits in the middle
			    for (int p = 1; n > 10; n /= 10, last *= 10, p *= 10) {
			        s += p * (n % 10);
			    }
			    System.out.println(sign * (10 * (last + s) + n)); // restore the sign and get swapped digits
        sc.close();
    }
}
