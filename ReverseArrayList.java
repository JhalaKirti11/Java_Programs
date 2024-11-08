import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 list Elements:");
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            al.add(sc.nextInt());
        }
        System.out.println(al.reversed());
        sc.close();
    }
}
