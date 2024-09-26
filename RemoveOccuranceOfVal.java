import java.util.Scanner;
public class RemoveOccuranceOfVal {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
            int size = sc.nextInt();

        System.out.println("Enter the elements of the Array: ");
            int[] arr = new int[size];
                for(int i = 0; i<size; i++){
                  arr[i] = sc.nextInt();
                }

        System.out.print("Enter a specific number to chheck wether is occures in the array or not : ");
            int val = sc.nextInt();

        // remove val :
            int k=0;
            for(int i = 0; i<arr.length;i++){
                for(int j = 0; j<arr.length;j++){
                  if(arr[i]!=val){
                      int temp= arr[i];
                      arr[i] = arr[j];
                      arr[j]= temp;
                  }
                }
            }
       
        for(int i = 0; i<arr.length;i++){
            if(arr[i]== val){
                k++;
            }
        }
        System.out.println(val+" occures "+k+" times in the Array!");
    }
}
