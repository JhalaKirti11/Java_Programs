import java.util.*;
public class ListToSet{
    public static void main(String[] args){
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(3,6,7,3,9,5,3,7));
        System.out.println(ar);
        Set<Integer> st = new LinkedHashSet<>(ar);
        System.out.println(st);
    }
}
