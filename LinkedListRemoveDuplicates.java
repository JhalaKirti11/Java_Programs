// Removing duplicte elements from LinkedList : Approach 01

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class LinkedListRemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> ar = new LinkedList<>(Arrays.asList(23, 44, 23, 67, 12, 23, 89, 44));
        System.out.println(ar);
        ArrayList<Integer> newlist = new ArrayList<>();
        for (int i : ar) {
            if (!newlist.contains(i)) { 
                newlist.add(i);
            }
        }
        System.out.println("After removing duplicacy : " + newlist);
    }
}
