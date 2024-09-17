//   How do you check if a List contains a specific element?

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class specificElemInList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>(Arrays.asList(36,7,3,9,22,51,2,12));
        int checkElem = sc.nextInt();
        if(l.contains(checkElem)){
            System.out.println(checkElem+" is in the list.");
        }else{
            System.out.println(checkElem+" isn't in the list");
        }
        sc.close();
    }
}
