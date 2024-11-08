package Assignment01;
import java.util.Scanner;

public class YoungestPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of 3 people:");
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();

        if(p1<p2 && p1<p3){
            System.out.println("first person is youngest!");
        }else if(p2<p1 && p2<p3){
            System.out.println("seciond person is youngest!");
        }else{
            System.out.println("third person is youngest!");
        }
        sc.close();
    }
}
