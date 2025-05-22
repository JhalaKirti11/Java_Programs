import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class CheckLetterExistsInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Give an alphabet letter to check if it exists in the file content or not: ");
        char letter = sc.nextLine().charAt(0);
        try {
            File fl = new File("ReadWriteFile.txt"); // Enter File Path
            FileInputStream fin = new FileInputStream(fl);
            String data = "";
            while (true) {
                int x = fin.read();
                if (x == letter) {
                    count++;
                }
                if (x == -1) {
                    break;
                }
                data = data + (char) x;
            }
            System.out.println(data);
            if (count > 0) {
                System.out.println(letter+ " Exists : " + count+" times");
            } else {
                System.out.println(letter + " doesn't occurs in the file");
            }
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
