// Rotate an array till the number giver by a user:-

import java.util.Scanner;
class RotateAnArray{
    public static void main(String[] args) {
        int[] arr = {23,45,12,98,76,54};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rotation: ");
		int c = sc.nextInt();
			for(int i = 0; i<c;i++) {
			for(int j = 0; j<arr.length-1; j++) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]= temp;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
        sc.close();
    }
}
