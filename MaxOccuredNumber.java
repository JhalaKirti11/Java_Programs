// Find out the value that have occurred maximum number of times
// and also show number of count. 

public class MaxOccuredNumber {
    public static void main(String[] args) {
        int[] arr = { 32, 22, 45, 22, 85, 22, 78, 22 };
        int k = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        k = arr[i];
                        count++;
                    }
                }
            }
        }
        System.out.println("max no is " + k);
        System.out.println(count);
    }
}
