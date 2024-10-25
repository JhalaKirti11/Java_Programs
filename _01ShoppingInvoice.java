import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class _01ShoppingInvoice {
    public static void main(String[] arg){
        try{
            File fl = new File("Shopping.dat");
            FileInputStream fin = new FileInputStream(fl);  
            ObjectInputStream ois = new ObjectInputStream(fin);
            ShoppingItem sh = (ShoppingItem) ois.readObject();
            ShoppingItem sh2 =(ShoppingItem)ois.readObject();
            ShoppingItem sh3 =(ShoppingItem)ois.readObject();
            System.out.println("item1: "+sh.getItemName()+" "+ sh.getPrice()+" "+ sh.getQuantity());
            System.out.println("item2: "+sh2.getItemName()+" "+sh2.getPrice()+" "+sh2.getQuantity());
            System.out.println("item3: "+sh3.getItemName()+" "+sh3.getPrice()+" "+sh3.getQuantity());
            int itemrate1 = sh.getPrice()*sh.getQuantity();
            int itemRate2 = sh2.getPrice()*sh2.getQuantity();
            int itemRate3 = sh3.getPrice()*sh3.getQuantity();
            int bill = itemrate1+itemRate2+itemRate3;
            System.out.println("total bill: "+ bill);
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
