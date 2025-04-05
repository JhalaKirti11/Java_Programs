public class MaxInOrderedTriplet {
    public static void main(String[] args) {
        int[] arr = { 1000000,1,1000000 };
        int size = arr.length;
        int max = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size-1; j++) {
                for (int k = i + 2; k < size; k++) {
                    int result = (arr[i] - arr[j]) * arr[k];
                    System.out.println("result : "+ result);
                    if (result > max) {
                        max = result;
                        i1 = i;
                        i2 = j;
                        i3 = k;
                    }
                    System.out.println("max : "+  max);
                }
            }
        }
        if (max > 0)
            System.out.println("indcies : " + i1 + " " + i2 + " " + i3 +" = "+ max);
        else
            System.out.println("index : " + 0);
    }
}
