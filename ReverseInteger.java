import java.util.Scanner;
class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();  
        int n = Math.abs(k); 

        int rev = 0;
        while (n > 0) {
            int r = n % 10;
          
            if (rev > (Integer.MAX_VALUE - r) / 10) {
                System.out.println(0);  
                return;
            }
            rev = rev * 10 + r;
            n /= 10;
        }

        // Restore the sign
        if (k < 0) {
            rev = -rev;
        }
        
        System.out.println(rev);
        sc.close();
    }
}

