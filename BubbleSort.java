import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int input[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        sc.close();
    }
}
