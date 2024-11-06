import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class FileInputCheckingOccurance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Give an alphabet letter to check if it exists in the file content or not: ");
        char letter = sc.nextLine().charAt(0);
        try{
            File fl = new File("CheckingOccurance.txt");
            FileInputStream fin = new FileInputStream(fl);
            String data = "";
            while(true){
                int x = fin.read();
                    if(x == letter){
                    count++;
                    }
                    if(x==-1){
                    break;
                    }
                data = data+(char)x;
            }
            System.out.println(data);
            if(count > 0){
                System.out.println("number of t "+count);
            }else{
                System.out.println("'t' doesn't occurs in the file");
            }
            fin.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            sc.close();
        }
    }
}
