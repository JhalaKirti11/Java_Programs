/*  Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].    */

public class FirstLastPosition {
    public static int[] findPosition(int[] arr, int target){
        boolean found = false;
        int[] indcies = new int[2];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]== target){
                indcies[1]= i;
                found = true;
            }
            if(arr[arr.length-1- i] == target){
                indcies[0]= arr.length-1-i;
            }
        }
        if(!found){
            indcies[0] = -1;
            indcies[1] = -1;
        }
        return indcies;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] found = findPosition(arr, target);
       for(int i = 0; i< found.length; i++){
        System.out.println(found[i]);
       }
    }
}
