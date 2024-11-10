// Create an array of Squares of the first 5 positive integers.

import java.util.Scanner;
public class ArrayOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many squares want to add to the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int ind = 0;
        for(int i = 1; i <= arr.length; i++){
            int sq = i * i;
            arr[ind] = sq;
            System.out.print(arr[ind]+" ");
            ind++;
        }
        sc.close();
    }
}
