//  Swapping of two String variable :

import java.util.Scanner;
public class _11SwapStringVar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two string values:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println("Before Swapping: "+str1+" "+str2);
        int l1 = str1.length();
        int l2 = str2.length();

        str1 = str1+str2;
        int newlength = str1.length();

        str2 = str1.substring(0,l1);
        str1 = str1.substring((newlength-l2), newlength);

        System.out.println("After Swapping "+str1+" "+str2);
      
        sc.close();
    }
}
