// Common no. in three different array :-

public class CommonElementInThreeArrays {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 19 };
        int[] arr2 = { 2, 19, 6, 9, 7 };
        int[] arr3 = { 7, 11, 19, 24, 28 };
        System.out.println("Common Elements In All Three Arrays");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr3[k] == arr2[j] && arr2[j] == arr[i]) {
                        System.out.print(arr3[k] + " ");
                    }
                }
            }
        }
    }
}
