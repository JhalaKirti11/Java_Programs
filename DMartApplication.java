import java.util.InputMismatchException;
import java.util.Scanner;

//    D-Mart Application

class Reward{
    public String DiscountsOrReward(double purchase,String choice){
        String msg = null;

    switch (choice){
        case "discount":            //choice= discount;
            if(purchase>=10000){
               msg = "free gift";
            }else if(purchase>= 5000 && purchase<10000){
                msg = "30% discount on the total bill amount";
            }
            else if(purchase >=3000 && purchase < 5000) {
                msg = "500rs discount";
             }else{
                msg ="Sorry, No discounts or free gifts are applicable";
             }
        break;

        case "reward":          // choice == reward;
            if(purchase >= 10000 && purchase<15000){
                msg = "Free Mixer";
            }else if(purchase>= 15000){
                msg = "free suitcase";
            }else{
                msg ="Sorry, No discounts or free gifts are applicable";
            }
        break;

        case "nothing":
            msg = "No Reward";
    }
       // System.out.println("the msg is: "+msg);
            return msg;
}
}

public class DMartApplication {
    /*
    If the total purchase amount is ₹3,000 or more but less than ₹5,000, the user gets a flat ₹500 discount.
    If the total purchase amount is ₹5,000 or more but less than ₹10,000, the user gets a 30% discount on the total bill amount.
    If the total purchase amount is ₹10,000 or more, the user gets a free gift:
    Purchase amount between ₹10,000 and ₹15,000: Free mixer.
    Purchase amount of ₹15,000 or more: Free suitcase.
    */
    public static void main(String[] arg){
        System.out.println("Discount and rewards are available for Customer: ");
        System.out.println("Discount: ");
        System.out.println("purchase between 3000 and 5000 = flat 500rs. Discount");
        System.out.println("purchase between 5000 and 10000 = 30% discount on the total purchase");
        System.out.println("purchase is or over 10000 = free gift");
        System.out.println("Reward: ");
        System.out.println("Purchase between 10,000 and 15,000 = free mixer");
        System.out.println("Purchase is or over 15,000 = Free suitcase");

        Scanner sc = new Scanner(System.in);
        String choice;
        Reward RD = new Reward();
        double purchase;

        try{
            System.out.println("Please ensure what you want?");
            System.out.println("Discount, Reward or Nothing");
            choice = sc.nextLine();
            System.out.print("Enter your purchase amount: ");
            purchase= sc.nextDouble();
                String prize = RD.DiscountsOrReward(purchase, choice);
                System.out.println("your reward: "+prize);
            
            
        }catch(InputMismatchException e){
            System.out.println("Invalid purchasse amount. Please check again.");
            e.printStackTrace();
        }
        finally{
            System.out.println("Thank You!");
        }
        sc.close();
}
}
