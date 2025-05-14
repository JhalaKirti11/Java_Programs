import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
class ShoppingListDemo {
    public static void main(String[] args){
        try{
        File fl = new File("Shopping.dat");
        FileOutputStream fout = new FileOutputStream(fl);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        ShoppingItem shop1 = new ShoppingItem("Dress", 1500, 3);
        ShoppingItem shop2 = new ShoppingItem("Shoes", 1000, 2);
        ShoppingItem shop3 = new ShoppingItem("Purse", 3000, 5);
        oos.writeObject(shop1);
        oos.writeObject(shop2);
        oos.writeObject(shop3);
            System.out.println("Shopping done!");
            oos.close();
        }catch(IOException e){
            System.out.println("messge "+e.getMessage());      
          } 
    }
}
