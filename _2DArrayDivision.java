public class _2DArrayDivision {
    public static void main(String[] args) {

        int[][] arr1 = {{4, 7}, {2, 6}};
        int[][] arr2 = {{1, 2}, {3, 4}};
        
        int det = arr2[0][0] * arr2[1][1] - arr2[0][1] * arr2[1][0];
        
        double[][] invArr2 = new double[2][2];
        invArr2[0][0] = arr2[1][1] / (double)det;
        invArr2[0][1] = -arr2[0][1] / (double)det;
        invArr2[1][0] = -arr2[1][0] / (double)det;
        invArr2[1][1] = arr2[0][0] / (double)det;
        
        double[][] result = new double[2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += arr1[i][k] * invArr2[k][j];
                }
            }
        }
        
// Print the matrix :
        System.out.println("Result of Matrix Division (A ÷ B):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
