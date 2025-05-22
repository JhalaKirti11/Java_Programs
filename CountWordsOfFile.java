import java.io.File;
import java.io.FileInputStream;

public class CountWordsOfFile {
    public static void main(String[] args) {
        int wordCount = 0;
        int charCount = 0;
        try {
            File fl = new File("ReadWriteFile.txt");    // Enter File Path
            FileInputStream fin = new FileInputStream(fl);
            String data = "";
            int x = 0;
            while (true) {
                x = fin.read();
                if (x == -1) {
                    wordCount++;
                    break;
                } else if ((char) x == ' ') {
                    wordCount++;
                } else {
                    charCount++;
                }
                data = data + (char) x;
            }
            double averageWordSize = (double) charCount / wordCount;
            System.out.println(data);
            System.out.println("length of the file is " + data.length());
            System.out.println("Number of words in the file is " + wordCount);
            System.out.println("Average of the word size is " + averageWordSize);
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("End here!");
        }
    }
}
