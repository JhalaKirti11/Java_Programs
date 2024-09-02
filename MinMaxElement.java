//  Find minimum and maximum element in a list
import java.util.ArrayList;
import java.util.Arrays;

public class _05MinMaxInArrayList {
    public static void main(String[] args){
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(434,51,1,7,4,9,7,1));
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i : ar){
                if(i<min){
                    min = i;
                }
                if(i>max){
                    max = i;
                }
            }
            System.out.println("min value is: "+min+" max value "+max);
        }
    }
