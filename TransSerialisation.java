import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TransSerialisation {
    public static void main(String[] args) {
        System.out.println("Start");
        File fl = new File("customer.txt");
        try {
            FileOutputStream fout = new FileOutputStream(fl);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            transientfile c = new transientfile("Nisha", 7387, 25, "9813955...");
            oos.writeObject(c);
            System.out.println("Success");
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream(fl);
            ObjectInputStream ois = new ObjectInputStream(fin);
            transientfile c = (transientfile) ois.readObject();
            System.out.println(c.getName() + " " + c.getId() + " " + c.getAge() + " " + c.getContact());
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End!");
    }
}
