package Assignment01;
import java.util.Scanner;

public class CheckEligibleToSitInExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of classes held: ");
        int totalClasses = sc.nextInt();
        System.out.print("Classes attended: ");
        int attended = sc.nextInt();
        double percentage = ((double) attended / totalClasses) * 100;
        System.out.println("student attend the classes in percentage: " + percentage);

        sc.nextLine();
        System.out.println("on medical leave: Yes/No");
        String sick = sc.nextLine().toLowerCase();
        switch (sick) {
            case "y":
                System.out.println("Allowed to sit");
                break;

            case "n":
                if (percentage < 75) {
                    System.out.println("Not allowed to sit in exam");
                } else {
                    System.out.println("Allowed to sit in exam");
                }
                break;
            default:
                System.out.println("Invalid input!");
        }
        sc.close();
    }
}
