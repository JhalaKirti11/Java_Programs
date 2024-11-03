import java.io.File;
import java.io.FileNotFoundException;

class FileIsEmptyException extends Exception {
    FileIsEmptyException() {
        super("File is Empty");
    }
}

class FileFound {
    void checkFile() throws FileNotFoundException {
        File ob = new File("xyz.txt");
        try {
            if (ob.length() == 0) {
                throw new FileIsEmptyException();
            } else {
                System.out.println(ob.length());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }
}

public class UserDefineException {
    public static void main(String[] args) {
        FileFound ob = new FileFound();
        try {
            ob.checkFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            System.out.println("Ends here");
        }
    }
}
