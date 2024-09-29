//  Rotate the integer array :

import java.util.Scanner;
class ArrayRotate{
    public void RotArr(int[] num, int r){
        int temp = 0;
        for(int i =1; i <= r; i++){
            for(int j = 0; j < num.length; j++){
            if(j == 0){
               temp = num[j];
            }else if(j == num.length-1 && j != 0){
                num[j-1] = num[num.length-1];
                num[num.length-1] = temp;
            }else{
                num[j-1] = num[j];
        }
    }
}
        for(int i = 0; i <  num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}
public class RotateTheArray {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int [size];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the no. to be rotate: ");
        int d = sc.nextInt();
        ArrayRotate ob = new ArrayRotate();
        ob.RotArr(arr,d);
        sc.close();
    }
}
