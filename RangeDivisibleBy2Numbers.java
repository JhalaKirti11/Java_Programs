// A range of numbers(0-n) and two numbers(x and y) are provided by the user. We have to print the numbers that are divisible by these 2 numbers...

import java.util.Scanner;
class division{
    public void divisibleBy(int x, int range){
        System.out.println("Divisible by "+ x);
        for(int i =1; i <= range; i++){
            if(i%x==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public void divideBy3And5(int x, int y, int range){
        System.out.println("Divisible by "+ x +" and "+ y);
        for(int i = 1; i <= range; i++){
            if(i%x == 0 && i%y == 0){
                System.out.print(i +" ");
            }
        }
    }
}
public class RangeDivisibleBy2Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number: ");
        int n = sc.nextInt();
        System.out.print("Enter 1st no.: ");
        int a = sc.nextInt();;
        System.out.print("Enter 2nd no.: ");
        int b = sc.nextInt();
        division obj = new division();
        obj.divisibleBy(a, n);
        obj.divisibleBy(b, n);
        obj.divideBy3And5(a, b, n);
        sc.close();
    }
}
