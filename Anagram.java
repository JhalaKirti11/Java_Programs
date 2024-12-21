import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String a, String b) {
        boolean res = false;
        if (a.length() != b.length()) {
            res = false;
        } else {
            char[] st1 = a.toCharArray();
            char[] st2 = b.toCharArray();

            for (int i = 0; i < st1.length; i++) {
                for (int j = i + 1; j < st1.length; j++) {
                    if (st1[i] > st1[j]) {
                        char temp = st1[i];
                        st1[i] = st1[j];
                        st1[j] = temp;
                    }
                }
            }

            for (int i = 0; i < st2.length; i++) {
                for (int j = i + 1; j < st2.length; j++) {
                    if (st2[i] > st2[j]) {
                        char temp = st2[i];
                        st2[i] = st2[j];
                        st2[j] = temp;
                    }
                }
            }

            if (Arrays.equals(st1, st2)) {
                res = true;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        boolean res = checkAnagram(a, b);
        System.out.println(a + " and " + b + " are " + res);
    }
}
