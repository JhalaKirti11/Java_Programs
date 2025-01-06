import java.util.Collection;
import java.util.ArrayList;
import java.util.*;

public class CollectionExample {
    public static void main(String[] argd) {
        Collection<Integer> intObj = new ArrayList<>();
        intObj.add(4);
        intObj.add(2);
        System.out.println(intObj);

        ArrayList<String> strObj = new ArrayList<>();
        List<Integer> listObj = new ArrayList<>();

        Set<String> setObj = new HashSet<>();
        setObj.add("hello");
        setObj.add("world");
        setObj.add("hii");
        setObj.add("hello");
        System.out.println("HashSet doesn't give output in order but elements cannot be repeateed: " + setObj);

        Set<Integer> setIntObj = new TreeSet<>();
        setIntObj.add(6);
        setIntObj.add(8);
        setIntObj.add(34);
        System.out.println("TreeSet class gives output in order: " + setIntObj);
    }
}
