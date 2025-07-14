
class numbDuplicateException extends RuntimeException {
    numbDuplicateException(String msg) {
        super(msg);
    }
}

class duplicateNumb {
    public void numbDuplicate(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        System.out.println("count " + count);
        try {
            if (count == 0) {
                System.out.println("There is no duplicate number");
            } else {
                throw new numbDuplicateException("there is a duplicate number");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public class DuplicateNumberException {
        public static void main(String[] args) {
            int[] arr = { 23, 45, 12, 87, 65, 45, 33, 98 };
            duplicateNumb DN = new duplicateNumb();
            DN.numbDuplicate(arr);
        }
    }
}
