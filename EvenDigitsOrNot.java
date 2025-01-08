import java.util.Scanner;
public class EvenDigitsOrNot {
    public static boolean EvenOddDigit(int num){
        int rem;
        boolean evenDigit = true;
        while(num>0){
            rem = num%10;
            if(rem%2 != 0){
                evenDigit = false;
                break;
            }
            num /=10;
        }
        return evenDigit;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        boolean even = EvenOddDigit(number);
        
        if(even){
            System.out.println("All digits are even");
        }else{
            System.out.println("All digits are not even");
        }
        sc.close();
    }
}
