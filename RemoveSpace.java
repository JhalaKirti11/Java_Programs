import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Statement : ");
        String str = sc.nextLine();
        int scount = 0;
        int wcount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                scount++;
                wcount++;
            }
        }
        wcount++;
        System.out.println("spaces: " + scount);
        System.out.println("words " + wcount);

        String st = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                st = st + str.charAt(i);
            }
        }
        System.out.println("statement without space : " + st);
        sc.close();
    }
}
