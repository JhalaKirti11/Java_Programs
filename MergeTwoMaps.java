
//  How can you merge two Maps?


import java.util.Map;
import java.util.HashMap;

public class Merge2Maps {
    public static void main(String[] args){

        Map<String,String> h1= new HashMap<>();
        h1.put("i","kirti");
        h1.put("me","preeti");
        h1.put("myself","neha");

        Map<String, String> h2 = new HashMap<>();
        h2.put("you","maya");
        h2.put("we","tara");
        h2.put("they","sita");

        h1.putAll(h2);
        System.out.println("Now h1 and h2 are merged: "+h1);
  }
}
