// Sum of all digits of a number:

import java.util.Scanner;
public class AdditionOfDigits{
    public static int digitSum(int n){
    int sum = 0;
    while(n>0){
        int d = n%10;
        sum +=d;
        n/=10;
    }
    return sum;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int numb = sc.nextInt();
        int result = digitSum(numb);
        System.out.println(result);
       sc.close();
    }
}
