import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputCheckingOccurance {
    public static void main(String[] arg){
        try{
            File fileObj = new File("ReadWriteFile.txt");
            FileOutputStream fout = new FileOutputStream(fileObj);
            String data ="java is an object oriented programing language and it is plateform independent";
            byte b [] = data.getBytes();
            fout.write(b);
            System.out.println("success");
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
        File fileObj = new File("CheckOccurance.txt");
        FileInputStream fin = new FileInputStream(fileObj);
        String data = "";
            while(true){
                int x = fin.read();
                if(x==-1){
                    break;
                }
                    data = data+(char)x;  
            }
                System.out.println(data);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("End!");
    }
}
