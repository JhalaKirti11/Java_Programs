import java.util.Scanner;

public class CountTheVowels02 {
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        String str2 = str.toLowerCase();
        for (int i = 0; i < str2.length(); i++) {
            if (i == 0 || str2.charAt(i - 1) == ' ') {
                char c = str2.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    count++;
            }
        }
        System.out.println("total vowel words : " + count);
        sc.close();
    }
}
