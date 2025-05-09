import java.util.Scanner;

class StringVowels extends RuntimeException {
    StringVowels(String msg) {
        super(msg);
    }
}

class ExceptionName {
    public void containVowel(String name) {
        int count = 0;
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            char word = name.charAt(i);
            switch (word) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        try {
            if (count > 0) {
                throw new StringVowels("the String has " + count + " vowels");
            } else {
                System.out.println("there is no vowel");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println(e);

        }
    }
}

public class ExceptionExample1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        ExceptionName ob = new ExceptionName();
        ob.containVowel(name);
    }
}
