import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class UnionAndIntersectionInSets {
    public static void main(String[] args) {
        
        Set<Integer> hs1 = new HashSet<>(Arrays.asList(23,45,12,87,56,39,61));
        Set<Integer> hs2 = new HashSet<>(Arrays.asList(45,63,92,47,23,61));
        System.out.println(hs1);
        System.out.println(hs2+"\n");

        System.out.println("Union of both set: ");
        Set<Integer> union = new HashSet<>(hs1);
       
        union.addAll(hs2);
        System.out.println(union);

        System.out.println("\nIntersection of both set: ");
        Set<Integer> intersection = new HashSet<>();
        hs1.retainAll(hs2);
        intersection.addAll(hs1);
       
        System.out.println(intersection);
    }
}
