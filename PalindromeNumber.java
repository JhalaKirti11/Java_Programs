// Check if the entered number is a palindrome nuber or not...

import java.util.Scanner;
public class PalindromeNumber {
    public static int checkPalindrome(int k){
        int palindrome = 0;
        while(k>0){
            int r = k%10;
            palindrome = palindrome*10+r;
            k/=10;
        }
        return palindrome;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int palin = checkPalindrome(n);
        
         if(palin == n){
            System.out.println(n+" is palindrome number.");
        }else{
            System.out.println(n+" is not palindrome number!");
        }
            sc.close();
    }
}
