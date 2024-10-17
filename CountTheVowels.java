import java.util.Scanner;
public class CountTheVowels {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = sc.nextLine();
        word = word.toLowerCase();
        for(int j = 0; j< word.length(); j++){
            char letter= word.charAt(j);
                switch (letter){
                    case'a':
                    case'e':
                    case'i':
                    case'o':
                    case'u':
                        count++;
                }
        }
        System.out.println("Number of vowels in the string: "+count);
        sc.close();
    }
}
