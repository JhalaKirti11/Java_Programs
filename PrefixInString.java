// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

import java.util.ArrayList;

public class PrefixInString {
    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight", "flownt" };
        String p = null;
        if (str.length == 1) {
            p = str[0];
        }
        ArrayList<String> ar = new ArrayList<>();
        for (int k = 1; k < str.length; k++) {
            String w = "";
            for (int i = 0; i < str[0].length() && i < str[k].length(); i++) {
                if (str[0].charAt(i) == str[k].charAt(i)) {
                    w = w + str[k].charAt(i);
                } else {
                    break;
                }
            }
            ar.add(w);
        }

        int size = Integer.MAX_VALUE;
        for (String a : ar) {
            if (a.length() < size) {
                p = a;
                size = a.length();
            }
        }
        System.out.println("Prefix in the String is: (" + p + ")");
    }
}
