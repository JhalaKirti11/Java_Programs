import java.util.Scanner;
public class CheckPrimeNumber {
    public static boolean primeNumb(int n){
        boolean prime = true;
        if(n==2||n==3){
            return prime;
        }
        if(n<=1||n%2==0||n%3==0){
            prime = false;
        }
            for(int i = 5; i<n/2; i+=6){
                if(n%i==0|| n%(i+2)==0){
                    prime = false;
                }
            }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
            int n = sc.nextInt();
            boolean prime = primeNumb(n);
        if(prime)
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is not prime");
        sc.close();
    }
}
