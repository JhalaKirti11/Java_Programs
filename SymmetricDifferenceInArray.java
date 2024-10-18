// Find the symmetric difference between the arrays [1, 2, 3] and [3, 4, 5].

public class SymmetricDifferenceInArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};
        int common = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    common = arr1[i];
                }
            }
        }

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != common){
                System.out.println(arr1[i]);
            }
            if(arr2[i] != common){
                System.out.println(arr2[i]);
            }
        }
    }
}
