// A java program to create, write and read a file and the total number of words in the file.
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

class CreateFile{
    public static void main(String[] args) {
        File fl = new File("Javafile.txt");

// create a file:
        try{
        fl.createNewFile();
        }catch(IOException e){
           System.out.println("Can not create the file.");
        }

// write the file:
        try{
            FileOutputStream fout = new FileOutputStream(fl);
            String data = "Hello friends, have a nice day!";
            byte[] b = data.getBytes();
            fout.write(b);
            fout.close();
        }catch(IOException e){
            e.printStackTrace();
        }

// read the file:
        try{
        FileInputStream fin = new FileInputStream(fl);
        String data = "";
        int count = 0;      // count the words;
            while(true){
                    int x = fin.read();
                if(x ==-1){
                    count++;
                    break;
                }
                else if(x ==' '){
                    count++;
                }
                    data = data+(char)x;
            }
            System.out.println(data);
            System.out.println("no. of words "+ count);
            
            fin.close();
        }catch(IOException e){
            e.printStackTrace();
        }        

    }
}
