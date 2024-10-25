import java.io.Serializable;
public class ShoppingItem implements Serializable{
    String itemName;
    int price;
    int quantity;
    ShoppingItem(String itemName, int price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    String getItemName(){
        return itemName;
    }
    int getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    } 
}
