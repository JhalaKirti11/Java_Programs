import java.util.Scanner;

public class MethodsOfString {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = sc.nextLine();

        // create a substring from a string
        String cutName = name.substring(4, name.length());
        System.out.println("substring " + cutName);

        // replace a letter in the string
        String replace = name.replace('a', 'o');
        System.out.println("replace the letter 'a' to 'o': " + replace);

        // convert the string into lowerCase and upperCase
        System.out.println("change into lowerCase: " + name.toLowerCase());
        System.out.println("change into upperCase: " + name.toUpperCase());

        // remove the space
        System.out.println("remove the front and last space: " + name.trim());

        // index of a char: enter the char whose index no. from starting you want:
        int i = name.indexOf(sc.next());
        System.out.println("index of char from front is: " + i);

        // index of a char: enter the char whose index no. from last you want:
        int l = name.lastIndexOf(sc.next());
        System.out.println("index of char from last is: " + l);

        int count = 0;

        // count the vowels in the word
        name = name.toLowerCase();
        for (int j = 0; j < name.length(); j++) {
            char letter = name.charAt(j);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        System.out.println("vowels are: " + count);
        sc.close();
    }
}
