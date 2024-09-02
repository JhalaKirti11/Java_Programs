 //find the commomn  element b/w the 2 list:

import java.util.List;
import java.util.Arrays;

public class _07CommonElemIn2List {
    public static void main(String[] args){
        List<Integer> ar1 = Arrays.asList(9,8,5,4,1);
        List<Integer> ar2 = Arrays.asList(3,6,2,8,5);
        for(int i : ar1){
            for(int j : ar2){
                if(i==j){
                    System.out.println("common element: "+ i);
                }
            }
        }
    }  
}
