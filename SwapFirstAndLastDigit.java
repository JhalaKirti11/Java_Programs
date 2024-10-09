//  swap 1st and last digits of a number using Approach:1:
    
import java.util.Scanner;

public class SwapFirstAndLastDigit01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
		int n = sc.nextInt();
        int temp = n;
        int count=0;		// count the no of digits
        while(temp >0){
            temp/=10;
            count++;
        }
        System.out.println("Number of digits are "+count);
        temp = n;
        int sum = 0;
        int swapDigit = 0;
        int rem = 0;
        int i =1;
        while(temp >0){
             rem = temp%10;
            if(temp==n){
             swapDigit = (int)(rem * Math.pow(10,count-1));
             System.out.println(swapDigit);
            }else if(temp>9){
            sum = sum+rem*i;
        }
            temp/=10;
            i*=10;
    }
        System.out.println(swapDigit+sum +rem);
        sc.close();
    }
}
