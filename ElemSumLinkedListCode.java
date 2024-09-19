// Sum of the two corresponding elements of two different LinkedList :

import java.util.Arrays;
import java.util.LinkedList;

public class ElemSumLinkedListCode {

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> l3 = new LinkedList<>();

        l1 = l1.reversed();
        l2 = l2.reversed();

        int k = 0;
        int sum = 0;
        for(int i: l1){
            int h = 0;
            for(int j: l2){
                if(k==h){
                   int e1 = l1.get(k);
                   int e2 = l2.get(h);
                   sum = sum*10+e1+e2;
                   l3.add(e1+e2);
                }
                h++;
            }
            k++;
        }
        l3 = l3.reversed();
        return l3;
    }


    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(3,4,7));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(4,1,8));
        LinkedList<Integer> l3 = addTwoNumbers(l1,l2);
        
        System.out.println("List 1: "+l1);
        System.out.println("List 2: "+l2);
        System.out.println("Sum stored in linkedList : "+l3);
    }
}
