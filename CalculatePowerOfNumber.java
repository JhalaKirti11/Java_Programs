// Calculate the power of a number:

import java.util.Scanner;
public class CalculatePowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power ");
        int power = sc.nextInt();
        int result = 1;
        while(power!=0){
            result*=number;
            power--;
        }
        System.out.println("power of "+number+" is "+ result);
        sc.close();
    }
}
