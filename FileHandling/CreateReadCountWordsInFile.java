import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class CreateFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File fl = new File("Javafile.txt");

        // create a file:
        try {
            fl.createNewFile();
        } catch (IOException e) {
            System.out.println("Can not create the file.");
        }

        // write the file:
        try {
            FileOutputStream fout = new FileOutputStream(fl);
            System.out.println("Enter your content here:");
            String data = sc.nextLine();
            byte[] b = data.getBytes();
            fout.write(b);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

        // read the file to count the number of words in it:
        try {
            FileInputStream fin = new FileInputStream(fl);
            String data = "";
            int count = 0; // count the words;
            while (true) {
                int x = fin.read();
                if (x == -1) {
                    count++;
                    break;
                } else if (x == ' ') {
                    count++;
                }
                data = data + (char) x;
            }
            System.out.println(data);
            System.out.println("no. of words " + count);

            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
