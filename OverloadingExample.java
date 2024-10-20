import java.util.Scanner;
class MethodOverloading{
    double meter;
    double overloading(double meter){
        this.meter = meter*0.0254;
        System.out.println("double method");
        return this.meter;
    }
    int overloading(int meter){
         meter = (int)(meter*0.0254);
        System.out.println("int method");
        return meter;
    }
}

public class OverloadingExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double in = sc.nextDouble();
        MethodOverloading ob = new MethodOverloading();
        double result = ob.overloading(in);
        System.out.println(result);
        System.out.println(ob.meter);
        sc.close();
    }
}
