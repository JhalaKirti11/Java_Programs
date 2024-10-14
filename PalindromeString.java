import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = sc.nextLine();
        boolean k = true;
        for(int i = 0; i< str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i - 1)){
                k=false;
                break;
            }
        }
        if(k){
            System.out.println(str+" is a palindrome.");
        }else{
            System.out.println(str+" is not a palindrome.");
        }
        sc.close();
    }
}
