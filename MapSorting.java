import java.util.*;

// Approach 01:

public class _12SortMap {
    public static void main(String[] args){
        Map<Integer, Integer> m = new HashMap<>();
        m.put(54,3);
        m.put(3,4);
        m.put(12,93);
        m.put(73,2);
        m.put(74,24);
        m.put(4,3);

List<Map.Entry<Integer,Integer>> e = new ArrayList<>(m.entrySet());

        
//  Sorted by key :
        System.out.println("Sorted By Keys:");
            e.sort(Map.Entry.comparingByKey());
                System.out.print(e+" ");


//  Sorted by values :
        System.out.println("\nSorted By Values:");
            e.sort(Map.Entry.comparingByValue());
                System.out.print(e+" "); 

    }
}
