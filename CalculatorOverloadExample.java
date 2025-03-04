package Inheritance;

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
}
public class CalculatorOverloadExample {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int sum1 = cal.add(15,35);
        int sum2 = cal.add(12,10,50);
        double sum3 = cal.add(25.0,40.25);
        System.out.println("Sum of two integers are : "+sum1);
        System.out.println("Sum of three integers are "+sum2);
        System.out.println("Sum of two double values are "+sum3);
    }
}
