public class _2DArraySubtraction {
    public static void main(String[] args) {

        int[][] arr1 = {{14, 69}, {23, 55}};
        int[][] arr2 = {{25, 46}, {38, 12}};

        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        System.out.println("Resulting Matrix after Subtraction:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
