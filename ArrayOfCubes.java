// Create an array of the Cubes of the first 5 positive integers.

import java.util.Scanner;
public class ArrayOfCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many cubes of numbers want to add to the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int ind = 0;
        for (int i = 1; i <= arr.length; i++) {
            int cube = i * i * i;
            arr[ind] = cube;
            System.out.print(arr[ind]+" ");
        }
        ind++;
        sc.close();
    }
}
