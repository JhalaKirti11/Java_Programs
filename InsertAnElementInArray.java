//Inserting an element between two elements of the array without increasing the length of the Array.

import java.util.Scanner;
public class InsertAnElementInArray {
    public static void main(String[] args) {
		int[] arr= {6,1,2,8,3,4,7,10,5};
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index number: ");
		int k = sc.nextInt();
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
		for(int i = arr.length-1; i >= k; i--) {
			arr[i] = arr[i-1];
			if (i == k) {
				arr[k] = n;
				arr[i] = arr[k];
		    }
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
	    }
        sc.close();
    }
}
