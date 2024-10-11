import java.util.Scanner;

public class PlaceYourOrder {
    public static void main(String[] args){
        System.out.println("---:: Good Morning ::---");
        System.out.println("\nWhat Would You Like To Order?");
        System.out.println("1. Tea - 10rs");
        System.out.println("2. Coffee - 20rs");
        System.out.println("3. Cold coffee - 80rs");
        System.out.println("4. Sandwitch - 100rs");
        Scanner sc = new Scanner(System.in);
        int price = 0;
        while(true){
            System.out.print("Enter your order: ");
            int snacks = sc.nextInt();
            switch(snacks){
                case 1:
                System.out.println("Tea");
                price = price + 10;
                break;
                case 2:
                System.out.println("Coffee");
                price = price + 20;
                break;
                case 3:
                System.out.println("Cold Coffee");
                price = price + 80;
                break;
                case 4:
                System.out.println("Sandwich");
                price = price + 100;
                break;
                default:
                System.out.println("Sorry, not available.");
            }
        System.out.println("Thank you! would you like to add anything else to your order?");
        System.out.println("1. Yes or 2. No");
          int p = sc.nextInt();
            if(p == 2){
                break;
            }
        }
        System.out.println("Your total bill is "+ (price) + " rs.");
    sc.close();
    }
}
