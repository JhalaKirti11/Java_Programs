import java.util.Scanner;
public class SquareWithDiagonals {
    public static void main(String[] arrgs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
       int n =sc.nextInt();
      
       for(int i = 1; i<=n; i++){
        for(int j = 1; j<=n; j++){
            if(i==1|| j==1||i==n|| j==n||j==i||j==n-i+1){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
       }
    }
}
