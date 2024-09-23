import java.util.ArrayList;
public class prefixInString {
    public static void main(String[] args){
        String[] str = {"flower","flow","flight","flownt"};
        String prefix =null;
        if(str.length==1){
            prefix = str[0];
        }
        ArrayList<String> prefixList = new ArrayList<>();

        for(int k = 1; k < str.length; k++){
            String p= "";
        for(int i = 0; i < str[0].length() && i<str[k].length(); i++){
                if(str[0].charAt(i)==str[k].charAt(i)){
                    p = p + str[k].charAt(i);
                }else{
                  break;
                }
        }
        prefixList.add(p);
    }

    int size= Integer.MAX_VALUE;
      for(String a : prefixList){
        if(a.length()<size){
             prefix = a;
             size = a.length();
        }
      }
    System.out.println("Prefix in the String is: ("+prefix+")");
    }
}
