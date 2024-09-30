//  Convert the Roman numbers into Integer Numbers :

import java.util.HashMap;
import java.util.Scanner;

    public class RomanToInt {
        public static int romTOint(String roman){
         
        HashMap<Character, Integer> m = new HashMap<>();
            m.put('I', 1);
            m.put('V', 5);
            m.put('X', 10);
            m.put('L', 50);
            m.put('C', 100);
            m.put('D', 500);
            m.put('M', 1000);

            int integer = m.get(roman.charAt(roman.length()-1));
            for(int j = roman.length()-2; j>=0; j--){
                if(m.get(roman.charAt(j))< m.get(roman.charAt(j+1))){
                    integer -= m.get(roman.charAt(j));
                }else{
                    integer += m.get(roman.charAt(j));
                }
            }
            return integer;
        }
    
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print ("Enter the roman number: ");
    String roman = sc.nextLine();

    int integer = romTOint(roman);
    System.out.println("Integer form of this Roman number is "+integer);
    sc.close();
    }
}
    
