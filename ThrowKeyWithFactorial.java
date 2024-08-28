import java.util.Scanner;

// factorial of a number using recursion. if a negative number enters throw Illegal exception
class IllegalInputException extends Exception{
    IllegalInputException(String msg){
        super(msg);
    }
}

public class ThrowKey {
    public static int factorialNum(int num){
        int fact = 1;
        try{
            if(num <0){
                throw new IllegalInputException("Illegal Input Entered");
            }else if(num==0|| num==1){
              
            }else{
        for(int i =num; i>0;i--){
            fact = fact*i;
        }  
    }
    }catch(Exception e){
        e.printStackTrace();
    }
    return fact;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorialNum(n);  
        System.out.println(fact);
        sc.close();
    }
}
