//  Calculate compound interest :

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
       double p = sc.nextDouble();
       double r = sc.nextDouble();
       double t = sc.nextDouble();
       //   A = P*(1+ r/100)^t;

  // Approach 1:
       double power = Math.pow((1+r/100), t);
       double amount = p*power;
       double ci = amount-p;

  // Approach 2: double ci = p * Math.pow((1.0+ r/100.0), t)-p;
        
        System.out.println("Total Amount: "+ amount);
        System.out.println(ci);

        sc.close();
    }
}
