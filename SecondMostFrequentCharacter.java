/*
Write a Java program to find the second most frequent 
character in a given string.
Sample Output:
The given string is: successes
The second most frequent char in the string is: c           */

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
         char mostFrequentChar = ' ';
         char secondFrequentChar = ' ';
         int max = 0;
         int max2 = 0;
         String str = "successes";
         for(int i = 0; i < str.length(); i++){
             int count = 0;
           for(int j = 0; j < str.length(); j++){
            if(str.charAt(i) == str.charAt(j)){
                count++;
            }
            if(count > max){
                max = count;
                mostFrequentChar = str.charAt(i);
            }
            if(count > max2 && str.charAt(i) != mostFrequentChar ){
                max2 = count;
                secondFrequentChar = str.charAt(i);
            }
        }    
    }
    System.out.println(secondFrequentChar);
  }
}
