public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num = num * 10 + digits[i];
        }
        num++;
        for (int i = 0; num > 0; i++) {
            int d = num % 10;
            result[result.length - 1 - i] = d;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 9,8,7,9 };
        int[] result = plusOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
