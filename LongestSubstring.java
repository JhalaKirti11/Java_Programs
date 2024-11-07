public class LongestSubstring {
    public static void main(String[] rags) {
        String str = "abcabaabcd";
        String name = "";
        String longestSubstring = "";
        int max = 0;
            for (int i = 0; i < str.length(); i++) {
            name = "";
            for (int j = i; j < str.length(); j++) {
                if (name.indexOf(str.charAt(j)) != -1) {
                    break;
                }
                name += str.charAt(j);
            }
            if (name.length() > max) {
                max = name.length();
                longestSubstring = name;
            }
        }
        System.out.println("Max = " + max + " longestSubstring = " + longestSubstring);
    }
}
