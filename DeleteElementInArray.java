import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
       System.out.print("Enter the position of the element to delete from the array: ");
		int del = sc.nextInt();
			for(int i = del-1; i<arr.length-1; i++) {
				arr[i]= arr[i+1];
			}	
		for(int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] +" ");
		}
        sc.close();
    }
}
