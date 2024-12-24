public class ReverseString {
    public static void main(String[] args) {
        String s = "a good example";
        String newS = "";
        int in = s.length();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' || i == 0) {
                String a;
                if (i == 0) {
                    a = s.substring(i, in);
                } else {
                    a = s.substring(i + 1, in);
                }
                newS += a + " ";
                in = i;
            }
        }
        newS = newS.trim();
        System.out.println(newS);
    }
}
