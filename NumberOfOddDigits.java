import java.util.Scanner;
class Digits{
    public void OddDigits(int number){
      int count = 0;
        while(number > 0){
          int r = number%10;
            if(r%2 != 0){
              count++;
            }
        number/=10;
      }
      System.out.println(count);
    }
}
public class NumberOfOddDigits {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:  ");
    int  n = sc.nextInt();
       Digits sd = new Digits();
         sd.OddDigits(n);
          sc.close();
    }
}
