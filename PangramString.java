public class PangramString {
    public static void main(String[] args) {
        String sen = "The quick brown fox jumps over the lazy dog";
        boolean[] alphabet = new boolean[26];
        int count = 0;

        for (int i = 0; i < sen.length(); i++) {
            char currentChar = sen.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                int index = currentChar - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            } else if (currentChar >= 'A' && currentChar <= 'Z') {
                int index = currentChar - 'A';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
        }

        if (count == 26) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram. Unique letters counted: " + count);
        }
    }
}
