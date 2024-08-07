import java.util.Scanner;
public class CharReaptedInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int maxCount = 0;
        char maxChar = ' ';
        for(int i =0; i<str.length(); i++){
            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }
        System.out.println("most repeated char is: "+maxChar);
        sc.close();
    }
}
