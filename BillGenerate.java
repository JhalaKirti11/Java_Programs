import java.util.Scanner;

public class BillGenerate {
	public static void main(String[] args){
	System.out.println("Good Morning");System.out.println("What Would You Like To Order?");
	Scanner sc = new Scanner(System.in);
	int snacks = sc.nextInt();
	String choice = "yes";
	int price = 0;
	while(choice=="yes")
	{
		switch (snacks) {
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
		System.out.println("Yes or No");
		choice = sc.next();
		if (choice == "no") {
			break;
		}
	}
	System.out.println("Your total bill is "+(price)+" rs.");
}
