// A java program to write and read a file "CustomerFile" with the Customer class object:

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class _02SerialisedFile {
    public static void main(String[] args) {
        
// Write the CustomerFile:
          try{
            FileOutputStream fout = new FileOutputStream("CustomerFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            Customer cob = new Customer ("Riya",234,347826,"ashta");
            oos.writeObject(cob);
            oos.close();

        }catch(IOException e){
            e.printStackTrace();
        }
        
// Read the CustomerFile:
        try{
            FileInputStream fin = new FileInputStream("newfile.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Customer cob = (Customer)ois.readObject();
           
            System.out.println(cob.getName()+" "+cob.getId()+" "+cob.getPhoneNo()+" "+ cob.getAddress());
            ois.close();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
