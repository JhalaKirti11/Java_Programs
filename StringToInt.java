import java.util.Scanner;
public class StringToInt {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string: ");
        String num = sc.nextLine();
        int n = 0;
        for(int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);
            n = n * 10 + (ch - '0');
        }
        System.out.println(n);
        sc.close();
    }
}
