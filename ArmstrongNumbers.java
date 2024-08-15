import java.util.Scanner;
class armsNumbs{
    public void armstrongNum(int numb){
        System.out.print("Armstrong numbers from 1 to "+numb+" are ");
        for(int i = 1; i <= numb; i++){

// count the number of digits
            int k = i;
            int countDig = 0;
        while(k>0){
            countDig++;
            k/=10;
        }

// now check is the numberr(i) an armstrong number or not:
        int n = i;
        int sum = 0;
    while(n>0){
        int reminder = n%10;
        int power = (int)( Math.pow(reminder, countDig));
        sum = sum + power;
            n/=10;
    }
// if the number if equal to sum;
            if(i==sum){
            System.out.print(i+" ");
            }
        }
    }
}

public class _7ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range from 1 to ");
        int n = sc.nextInt();
        armsNumbs ob = new armsNumbs();
        ob.armstrongNum(n);
        sc.close();
    }
}
