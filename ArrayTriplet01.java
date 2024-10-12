/* Leet Code Problem: 
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.  */
import java.util.*;
public class ArrayTriplet01 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplet = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k =j+1; k < nums.length; k++){ 
                    if(i!=j && i!= k && j!= k){
                        int sum = 0;
                        sum = nums[i]+ nums[j] + nums[k];
                        if(sum == 0){
                            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                            Collections.sort(list);
                            if(triplet.contains(list)== false)
                            triplet.add(list);
                        }
                    }
                }
            }
        }
        return triplet;
    }
        public static void main(String[] args) {
            int[] arr = {-1,0,1,2,-1,-4,3,-3};
            List<List<Integer>> ar = threeSum(arr);
            System.out.println(ar);
        }
    }
