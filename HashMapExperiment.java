import java.util.*;

public class HashMapExperiment {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("s1", "rookie");
        hm.put("s2", "kanita");
        hm.put("s5", "kanita");
        hm.put("s3", "saloni");
        hm.put("s4", "riya");

        System.out.println(hm);
        System.out.println("\nhm.containsKey(s2) " + hm.containsKey("s2"));
        System.out.println("hm.containsValue(kanita) " + hm.containsValue("kanita"));
        System.out.println(hm.get("s2"));
        hm.remove("kanita");
        System.out.println("after remove() " + hm);
        hm.put("s3", "nisha");
        System.out.println(hm);

        System.out.println("\nfor:each using lembda expression:");
        hm.forEach((key, value) -> System.out.println("Key is: " + key + " value is: " + value));

        System.out.println("\nfor-each loop ");
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println("Key: " + k + " and value: " + v);
        }
    }
}
