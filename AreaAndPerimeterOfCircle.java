import java.util.Scanner;
class AreaPerimeterCircle{
    double p = 3.14;
    public double perimeter(int radii){
        double peri = 2*p*radii;
        return peri;
    }
    public double area(int radii){
        double a = p*radii*radii;
        return a;
    }
}
public class circleAreaPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius of the circle: ");
        int r = sc.nextInt();
        AreaPerimeterCircle obj = new AreaPerimeterCircle();
        double area =  obj.area(r);
        System.out.println("Area of the circle: "+ area);
        double Perimeter = obj.perimeter(r);
        System.out.println("Perimeter of the circle is: "+ Perimeter);
        sc.close();
    }    
}
