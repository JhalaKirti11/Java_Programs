class NegativeNumberExp extends Exception {
    NegativeNumberExp() {
        super("Negative number found in the list of Numbers");
    }
}

class NumberCheck {
    void check(int arr[]) throws NegativeNumberExp {
        for (int x : arr) {
            if (x < 0) {
                throw new NegativeNumberExp();
            } else {
                System.out.println("Number is Positive");
            }
        }
    }
}

public class NeativeNumberException {
    public static void main(String[] args) {
        NumberCheck ob = new NumberCheck();
        int ar[] = { 3, 5, 7, -9, 8, 9 };
        try {
            ob.check(ar);
        } catch (NegativeNumberExp e) {
            e.printStackTrace();
        }
    }
}
