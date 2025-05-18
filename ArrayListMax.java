import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 list Elements:");
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            al.add(sc.nextInt());
        }
        al.sort(null);
        System.out.println(al);

        System.out.print("The maximum elelment in the list is: ");
        System.out.println((al.get(al.size() - 1)));
        sc.close();
    }
}
