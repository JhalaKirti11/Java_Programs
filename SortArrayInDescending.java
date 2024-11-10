// Sort the array in descending order

import java.util.Scanner;
public class SortArrayInDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the Array:");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.err.println("sorted array in descending order: ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length ; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        sc.close();
    }
}
