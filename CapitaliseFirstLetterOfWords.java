// Capitalise first letter of each word in a String:

import java.util.Scanner;
public class CapitaliseFirstLetterOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = sc.nextLine();
        for(int i = 0; i<str.length(); i++){
            String firstPart = str.substring(0,i);
            String letter = str.substring(i, i+1);
            if(i==0 || str.charAt(i-1)==' '){
                letter= letter.toUpperCase();
            }
            String secondPart = str.substring(i+1);
        
        str = firstPart+letter+secondPart;
        }
        System.out.println("After capitalising: "+str);
        sc.close();
    }
}
