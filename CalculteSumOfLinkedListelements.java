/*  LinkedList Program
Create a LinkedList of 5 integers. Calculate and print the sum of all the elements.
 */

import java.util.LinkedList;
import java.util.Arrays;

public class CalculteSumOfLinkedListelements {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>(Arrays.asList(34,65,87,23,90));
        int sum = 0;

        for(int s : ls){
            sum+=s;
        }
        System.out.println("sum: "+sum);
    }
}
