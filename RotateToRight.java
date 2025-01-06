public class RotateToRight {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int rot = 2;
        for (int i = 1; i <= rot; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
