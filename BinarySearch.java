import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 12, 34, 42, 67, 79, 82, 156 };
        int n = sc.nextInt();
        boolean found = false;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < n) {
                start = mid + 1;
            } else if (arr[mid] > n) {
                end = mid - 1;
            } else {
                System.out.println("Index " + mid);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(n + " found");
        } else {
            System.out.println(n + " not found");
        }
        sc.close();
    }
}
