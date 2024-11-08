import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 list Elements:");
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("Sorted list:");
        System.out.print("Ascending order: ");
        al.sort(null);                         // Ascending order(by default)
        System.out.println(al);

        System.out.print("Descending order: ");
        al.sort(Comparator.reverseOrder());   // descending order(custom order)
        System.out.println(al);
        sc.close();
    }
}
