import java.util.*;

public class IterateOverTheMap{
    public static void main(String[] args){

//  Iterate over a Map :

        Map<Integer, Integer> m = new HashMap<>();
        m.put(2,4);
        m.put(1,3);
        m.put(3,7);
        m.put(4,6);
        System.out.println(m);
    
// Approach 01 :
        System.out.println("\nApproach 01:  Using entrySet()");
        for(Map.Entry<Integer, Integer> e : m.entrySet()){
            System.out.print("Key: "+e.getKey()+" ");
            System.out.println("Value: "+e.getValue());
        }

// Approach 02 :
        System.out.println("\nApproach 02:  Using keySet()");
            Set<Integer> s = m.keySet();
            for(int k : s){
                System.out.println("Key: "+k+" Value: "+m.get(k));
            }
// Approach 03 :
        System.out.println("\nApproach 03");
            for (int key : m.keySet()) {
                int value = m.get(key);
                    System.out.println(key + " = " + value);
            }

      }
}
