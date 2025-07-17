import java.io.FileInputStream;
import java.io.FileNotFoundException;

class fileError {
    void checkFile() throws FileNotFoundException {
        FileInputStream ob = new FileInputStream("z://zyx.txt");
    }
}

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        fileError ob = new fileError();
        try {
            ob.checkFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
