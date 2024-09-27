import java.util.Scanner;
public class SathiyaPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any odd number of lines: \n");
        int n = sc.nextInt();
        int k = n/2+1;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=n; j++){
                if(i==k|| j==k|| (i==1&&j>k)|| (j==1&& i<k)||(i==n && j<k)||(j==n&& i>k)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
