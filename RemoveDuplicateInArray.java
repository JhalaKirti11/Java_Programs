import java.util.Scanner;
public class RemoveDuplicateInArray {
    public static void main(String[] args){

    // sorted array with duplicate numbers :
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // pass the elements :
        for(int i = 0; i<size; i++){
            arr[i]= sc.nextInt();
        }
            int k = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[k]!=arr[i]){
                k++;
                arr[k]= arr[i];
            }
        }
                k++;
            System.out.println(k);
        
        // Sorted array with no duplicay :
            for(int i = 0; i<k;i++){
                System.out.print(arr[i]+" ");
            }
    }
}
