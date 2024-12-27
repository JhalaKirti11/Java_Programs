class SortStringArray03 {
    public static void main(String[] ar){
        String[] name = {"banana","papaya", "pineapple", "Mango","apple","grapes"};
        for(int i = 0; i< name.length; i++){
            for(int j = 0; j < name.length-1; j++){
                String s1 = name[j].toLowerCase();
                String s2 = name[j+1].toLowerCase();
                if(s1.charAt(0)>s2.charAt(0)){
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
