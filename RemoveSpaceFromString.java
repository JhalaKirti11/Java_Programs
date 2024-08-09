import java.util.Scanner;
public class RemoveSpace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // String name = "My name is Mark Mathew.";
    /*
    // Approach 01:
        String str = "";
        for(int i =0; i<name.length();i++){
            if(name.charAt(i)!=' ')
            str = str+name.charAt(i);
        }
        System.out.println(str);
    */

// Approach 02:
        char[] ch = name.toCharArray();
        for(int i = 0; i< ch.length; i++){
            if(ch[i]==' '){
                for(int j = i; j<ch.length-1; j++){
                    char temp = ch[j];
                    ch[j]= ch[j+1];
                    ch[j+1]= temp;
                }
            }   
        }
        for(int i = 0; i<ch.length; i++){
            if(ch[i]==' '){
                break;
            }else{
            System.out.print(ch[i]);
        }
    }
        sc.close();
    }
}
