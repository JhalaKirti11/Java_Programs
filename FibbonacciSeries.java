import java.util.Scanner;

// function for fibonacci numbers...
public class FibbonacciSeries{
    public static boolean checkMember(int n){
        int num1 = 0;
        int num2 = 1;
        while(num1 <= n) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            if(num1 == n) {
                return true;
            }
        }
                return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = checkMember(n);
        System.out.println(ans);
            sc.close();	
    }
}
