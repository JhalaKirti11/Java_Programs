abstract class Abstraction{
    int a = 10;
    int b = 20;
    public abstract double sum(int a, int b);

}
 class Addition extends Abstraction{
// final abstract method of parent can't be override...
    public double sum(int a , int b){
        double sum = a+b;
        //String name = "kirti";
       return sum;
    }
}

public class StaticAbstractExample{
    public static void main(String[] arg){
        Addition ob = new Addition();
        double sum = ob.sum(20,30);
        System.out.println(sum);
    }
}
