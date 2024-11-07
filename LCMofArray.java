public class LCMofArray {
    public static long lcmOfArrayElements(int[] element_array) {
        long lcm = 1;
        int divisor = 2;

        while (true) {
            int counter = 0;
            boolean divisible = false;

            for (int i = 0; i < element_array.length; i++) {
                // LCM of any number with 0 is 0
                if (element_array[i] == 0) {
                    return 0;
                } 
                // Convert negative numbers to positive
                else if (element_array[i] < 0) {
                    element_array[i] = element_array[i] * (-1);
                }

                // Count how many elements are 1
                if (element_array[i] == 1) {
                    counter++;
                }

                // Divide element_array by divisor if divisible
                if (element_array[i] % divisor == 0) {
                    divisible = true;
                    element_array[i] = element_array[i] / divisor;
                }
            }

            if (divisible) {
                lcm = lcm * divisor;
            }else {
                divisor++;
            }
            if (counter == element_array.length) {
                return lcm;
            }
        }
    }

    public static void main(String[] args) {
        int[] element_array = {2, 7, 3, 9, 4};
        System.out.println(lcmOfArrayElements(element_array));
    }
}
