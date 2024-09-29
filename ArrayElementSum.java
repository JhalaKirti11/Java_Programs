// Sum of the element in an array :

import java.util.Scanner;
public class ArrayElementSum {
    public static int arraySum(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum = sum + arr[i];
    }
    return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        int add = arraySum(array);
        System.out.println("Sum of the elements: " + add);
        sc.close();
}
}
