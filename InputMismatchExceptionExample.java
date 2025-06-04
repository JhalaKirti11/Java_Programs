import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year range: ");
        try {
            System.out.print("Start from: ");
            int StartRange = sc.nextInt();
            System.out.print("End to: ");
            int EndRange = sc.nextInt();
            for (int i = StartRange; i <= EndRange; i++) {
                if (i % 4 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("program executed");
            sc.close();
        }
    }
}
