import java.util.Scanner;
public class LastWordLength {
    class Solution {
        public static int lengthOfLastWord(String s) {
            int wordLength = 0;
               String[] sArr = s.split(" ");
            for(int i = 0; i< sArr.length; i++){
                if(i == sArr.length-1){
                  char[] cArr = sArr[i].toCharArray();
                  wordLength = cArr.length;
                }
            }
            return wordLength;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String name = sc.nextLine();
        int wordLength = Solution.lengthOfLastWord(name);
        System.out.println("Length of the last Word: "+ wordLength);
        sc.close();
    }
}
