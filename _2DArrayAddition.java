public class _2DArrayAddition {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{5, 6}, {7, 8}};
        
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            System.out.println("Matrices cannot be added. They must have the same dimensions.");
            return;
        }

        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

// Print the resulting matrix
        System.out.println("Resulting Matrix after Addition:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
