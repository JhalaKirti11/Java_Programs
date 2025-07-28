import java.util.Scanner;

public class ElementInsertion {
    int[] arr = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
    Scanner sc = new Scanner(System.in);
   int p = sc.nextInt();
    for( int j = arr.length - 1; j>=p; j--) {
        arr[j] = arr[j - 1];
        if (j == p) {
            arr[p] = sc.nextInt();
            arr[j] = arr[p];
        }
    }
    for(int i = 0; i<arr.length; i++){
        System.out.print(i+" ");
    }
}
