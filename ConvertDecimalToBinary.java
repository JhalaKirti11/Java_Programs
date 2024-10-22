import java.util.Scanner;
public class ConvertDecimalToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int no = n;
        int num = 0;
        while(no > 0){
            int k = no%2;
            num = (num*10)+k;
            no = no/2;
        }

        int bi = 0;
        for(int p = num; p > 0; p = p/10){
            int k = p%2;
            bi = (bi*10)+k;
        }
        System.out.println("Binary representation of "+ n +" is "+ bi);
        sc.close();
    }
}
