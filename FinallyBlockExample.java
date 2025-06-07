public class FinallyBlockExample {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            int result1 = arr[2];
            int result2 = arr[5];
            System.out.println("result 1 : " + result1);
            System.out.println("result 2 : " + result2);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally Block Executed.");
            System.out.println("Can't print the result1 and result2 due to the exception!");
        }
    }
}
