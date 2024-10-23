import java.util.Scanner;
@FunctionalInterface
interface SquareOfNumber{
    int calculate(int a);
}

public class LambdaExpression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        SquareOfNumber sq = (a) ->(a*a);
       System.out.println(sq.calculate(x));
       sc.close();
    }
}
