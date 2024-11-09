import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class LinkedListRemoveDuplicates02 {
    public static void main(String[] args) {
        LinkedList<Integer> ar = new LinkedList<>(Arrays.asList(23, 44, 23, 67, 12, 23, 89, 44));
        System.out.println(ar);

        // to remove duplicates convert the list into set:
        HashSet<Integer> hs = new HashSet<>(ar);
        System.out.println("After removing duplicate elements : " + hs);
    }
}
