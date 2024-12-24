package Assignment01;

import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get 10% discount over 1000rs cost.");

        System.out.print("Enter the quantity: ");
        int qua = sc.nextInt();
        System.out.print("Enter the price per item: ");
        int price = sc.nextInt();

        int totalCost = 0;
        int dis = 10;
        int perchaseCost = qua * price;

        if (perchaseCost > 1000) {
            totalCost = perchaseCost * (100 - dis) / 100;
        } else {
            totalCost = qua * price;
            System.out.println("No Discount");
        }

        System.out.println("total Cost " + totalCost);
        sc.close();
    }
}
