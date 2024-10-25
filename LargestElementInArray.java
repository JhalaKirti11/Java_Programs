import java.util.Scanner;
public class LargestElementInArray{
    public static int largestElement(int[] arr){
        int max = arr[0];
        for(int i =0;i <arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = largestElement(arr);
        System.out.println("Largest element in array is "+max);
        sc.close();
    }
}
