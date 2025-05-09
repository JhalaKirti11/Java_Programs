public class ArrayMedian {
    public double median(int[] ar1, int[] ar2) {
        int size = ar1.length + ar2.length;
        int[] ar3 = new int[size];

        int k = 0;
        for (int i = 0; i < size; i++) {
            if (i < ar1.length) {
                ar3[i] = ar1[i];
            } else {
                ar3[i] = ar2[k];
                k++;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (ar3[j] > ar3[j + 1]) {
                    int temp = ar3[j];
                    ar3[j] = ar3[j + 1];
                    ar3[j + 1] = temp;
                }
            }
        }

// find the median:
        double sum = 0;
        int a = size / 2;
        double median;
        if (size % 2 == 0) {
            for (int i = 0; i < size; i++) {
                System.out.print(ar3[i] + " ");
                if (i == a || i == a - 1) {
                    sum = sum + ar3[i];
                }
            }
            median = sum / 2;
        } else {
            median = ar3[a];
        }
        return median;
    }
}
