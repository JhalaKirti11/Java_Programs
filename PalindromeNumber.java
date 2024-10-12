// Check if the entered number is a palindrome nuber or not...

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int t = n;
        int sum = 0;
        while(t>0){
          int r = t%10;
          sum = sum*10+r;
          t/=10;
        }
        
        if(sum==n){
          System.out.println(n+" is a palindrome number!");
        }else{
          System.out.println(n+" is not a palindrome number!");
        }
          sc.close();
    }
}
