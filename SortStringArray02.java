// Sort String Array:  Approach 02:

public class SortStringArray02 {
    public static void main(String[] ar){
        String[] name = {"banana","mango","apple","grapes"};
        for(int i = 0; i< name.length; i++){
            for(int j = 0; j<name.length-1; j++){
                if(name[j].charAt(0)>name[j+1].charAt(0)){
                    String temp = name[j];
                    name[j]= name[j+1];
                    name[j+1]= temp;
                }
            }
        }
        for(int i = 0; i<name.length; i++){
            System.out.print(name[i]+" ");
        }
    }
}
