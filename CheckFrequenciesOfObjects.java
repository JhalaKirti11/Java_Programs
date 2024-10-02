import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class CheckFrequenciesOfObjects {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(23,67,67,78,43,23,12,23,67,43,91,23));
        System.out.println(ar);
      
        Map<Integer, Integer> hm = new HashMap<>();    // use HashMap to check frequencies;
        for(int i : ar){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.println("Frequencies of the objects are "+hm);
    }
}
