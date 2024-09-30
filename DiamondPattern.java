import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number of rows: ");
        int n = sc.nextInt();

    // Divide the diamond pattern in two parts, upper and lower :
        int k = n/2+1;
        for(int i = 1 ; i<= k; i++){
            for(int j = 1; j<=k-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int p = n-k;        
        for(int i =1; i<=p; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*(p-i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}
