import java.util.Scanner;
public class LeapYear {
    public static boolean leapYear(int y) {
        if (y % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Year: ");
        int year = sc.nextInt();
        boolean LP = leapYear(year);
        if (LP) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}
