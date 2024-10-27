import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CustomerSerialisedFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// to write the file
        try {
            FileOutputStream fout = new FileOutputStream("newfile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            System.out.println("Enter name, ID, phoneNo and address:");
            String name = sc.nextLine();
            int ID = sc.nextInt();
            int phoneNo = sc.nextInt();
            sc.nextLine();
            String address = sc.nextLine();
            Customer cob = new Customer(name, ID, phoneNo, address);
            oos.writeObject(cob);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
// to read the file:
        try {
            FileInputStream fin = new FileInputStream("newfile.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Customer cob = (Customer) ois.readObject();

            System.out.println(cob.getName() + " " + cob.getId() + " " + cob.getPhoneNo() + " " + cob.getAddress());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
