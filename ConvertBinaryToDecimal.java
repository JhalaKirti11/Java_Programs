import java.util.Scanner;
public class ConvertBinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double bi = 0; 
        for(int count = 0; n > 0; count++){
            int r = n%10;
           double power =  r * Math.pow(2,count);
            bi = bi+ power;
            n = n / 10;
        }
    System.out.println(bi);
    sc.close();
    }
}
